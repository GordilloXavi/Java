package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EjemploAreaTexto {

	public static void main(String[] args) {


		Maroc marco = new Maroc();
		
	
	}

}
class Maroc extends JFrame{
	
	Maroc(){
		
		setBounds(1000, 400, 600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		
		LaminaBotones = new JPanel();
		
		
		
		BotonInsert = new JButton("Insertar");
		
		BotonSaltoLinea = new JButton("Salto línea");
		
		LaminaBotones.add(BotonSaltoLinea);
		
		add(LaminaBotones, BorderLayout.SOUTH);
		
		BotonInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				areaTexto.append("En un Lugar de la Mancha de cuyo nombre no quiero acordarme...");

			}
			
			
			
		});//Manera de uscar la interfaz actionListener si tener que crear una clase nueva
		//Sigo prefiriendo crear la clase, pero es una oppcion mas...
		
		LaminaBotones.add(BotonInsert);
		
		BotonSaltoLinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean saltar =! areaTexto.getLineWrap();
				
				areaTexto.setLineWrap(saltar);
				
				if(saltar) {
					BotonSaltoLinea.setText("Quitar salto de línea");
				}else {
					BotonSaltoLinea.setText("Salto línea");
				}
				
			}
			
		});
		
		areaTexto = new JTextArea(8,20);

		laminaBarras = new JScrollPane(areaTexto);
		
		add(laminaBarras, BorderLayout.CENTER);
		
		
		
		
		
		setVisible(true);

		setTitle("Profanando tumbas");
	}
	
	private JPanel LaminaBotones;
	
	private JButton BotonInsert, BotonSaltoLinea;
	
	private JTextArea areaTexto;
	
	private JScrollPane laminaBarras;

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
