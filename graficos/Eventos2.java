package graficos;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Eventos2 {

	public static void main(String[] args) {

		bentana miVentana = new bentana(500,200);
		
		
		
	}

}

class bentana extends JFrame{
	
	bentana(int w, int h){
		
		laamina lamyna = new laamina();
		
		setVisible(true);
		setBounds(1920/2-w/2, 1080/2-h/2, w,h);
		setTitle("LsetAlwaysOnTop(true);amina Eventual");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(lamyna);

	}
	
}

class laamina extends JPanel {
	
		
	JButton botonRandom = new JButton("Verde");
	
	JButton boton = new JButton("Azul");
	
	JButton boton2 = new JButton("Rojo");

	public laamina() {

	add(botonRandom);
	
	add(boton);
	
	add(boton2);
	

	
	botonRandom.addActionListener(new ColorFondo(Color.black));
	
	boton.addActionListener(new ColorFondo(Color.blue));
	
	boton2.addActionListener(new ColorFondo(Color.red));
	
	}

//Colorfondo es una clase interna de Lamyna
	
	private class ColorFondo implements ActionListener{
	
	public ColorFondo(Color c) {
		colorF = c;
	}
	
	private Color colorF;
	
	public void actionPerformed(ActionEvent e) {
		setBackground(colorF);//Podemos usar éste méodo gracias a que Color fondo
		//es una clase interna de Lamyna
	}
	
	
}
	
	

}





