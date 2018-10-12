package threads;

import java.util.concurrent.locks.*;

public class BancoThreads {

	public static void main(String[] args) {

		Banco b =new Banco();
		
		for (int i = 0; i < 100; i++) {
			
			EjecucionTransferencias r = new EjecucionTransferencias(b, i, 2000);
			
			Thread t = new Thread(r);
			
			t.start();
			
		}
	}

}

class Banco{
	

	
	public final double[] cuentas;
	
	private Lock cierreBanco = new ReentrantLock();
	
	private Condition saldoSuficiente;; 
	
	public Banco() {
		
	
		cuentas = new double[100];
		
		for(int i = 0; i<cuentas.length; i++) {
			
			cuentas[i] = 2000;
			
		}
		
		saldoSuficiente = cierreBanco.newCondition();
		
		
	}
	
	public void transferir (int origen, int destino, double cantidad)throws InterruptedException{// IMPORTANTE PARA ENTENDER!!!
				
		//https://www.youtube.com/watch?v=SajW49zuzXg&index=175&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk
		
		cierreBanco.lock(); //el codigo de try solo se puede ejecutar por un hilo a la vez
		try {
		
		while(cuentas[origen] <= cantidad) {
			
			saldoSuficiente.await();//mientras no haya suficiente dinero en la cuenta, el hilo 
			// permanece a la espera, y los otros hilos operan igualmente a pesar del lock
			
			//return;//exits the method
		}
		
		System.out.println(Thread.currentThread());
		
		cuentas[origen] -=cantidad;
		
		
		cuentas[destino] +=cantidad;
		
		System.out.println(dimeTotal());
		
		saldoSuficiente.signalAll();//despierta todos los hilos a la espera, 
		//para que vean si se ha hecho una transferencia
		
		}finally {
			
			cierreBanco.unlock();
			
			
		}
	}
	
	private double dimeTotal() {
		
		double total = 0;
		
		for (double i : cuentas) {
			total +=i;
		}
		
		return total;
	}
	
	

	
	
	
	
}

class EjecucionTransferencias implements Runnable{
	
	private Banco banco;
	
	private int cuentaOrigen;
	
	private double cantidadMaxima;
	
	public EjecucionTransferencias(Banco b, int de, double max) {
		
		banco = b;
		
		cuentaOrigen = de;
		
		cantidadMaxima = max;
		
		
		
	}
	
	

	@Override
	public void run() {
		
		try {

		while (true) {
			
			int cuentaDestino = (int)(Math.random()*100);
			
			double cantidad = (int)(cantidadMaxima*Math.random()*2000);
			
			banco.transferir( cuentaOrigen,cuentaDestino, cantidad);
			
			
				Thread.sleep((int)Math.random()*10);
			
				
		
		}
		
		
		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}