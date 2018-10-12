package poo;
import javax.swing.Timer;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.*;

public class Temporizador {

	public static void main(String[] args) {

		
		
		DameLaHora oyente =new DameLaHora();//Todas las clases tienen 
		//un constructor por defecto.
		
		Timer temporizador = new Timer(2000, oyente);
		
		temporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener.");
			
		System.exit(0);
		
		
		
	}

}

class DameLaHora implements ActionListener{//cuando tu clase implementa una interfaz,
	//tienes que volver a escribir los métodos de la interfaz dentro de la clase. 
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		
		System.out.println( ahora);
		
		Toolkit.getDefaultToolkit().beep();//Hace que pite cada vez que se ejecuta la orden.
		
		
	}
	
}

