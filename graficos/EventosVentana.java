package graficos;

import javax.swing.*;
import java.awt.event.*;

public class EventosVentana {

	public static void main(String[] args) {

		frame marco = new frame(500,200,500,200);

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame marco2 = new frame(800,600,600,350);
		
		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}
class frame extends JFrame{
	
	public frame(int w, int h,int W,int H) {
		
		setVisible(true);
		setBounds(w, h,W,H);
		
		MVentana oyente = new MVentana();

		addWindowListener(oyente);
		
	}
}

class MVentana extends WindowAdapter{

//Con esta clase solo tenemos que escribir el método que necesitamos ya que no es una interfaz.

	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada.");		
	}

}
 //Ver código de abajo para todos los métodos de eventos de vetana.















/* Ésto lo hacemos si no usamos la clase WindowAdapter, que hace que no tenamos que no
 * tengamos que implementar todos los metodos de la interfaz.

class MVentana implements WindowListener{

	//Aunque solo necesitamos un metodo, tenemos que 
	//escribir todos los metodos de la inerfaz.
	public void windowActivated (WindowEvent e) {
		System.out.println("Ventana activada!");
	}
	public void windowClosed (WindowEvent e) {
		System.out.println("La ventana 1 ha sido cerrada.");
	}
	public void windowClosing (WindowEvent e) {
		System.out.println("Adiós!!");

	}
	public void windowDeactivated (WindowEvent e) {
		System.out.println("Vuelve!");
	}
	public void windowOpened (WindowEvent e) {

		System.out.println("Hola!!");

	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana maximizada.");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada.");		
	}
	
}
 */