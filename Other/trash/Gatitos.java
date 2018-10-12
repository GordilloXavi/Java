package trash;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Gatitos {

	public static void main(String[] args) {

		Marco marco = new Marco();
		
		
	}
}

class Marco extends JFrame{
	
	Marco(){
		
		setVisible(true);
		setBounds(200, 200, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lamina s = new lamina();
		otralamina t = new otralamina();
		add(t);
		add(s);
	
		
		
		
		
	}
	
	class lamina extends JPanel{
		
		lamina(){
			CambiarColor click = new CambiarColor();
			addMouseListener(click);
			//setBackground(Color.BLACK);

		}
		
		

		
		
		class CambiarColor extends MouseAdapter{


					
			public void mouseClicked(MouseEvent e) {
				
				
				
				int r = (int)(Math.random() * 255);
				
				int g = (int)(Math.random() * 255);
				
				int b = (int)(Math.random() * 255);
				
				Color color = new Color(r,g,b);
			
				setBackground(color);
			}
			
		}
		
	}
	


	
}
class otralamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		Graphics2D j = (Graphics2D) g;
		
		Font miFuente = new Font("Arial", Font.BOLD, 10);//Fuente, tipo y tamaño
		
		j.setFont(miFuente);
		
		j.setPaint(Color.black);
	
		j.drawString("PULSA PARA CAMBIAR A UN COLOR ALEATORIO", 100, 300);
	
	}
}