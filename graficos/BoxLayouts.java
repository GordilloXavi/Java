package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class BoxLayouts {

	public static void main(String[] args) {

		new marcoBox();
		
	}

}
class marcoBox extends JFrame{
	
	marcoBox(){
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1000,400, 200,200);
		
		//*****
		
		JLabel rotulo1 = new JLabel("Nombre");
		
		JTextField texto1 = new JTextField(10);
		
		texto1.setMaximumSize(texto1.getPreferredSize());
		
		Box cajaH1 = Box.createHorizontalBox();//Crea un contenedor (parecido a un JPanel) en el que los elementos que le metamos se van a ir ordenando de manera horizontal.
		
		cajaH1.add(rotulo1);
		
		cajaH1.add(Box.createHorizontalStrut(10));//establece la distancia horizontal entre los componentes de la caja.

		cajaH1.add(texto1);
		
		//**********
		
		JLabel rotulo2 = new JLabel("Contraseña");
		
		JPasswordField texto2 = new JPasswordField(10);
		
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		Box cajaH2 = Box.createHorizontalBox();
		
		cajaH2.add(rotulo2);
		
		cajaH2.add(Box.createHorizontalStrut(10));
		
		cajaH2.add(texto2);
		
		//**********
		
		JButton boton1 = new JButton("ok");
		
		JButton boton2 = new JButton("cancelar");
		
		Box cajaH3 = Box.createHorizontalBox();
		
		cajaH3.add(boton1);
		
		cajaH3.add(Box.createGlue());//Hace que se adapte la distancia entre los componentes de la caja cuando
		//Redimensionamos el marco.
		
		cajaH3.add(boton2);
		
		//*******
		//Creamos un contenedor vertican que ocupa todo el marco, y ahí estarán colocados los otros 3 boxes que hemos creado, uno encima del otro
		
		Box cajaVert = Box.createVerticalBox();
		
		cajaVert.add(cajaH1);
		
		cajaVert.add(cajaH2);

		cajaVert.add(cajaH3);
		
		//******************
		
		add(cajaVert);
		//Agregamos la caja al marco
		
		
		
		
		setVisible(true);

	}
	

}
