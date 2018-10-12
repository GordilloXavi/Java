package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CalculadoraLayout {

	public static void main(String[] args) {
		
		MarcoCalc Marco = new MarcoCalc(300,200);//Gracias a pack(), los modificadores de tamaño son inútiles.
		
		

	}

}
class MarcoCalc extends JFrame{
	
	public MarcoCalc(int w, int h){
		
		setTitle("Calculadora");
		setVisible(true);
		setBounds(1920/2-w/2, 1080/2-h/2, w,h); //Ya no te necesito, gracias a pack() !!
		setAlwaysOnTop(true);
		setLocation(1920/2- getWidth()/2, 1080/2-getHeight()/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaCalc Lamina1 = new LaminaCalc();
		
		add(Lamina1);
		
		setResizable(false);
		
		//pack();//Ajusta el frame al tamaño ideal en base a lo que le hayas metido.
		
		
	}
	
}
class LaminaCalc extends JPanel{
	
	private String ultimaOperacion;
	
	private JPanel Lamina2;
	
	private JButton BotonPantalla;
	
	private double resultado;
	
	boolean principio;
	
	public LaminaCalc() {
		
		principio = true;
		
		setLayout(new BorderLayout());
		
		BotonPantalla = new JButton("0");
		
		BotonPantalla.setEnabled(false);
		
		add(BotonPantalla, BorderLayout.NORTH);//Como todavia no sabemos hacer un display, 
		//Usaremos un botón para mostrar los resultados, pero desactivamos el botón para que no 
		//pueda ser pulsado.
		
		JButton clear = new JButton("C");
		
		ActionListener borrar = new BorraNumeros();
		
		clear.addActionListener(borrar);
		
		add(clear,BorderLayout.EAST);
		
		Lamina2 = new JPanel();
		
		Lamina2.setLayout(new GridLayout(4,4,1,1));//numero de filas y columnas y 1 pixel de separación entre botones
		
		ActionListener insertar = new InsertaNumero();
		
		ActionListener orden = new AccionOrden();
		
		
		
		ponerBoton("7", insertar);
		
		ponerBoton("8", insertar);
		
		ponerBoton("9", insertar);
		
		ponerBoton("/",orden);
		
		ponerBoton("4", insertar);
		
		ponerBoton("5", insertar);
		
		ponerBoton("6", insertar);
		
		ponerBoton("*",orden);
		
		ponerBoton("1", insertar);
		
		ponerBoton("2", insertar);
		
		ponerBoton("3", insertar);
		
		ponerBoton("-",orden);
		
		ponerBoton("0", insertar);
		
		ponerBoton(".",orden);
		
		ponerBoton("=",orden);
		
		ponerBoton("+",orden);
		
		ultimaOperacion = "=";
		
		add(Lamina2, BorderLayout.CENTER);
		
		
	}
	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton(rotulo);
		
		Lamina2.add(boton);
				
		boton.addActionListener(oyente);
				
	}
	
	class InsertaNumero implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			/*Pequeño código alternativo del que estoy orgulloso:		
			JButton boton = (JButton) e.getSource();
			String entrada = boton.getText();	*/
			
			
			String entrada = e.getActionCommand();//Almacena el texto el botón.

			if (principio) {
				BotonPantalla.setText("");
				principio = false;
			}
			BotonPantalla.setText(BotonPantalla.getText() + entrada);
		}
		
		
	}
	
private class BorraNumeros implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			BotonPantalla.setText("0");
			principio = true;
			resultado = 0;
		}
	
}
private class AccionOrden implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		String operacion = e.getActionCommand();
		
		//System.out.println(operacion);
		
		ultimaOperacion = operacion;
		
		calcular(Double.parseDouble(BotonPantalla.getActionCommand()));
		
		principio = true;

		
	}
	
	public void calcular(double x) {
		
		if(ultimaOperacion.equals("+")) {
			resultado += x;
			System.out.println(resultado);
		}else if(ultimaOperacion.equals("-")) {
			resultado -= x;
		}else if(ultimaOperacion.equals("*")) {
			resultado *= x;
		}else if(ultimaOperacion.equals("/")) {
			resultado /= x;
		}else if (ultimaOperacion.equals("=")) {
			resultado = x;
		}
		BotonPantalla.setText("" + resultado);
	}
}


	
}
	





