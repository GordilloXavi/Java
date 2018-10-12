package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BotonesRadioEjemplo {

	public static void main(String[] args) {

		new Marco5();

		
		//Al final hay una manera alternativa de escribir el programa, más fácil pero con más código.
	}

}

class Marco5 extends JFrame{
	
	Marco5(){
		
		setTitle("GAINZ");
		
		setVisible(true);
		
		setBounds(1150, 500, 500, 300);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		LaminaRadioo milamina = new LaminaRadioo();
		
		add(milamina);
	}
	
}
class LaminaRadioo extends JPanel{
	
	private JRadioButton boton12, boton20, boton28, boton40;
	
	private JLabel mensaje;
	
	private ButtonGroup grupo;
	
	private JPanel laminaBotones;
	

	LaminaRadioo(){
			
		setLayout(new BorderLayout());

		mensaje = new JLabel("GAINZ");
		
		mensaje.setFont(new Font("Serif", Font.PLAIN, 12));
		
		add(mensaje, BorderLayout.CENTER);
		
		laminaBotones = new JPanel();
		
		grupo = new ButtonGroup();

		colocar_botones("Pequeño", true, 12);
		
		colocar_botones("Mediano", false, 20);
		
		colocar_botones("Grande", false, 28);
		
		colocar_botones("Muy grande", false, 150);
		
		add(laminaBotones, BorderLayout.SOUTH);
		
	}
	
	public void colocar_botones(String nombre, boolean activado, final int tamano) {
		
		JRadioButton boton = new JRadioButton(nombre, activado);
		
		grupo.add(boton);
		
		laminaBotones.add(boton);
		
		ActionListener mievento = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				mensaje.setFont(new Font("Serif", Font.PLAIN, tamano));				
			}  
			};
			
			boton.addActionListener(mievento);
			
	}
	}
		








//MANERA LARGA DE HACER EL PROGRAMA. MÁS FÁCIL PERO CON MÁS CÓDIGO... : 
/*
class Marco5 extends JFrame{
	
	Marco5(){
		
		setVisible(true);
		
		setBounds(1150, 500, 500, 300);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		LaminaRadioo milamina = new LaminaRadioo();
		
		add(milamina);
	}
	
}
class LaminaRadioo extends JPanel{
	
	JRadioButton boton12;
	
	JRadioButton boton20;
	
	JRadioButton boton28;
	
	JRadioButton boton40;

	
	JLabel mensaje;
	
	

	LaminaRadioo(){
		
		//setLayout(new BorderLayout());
		
		ButtonGroup grupo = new ButtonGroup();
		
		boton12 = new JRadioButton("Pequeño");
		
		boton20 = new JRadioButton("Mediano");

		boton28 = new JRadioButton("Grande");
		
		boton40 = new JRadioButton("fUCKING HUGE BRAHHH!!!");
		
		mensaje = new JLabel("GAINZ");
		
		add(mensaje);
		
		mensaje.setFont(new Font("Arial", Font.PLAIN, 12));
		
		grupo.add(boton12);
		
		grupo.add(boton20);

		grupo.add(boton28);
		
		grupo.add(boton40);
		
		boton12.addActionListener(new Ebento());
		
		boton20.addActionListener(new Ebento());

		boton28.addActionListener(new Ebento());

		boton40.addActionListener(new Ebento());


		add(boton12);
		
		add(boton20);

		add(boton28);
		
		add(boton40);


		
	}
	
	class Ebento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == boton12) {
				mensaje.setFont(new Font("Arial", Font.PLAIN, 12));
			}else if(e.getSource() == boton20) {
				mensaje.setFont(new Font("Arial", Font.PLAIN, 20));
			}else if (e.getSource() == boton28){
				mensaje.setFont(new Font("Arial", Font.PLAIN, 28));

			}else {
				mensaje.setFont(new Font("Arial", Font.PLAIN, 70));

			}
			
		}
		
	}
	
}*/
