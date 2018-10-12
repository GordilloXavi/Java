package practicas;

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
	
	JRadioButton mensaje;
	
	JRadioButton confirmar;
	
	JRadioButton opcion;
	
	JRadioButton entrada;
	
	//
	
	JRadioButton error_message;
	
	JRadioButton information_message;
	
	JRadioButton warning_message;
	
	JRadioButton question_message;
	
	JRadioButton plain_message;
	
	//
	
	JRadioButton cadena;
	
	JRadioButton icono;
	
	JRadioButton componente;
	
	JRadioButton otros;
	
	JRadioButton object;
	
	//
	
	JRadioButton default_option;
	
	JRadioButton yes_no_option;
	
	JRadioButton yes_no_cancel_option;
	
	JRadioButton ok_cancel_option;
	//
	
	JRadioButton string;
	
	JRadioButton icon;
	
	JRadioButton object2;
	
	//
	
	JRadioButton campo_de_texto;
	
	JRadioButton combo;
	
	
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
		
		mensaje = new JRadioButton("Mensaje", true);
		
		confirmar = new JRadioButton("Confirmar");

		opcion = new JRadioButton("Opción");

		entrada = new JRadioButton("Entrada");

		
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
		
		error_message = new JRadioButton("ERROR_MESSAGE", true);
		
		information_message = new JRadioButton("INFORMATION_MESSAGE");

		warning_message = new JRadioButton("WARNING_MESSAGE");
		
		question_message = new JRadioButton("QUESTION_MESSAGE");

		plain_message = new JRadioButton("PLAIN_MESSAGE");

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
		
		cadena = new JRadioButton("Cadena", true);
		
		icono = new JRadioButton("Icono");

		componente = new JRadioButton("Componente");
		
		otros = new JRadioButton("Otros");

		object = new JRadioButton("Object[]");

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
		
		default_option = new JRadioButton("DEFAULT_OPTION", true);
		
		yes_no_option = new JRadioButton("YES_NO_OPTION");

		yes_no_cancel_option = new JRadioButton("YES_NO_CANCEL_OPTION");

		ok_cancel_option = new JRadioButton("OK_CANCEL_OPTION");

		
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
		
		string = new JRadioButton("String[]", true);
		
		icon = new JRadioButton("Icon[]");

		object2 = new JRadioButton("Object[]");


		
		grupo5.add(string);
		
		grupo5.add(icon);
		
		grupo5.add(object2);
		
		
		caja5.add(string);

		caja5.add(icon);
		
		caja5.add(object2);
		
		//**********CAJA6
		
		caja6.setBorder(BorderFactory.createTitledBorder("Entrada"));
		
		ButtonGroup grupo6 = new ButtonGroup();
		
		campo_de_texto = new JRadioButton("Campo de texto", true);
		
		combo = new JRadioButton("Combo");



		
		grupo6.add(campo_de_texto);
		
		grupo6.add(combo);
		
		
		
		caja6.add(campo_de_texto);

		caja6.add(combo);
		

		
		
		
	}
	
	
	private class AccionButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e ) {
			
			if(mensaje.isSelected()) {
				
				
				
				
				
				
				JOptionPane.showMessageDialog(Lafina.this, "Mensaje", "Mensaje", 0);
				
				
				
				
				
				
			}else if(confirmar.isSelected()) {
				JOptionPane.showConfirmDialog(Lafina.this, "Hola");
			}else if(opcion.isSelected()) {
				//JOptionPane.showOptionDialog(Lafina.this, "Hola", "", 1, 1, new ImageIcon(), 7, 7);
			}else {
				JOptionPane.showInputDialog("Hola");
			}
			
			
		}
		
		
	}
	
	
}