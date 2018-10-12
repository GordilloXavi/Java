package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComboBox {

	public static void main(String[] args) {

		new MarcoComboBox();
		
	}

}
class MarcoComboBox extends JFrame{
	
	MarcoComboBox(){
		
		setBounds(1200, 450, 200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new LaminaComboBox());
		setVisible(true);

	}
}

class LaminaComboBox extends JPanel{
	
	private JLabel texto;
	
	private JComboBox micombo;
	
	public LaminaComboBox(){
		
		System.out.println("Puedes escribr un tipo de letra en el combo box (Arial, por ejemplo)");
		System.out.println("y si lo has escrito bien, se cambiará a esa letra.");
		setLayout(new BorderLayout());
		
		texto = new JLabel("GAINZZZ");
		
		texto.setFont(new Font("Courier", Font.PLAIN, 18));
		
		add(texto, BorderLayout.CENTER);
		
		JPanel laminanorte = new JPanel();
		
		micombo = new JComboBox();
		
			
		micombo.addItem("Serif");
		
		//micombo.addItem("Arial");//TIPOS DE FUENTES DE WINDOWS...
		
		micombo.addItem("Verdana");
		
		micombo.addItem("Monospaced");
		
		micombo.addItem("Dialog");

		micombo.setEditable(true);//Hace que se pueda escribir en el combobox. 

		EventoCombo evento = new EventoCombo();
		
		micombo.addActionListener(evento);
		
		laminanorte.add(micombo);
		
		add(laminanorte, BorderLayout.NORTH);
		
	}
	
	private class EventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN, 18));
			
		}
		
	}
	
	
	
}