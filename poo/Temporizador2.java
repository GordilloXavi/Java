package poo;
import javax.swing.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Temporizador2 {

	public static void main(String[] args) {
		
		double a;
		
		do {

		a = Double.parseDouble(JOptionPane.showInputDialog("Cada cuantos segundos"
				+ " quieres que te muestre la hora?"));
		
		
		
		}while(a < 0.7);
		
		int b = (int)(a*1000);
		
		String c = JOptionPane.showInputDialog("Quieres una notificación cuando aparezca la"
				+ " hora?");
		
		boolean d;
		
		if (c.equalsIgnoreCase("si") || c.equalsIgnoreCase("sí")) {
			d = true;
		}else {
			d=false;
		}
		
		
		Reloj x = new Reloj(b, d);
		
		
		
		x.iniciar();
		
		x.dimesonido();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para finalizar el programa");
		
		System.exit(0);
	}

}

class Reloj{
	
	public Reloj(int intervalo, boolean sonido){
		
		this.intervalo = intervalo;
		this.sonido = sonido;
		
		
	}
	
	public void iniciar() {
		
		DameLaHora2 oyente = new DameLaHora2();
		
		Timer mitemporizador = new Timer(intervalo, oyente);
	
		mitemporizador.start();
		
		
	}
	
	public boolean dimesonido() {
		return sonido;
	}
	
	
	private int intervalo;
	private boolean sonido;
	    
	
	private class DameLaHora2 implements ActionListener{
		/*La clase DameLaHora2 está dentro de la clase Reloj.
		ésto es una clase interna. 
		si metemos la clase DameLaHora2 dentr del MÉTODO iniciar, tenemos lo que se llama una 
		clase interna local.
		*/
		
		public void actionPerformed(ActionEvent e) {
			
			Date ahora = new Date();
			
			System.out.println("Te digo la hora cada " + (double)intervalo/1000 + " segundos:"
			+ ahora);
					
			if (sonido) {//si la clase DameLaHora2 no estuviera dentro de Reloj, 
				//no podríamos acceder a la variable sonido ni a la variable intervalo!!
				Toolkit.getDefaultToolkit().beep();
			}
				
			
		}
		
	}

}






