package graficos;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class EventosTeclado {

	public static void main(String[] args) {

		HacerMarco marco = new HacerMarco();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		evento teclapulsada = new evento();
		
		marco.addKeyListener(teclapulsada);
		
		
	}

}

class HacerMarco extends JFrame{
	
	HacerMarco(){
		setVisible(true);
		setBounds(500,500, 600,300);
		
		
		
		
	}
}

class evento implements KeyListener{

	
	public void keyPressed(KeyEvent e) {

		if(e.getKeyChar() == ' ') {
		//System.out.println("Has pulsado la barra espaciadora.");
			System.out.println("Mama eres muy guapa.");
		}else if (e.getKeyChar() == 'j') {
			System.out.println("Has pulsado la tecla J.");
		}
	}

	
	public void keyReleased(KeyEvent e) {
		if (e.getKeyChar() != ' ' && e.getKeyChar() != 'j') {
			
		//System.out.println("Has soltado la tecla.");
		
		
		}
	}

	
	public void keyTyped(KeyEvent e) {
		
		char letra = e.getKeyChar();
		
		if (e.getKeyChar() != ' ' && e.getKeyChar() != 'j') {
		
		System.out.println("Has pusado la tecla " + letra + ".");
			
		}
	}
	
	
}