package graficos;

import javax.swing.*;

public class BotonesRadio {

	public static void main(String[] args) {

		new MarcoRadio();
	}

}

/* 
 * LA DIFERENCIA ENTRE UN CHECK BUTTON Y UN RADIO BUTTON ES QUE SI VARIOS RADIOBUTTON PERTENECEN
 * A UN GRUPO (Clase ButtonGroup), SOLO UNO DE ELLOS PUEDE ESTAR SELECCIONADO A LA VEZ (COMO EN UN FORMULARIO)
 */

class MarcoRadio extends JFrame{
	
	MarcoRadio(){
		
		setBounds(1000, 400, 600, 300);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		add(new LaminaRadio());
		
	}
}
class LaminaRadio extends JPanel{
	
	JRadioButton boton1;
	
	JRadioButton boton2;
	
	JRadioButton boton3;

	JRadioButton botonMasc;
	
	JRadioButton botonFem;
	
	LaminaRadio(){
		
		
		ButtonGroup grupoColor = new ButtonGroup();//poner varios botones en un grupo hace que solo 
		//Se pueda selaccionar uno de ellos. Si quitamos esto, se pueden seleccionar varios a la vez.
		
		ButtonGroup grupoGenero = new ButtonGroup();
		
		boton1 = new JRadioButton("Azul");
		
		boton2 = new JRadioButton("Verde");
		
		boton3 = new JRadioButton("Rojo");
		
		botonMasc = new JRadioButton("Masculino");
		
		botonFem = new JRadioButton("Femenino");

		grupoGenero.add(botonMasc);
		
		grupoGenero.add(botonFem);

		grupoColor.add(boton1);
		
		grupoColor.add(boton2);
		
		grupoColor.add(boton3);

		
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
		add(botonMasc);
		
		add(botonFem);

		
	}
}