package trash;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RandomProblem {
	
	public static void main(String[] args) {
		
		Marruecos MarcoXavi = new Marruecos();
		

	}

}

class Marruecos extends JFrame{
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	
	int h = 500;
	
	int w = 1000;
	
	public Marruecos() {
		
		setBounds(0, 0, (int)width, (int)height);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new Panel());
		
		setVisible(true);
		
		
		
		
	}
	
	int r = 1;
	
	int y = 1;
	
	boolean invertir;


	
	class reducir implements ActionListener{
		
		boolean invertir ;
		

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			

			setSize((int)(width - y), (int)(height-r));
			
			r++;
			
			y+=2;
			
			
			
			
		}
		
		
		
	}
	
	class Panel extends JPanel{
		
		JButton boton = new JButton("Do not press");
		
		public Panel() {
			
			setLayout(null);
			
			add(boton);
			
			boton.setBounds(0, 0, 260, 20);
			
			boton.addActionListener(new AccionBoton());
			
			
			
		}
		
		Timer animation = new Timer(10, new reducir());

		class AccionBoton implements ActionListener{
			
			

			@Override
			public void actionPerformed(ActionEvent e) {

				
				if(invertir) {
				animation.start();
				
				}else {
					animation.stop();
				}
				
				invertir= !invertir;
			
			}
			
			
		}
		
		
		
	}
	
	
	
}



