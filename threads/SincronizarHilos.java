package threads;

public class SincronizarHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HilosVarios  hilo1 = new HilosVarios();
		
		HilosVarios2 hilo2 = new HilosVarios2(hilo1);
		
		hilo2.start();
		
		hilo1.start();
			/*	
		try {
			hilo1.join();//no deja que se ejecute nada hasta que el hilo muera
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		
		//si no sincronizamos los threads usando join(), éstos se van intercalando. 
		
	}

}
class HilosVarios extends Thread{//otra manera de hacer threads es crear una clase que herede de thread
	
	public void run() {
		
		for(int i = 0; i<5; i++) {
			
			
			
			System.out.println("Ejecutando hilo" + getName());
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class HilosVarios2 extends Thread{//otra manera de hacer threads es crear una clase que herede de thread
	
	private Thread hilo;
	
	public HilosVarios2(Thread hilo){
		
		this.hilo = hilo;
		
	}
	
	
	public void run() {
		
		try {
			hilo.join();//hace una pausa hasta que muera el hilo
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i = 0; i<5; i++) {
			
			
			
			System.out.println("Ejecutando hilo" + getName());
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}