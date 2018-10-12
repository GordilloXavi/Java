package trash;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjercicioPrueba {

	public static void main(String[] args) {

		new Marcoo();
		
		
	}

}
class Marcoo extends JFrame{
	
	Marcoo(){
		setBounds(1000, 400, 200, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		add(new Laminaa());
		setVisible(true);

	}
}
class Laminaa extends JPanel{
	
	static JTextField kampo;
	
	static JButton botoncontador;
	
	Laminaa(){
		
		
		add(new JLabel("Counter:"));
		
		kampo = new JTextField("0",4);
		
		kampo.setEditable(false);
		
		add(kampo);
		
		botoncontador = new JButton("Count");
		add(botoncontador);
		botoncontador.addActionListener(new ebentos());
		
		JButton botoncrrar = new JButton("Cerrar programa");
		add(botoncrrar);
		botoncrrar.addActionListener(new ebentos());
	}
	
}
class ebentos implements ActionListener{


	int cuenta = 0;
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == Laminaa.botoncontador ) {

		Laminaa.kampo.setText(Integer.toString(cuenta));

		cuenta++;
		}else {
			System.exit(0);
		}
		
		
	}
	
}
