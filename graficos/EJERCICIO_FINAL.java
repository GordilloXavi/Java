package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EJERCICIO_FINAL {

	public static void main(String[] args) {

		new Marfo();
	}

}
class Marfo extends JFrame{
	
	Marfo(){
		
		
		
		setBounds(1000, 400, 580, 400);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		add(new Lafina());		
		
		setVisible(true);
		
		
		
	}
}
class Lafina extends JPanel{
	
	JButton boton;
	
	Lafina(){
		
		setLayout(new BorderLayout());
		
		JPanel laminaBot = new JPanel();
		
		boton = new JButton("Mostrar");
		
		boton.addActionListener(new AccionButton());
		
		laminaBot.add(boton);
		
		add(laminaBot, BorderLayout.SOUTH);
		
		//****************************
		
		JPanel laminaMain = new JPanel();
		
		laminaMain.setLayout(new GridLayout(2,3));
		
		Box caja1 = Box.createVerticalBox();
		
		Box caja2 = Box.createVerticalBox();
		
		Box caja3 = Box.createVerticalBox();
		
		Box caja4 = Box.createVerticalBox();
		
		Box caja5 = Box.createVerticalBox();
		
		Box caja6 = Box.createVerticalBox();
	
		
		laminaMain.add(caja1);
		
		laminaMain.add(caja2);

		laminaMain.add(caja3);

		laminaMain.add(caja4);

		laminaMain.add(caja5);

		laminaMain.add(caja6);

		add(laminaMain, BorderLayout.CENTER);
		
		//**********CAJA1
		
		caja1.setBorder(BorderFactory.createTitledBorder("Tipo"));
				
		ButtonGroup grupo1 = new ButtonGroup();
		
		JRadioButton mensaje = new JRadioButton("Mensaje", true);
		
		JRadioButton confirmar = new JRadioButton("Confirmar");

		JRadioButton opcion = new JRadioButton("Opción");

		JRadioButton entrada = new JRadioButton("Entrada");

		
		grupo1.add(mensaje);
		
		grupo1.add(confirmar);
		
		grupo1.add(opcion);
		
		grupo1.add(entrada);
		
		caja1.add(mensaje);

		caja1.add(confirmar);
		
		caja1.add(opcion);
		
		caja1.add(entrada);
		
		//**********CAJA2
		
		caja2.setBorder(BorderFactory.createTitledBorder("Tipo de mensaje"));

		ButtonGroup grupo2 = new ButtonGroup();
		
		JRadioButton error_message = new JRadioButton("ERROR_MESSAGE", true);
		
		JRadioButton information_message = new JRadioButton("INFORMATION_MESSAGE");

		JRadioButton warning_message = new JRadioButton("WARNING_MESSAGE");
		
		JRadioButton question_message = new JRadioButton("QUESTION_MESSAGE");

		JRadioButton plain_message = new JRadioButton("PLAIN_MESSAGE");

		grupo2.add(error_message);
		
		grupo2.add(information_message);
		
		grupo2.add(warning_message);
		
		grupo2.add(question_message);
		
		grupo2.add(plain_message);
		
		caja2.add(error_message);
		
		caja2.add(information_message);
		
		caja2.add(warning_message);
		
		caja2.add(question_message);
		
		caja2.add(plain_message);
		
		
		
		//**********CAJA3
		
		caja3.setBorder(BorderFactory.createTitledBorder("Mensaje"));

		ButtonGroup grupo3 = new ButtonGroup();
		
		JRadioButton cadena = new JRadioButton("Cadena", true);
		
		JRadioButton icono = new JRadioButton("Icono");

		JRadioButton componente = new JRadioButton("Componente");
		
		JRadioButton otros = new JRadioButton("Otros");

		JRadioButton object = new JRadioButton("Object[]");

		grupo3.add(cadena);
		
		grupo3.add(icono);
		
		grupo3.add(componente);
		
		grupo3.add(otros);
		
		grupo3.add(object);
		
		caja3.add(cadena);
		
		caja3.add(icono);
		
		caja3.add(componente);
		
		caja3.add(otros);
		
		caja3.add(object);
		
		
		//**********CAJA4
		
		caja4.setBorder(BorderFactory.createTitledBorder("Confirmar"));

		ButtonGroup grupo4 = new ButtonGroup();
		
		JRadioButton default_option = new JRadioButton("DEFAULT_OPTION", true);
		
		JRadioButton yes_no_option = new JRadioButton("YES_NO_OPTION");

		JRadioButton yes_no_cancel_option = new JRadioButton("YES_NO_CANCEL_OPTION");

		JRadioButton ok_cancel_option = new JRadioButton("OK_CANCEL_OPTION");

		
		grupo4.add(default_option);
		
		grupo4.add(yes_no_option);
		
		grupo4.add(yes_no_cancel_option);
		
		grupo4.add(ok_cancel_option);
		
		caja4.add(default_option);

		caja4.add(yes_no_option);
		
		caja4.add(yes_no_cancel_option);
		
		caja4.add(ok_cancel_option);
		
		
		
		//**********CAJA5
		
		caja5.setBorder(BorderFactory.createTitledBorder("Opción"));

		ButtonGroup grupo5 = new ButtonGroup();
		
		JRadioButton string = new JRadioButton("String[]", true);
		
		JRadioButton icon = new JRadioButton("Icon[]");

		JRadioButton object2 = new JRadioButton("Object[]");


		
		grupo5.add(string);
		
		grupo5.add(icon);
		
		grupo5.add(object2);
		
		
		caja5.add(string);

		caja5.add(icon);
		
		caja5.add(object2);
		
		//**********CAJA6
		
		caja6.setBorder(BorderFactory.createTitledBorder("Entrada"));
		
		ButtonGroup grupo6 = new ButtonGroup();
		
		JRadioButton campo_de_texto = new JRadioButton("Campo de texto", true);
		
		JRadioButton combo = new JRadioButton("Combo");



		
		grupo6.add(campo_de_texto);
		
		grupo6.add(combo);
		
		
		
		caja6.add(campo_de_texto);

		caja6.add(combo);
		

		
		
		
	}
	
	
	private class AccionButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
			
			
		}
		
		
	}
	
	
}