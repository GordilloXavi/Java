package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class EventosVentana2 {

	public static void main(String[] args) {
	
		ElMarco marco = new ElMarco();

		
	}

}

class ElMarco extends JFrame{
	
	public ElMarco() {
		
	setVisible(true);
		
	setBounds(1920/2-250, 540-150,500,300);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	CambioEstado notificacionEstado = new CambioEstado();
	
	addWindowStateListener(notificacionEstado);
	
	
	}
	
}


class CambioEstado implements WindowStateListener{


	public void windowStateChanged(WindowEvent e) {
	
		System.out.print("El estado de la ventana ha cambiado(");
		
		System.out.println(e.getNewState() + ").");//Devuelve un número que representa 
		//el estado actual de la ventana
		
		
		if(e.getNewState() == Frame.MAXIMIZED_BOTH) {//poner Frame.MAXIMIZED_BOTH es lo mismo
			//que poner el número 6.
			System.out.println("La ventana ha sido maximizada.");
		}
	}
	
	
	
}