package graficos;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Eventos1 {

	
	//SI NO TE QUEDA CLARO COMO FUNCIONAN LOS EVENTOS, MIRA ÉSTE VÍDEO:
	// https://www.youtube.com/watch?v=hgHvmjyHxpU&index=71&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk	
	
	
	public static void main(String[] args) {

		
	Marko marko = new Marko(500,200);
		
		
	}

}

class Marko extends JFrame{
	
	Marko(int w, int h){
		
		Lamyna lamyna = new Lamyna();
		
		setVisible(true);
		setBounds(1920/2-w/2, 1080/2-h/2, w,h);
		setTitle("LsetAlwaysOnTop(true);amina Eventual");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(lamyna);

	}
	
}

class Lamyna extends JPanel implements ActionListener{

	
	JButton botonRandom = new JButton("Cambiar a color aleatorio");
	
	JButton boton = new JButton("Botón ejemplo");
	
	JButton boton2 = new JButton("Botón ejemplo 2");
	
	public Lamyna() {

	add(botonRandom);
	
	add(boton);
	
	add(boton2);
	
	botonRandom.addActionListener(this);/*En el campo ActionListener metemos el objeto que 
	Recibe la acción, en este caso la lámina. 
	This se refiere al objeto en el que estamos.
	 En	este caso, la acción la recible la lámina (que va a cambiar de color).*/
	
	boton.addActionListener(this);
	
	boton2.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado = e.getSource();//Ésto sirve para identificar QUÉ BOTÓN ESTÁ
		//siendo pulsado, porque sino todos los botones harían lo mismo.
		
		if(botonPulsado == botonRandom) {
		
			//Acciones a llevar a cabo cuando se pulsa boton de cambio de color:
			
			int o =(int) (Math.random()*10);//Cambia el color entre 10 colores basado
			//en un numero random		
			if(o == 1) {
				setBackground(Color.black);
			}else if(o == 2) {
				setBackground(Color.blue);
			}else if(o == 3) {
				setBackground(Color.CYAN);
			}else if(o == 4) {
				setBackground(Color.DARK_GRAY);
			}else if(o == 5) {
				setBackground(Color.gray);
			}else if(o == 6) {
				setBackground(Color.green);
			}else if(o == 7) {
				setBackground(Color.MAGENTA);
			}else if(o == 8) {
				setBackground(Color.ORANGE);
			}else if(o == 9) {
				setBackground(Color.pink);
			}else if(o == 0) {
				setBackground(Color.YELLOW);		
			}else {
				setBackground(Color.white);
			}
			
			
		}else if(botonPulsado == boton) {
			
			System.out.print("Algo");
			
			
		}else  if(botonPulsado == boton2) {
			
			System.out.println("Aquí se puede hacer otra cosa más currada");
			
		}
		
		
	}
}











/*
 * 		Color a = this.getBackground();
		
		if(a !=  Color.blue){
			setBackground(Color.blue);
		}else{
			setBackground(Color.white);
		}
		*/
