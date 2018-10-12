package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JsliderEjemplo {

	public static void main(String[] args) {

		new MarcoSlide();
	}

}
class MarcoSlide extends JFrame{
	
	MarcoSlide(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 400, 500, 230);
		add(new PanelSlide());
		setResizable(true);
		setVisible(true);

	}
}
class PanelSlide extends JPanel{
	
	public JSlider slider1;
	
	public JLabel mensag;
	
	public PanelSlide(){
		setLayout(new BorderLayout());
		
		slider1 = new JSlider(10,300,30);
		
		slider1.addChangeListener(new tamano());//NO USAMOS ACTION LISTENER, SINO CHANGE LISTENER!!

		JPanel laminaMensaje = new JPanel();
		
		mensag = new JLabel("Hola patricio");
		
		laminaMensaje.add(mensag);
		
		
		
		add(laminaMensaje, BorderLayout.SOUTH);
		
		parametros();
		
		
	}
	
	public void parametros() {

		
		slider1.setMajorTickSpacing(10);
		slider1.setPaintLabels(true);
		//slider1.setPaintTicks(true);
		add(slider1, BorderLayout.NORTH);

	}
	
	class tamano implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {

			mensag.setFont(new Font("Arial", Font.PLAIN, slider1.getValue()));

		}

	
		
	}
	
}

