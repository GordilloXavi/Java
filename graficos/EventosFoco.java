package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EventosFoco {

	public static void main(String[] args) {

		marco01 mimarco = new marco01();
		
		LaminaFoco lamina = new LaminaFoco();
			
		mimarco.add(lamina);
		
	}

}


class marco01 extends JFrame{
	
	public marco01(){
		
		setVisible(true);
		
		setBounds(300,300,600,450);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
}

class LaminaFoco extends JPanel{
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		
		setLayout(null); //éste método evita que los componentes swing que añadimos (botones,
		//cuadros de texto, etc) aparezcan en una ubicación por defecto.
		
		cuadro1 = new JTextField();
		
		cuadro2 = new JTextField();
		
		cuadro1.setBounds(120, 10, 150, 20);
		
		cuadro2.setBounds(120, 50, 150, 20);
		
		add(cuadro1);
		
		add(cuadro2);
		
		Focos evento = new Focos();
		
		cuadro1.addFocusListener(evento);
	
	}
	
	JTextField cuadro1;
	JTextField cuadro2;
	
	private class Focos implements FocusListener{

		
		public void focusGained(FocusEvent e) {
			System.out.println("Introduce el correo.");
		}

		
		public void focusLost(FocusEvent e) {
			
			String email = cuadro1.getText(); //Método de la clase JTextField que nos devuelve
			//lo que hemos escrito en el cuadro de texto.
			
			int arrobas = 0;
			int puntos = 0;
			
			for(int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '.') {
					puntos++;
				}else if (email.charAt(i) == '@') {
					arrobas++;
				}
			}
			if (arrobas == 1 && puntos == 1) {
				System.out.println("E-Mail  correcto.");
			}else {
				System.out.println("E-Mail incorrecto. Vuelve a introducir el E-Mail.");
			}
		}
	}
	
}
	









/*CLASE MUY SIMPLE DE EJEMPLO
 * private class Focos implements FocusListener{

		
		public void focusGained(FocusEvent e) {
			System.out.println("Cuadro 1 seleccionado");
		}

		
		public void focusLost(FocusEvent e) {
			System.out.println("El cuadro ya no está seleccionado.");
		}
		
		
	}
	*/
 


