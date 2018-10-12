package graficos;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinners {

	public static void main(String[] args) {

		new MarcoSpinner();
	}

}

class MarcoSpinner extends JFrame{
	MarcoSpinner(){
		setBounds(1250, 550, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new LaminaSpinner());
		setVisible(true);
	
	}
	
}
class LaminaSpinner extends JPanel{
	
	private JSpinner spinner;
	
	private JSpinner spinner2;
	
	private JSpinner spinner3;
	
	private JSpinner spinner4;
	
	private JLabel mensaje;
	
	LaminaSpinner(){
		
		setLayout(new BorderLayout());
		
		JPanel PanelSpinners = new JPanel();
		
		
		
		mensaje = new JLabel("FUENTES!");
		
		String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		String[] lista = {"Enero","Febrero","Marzo","Abril"};
		
		spinner = new JSpinner(new SpinnerListModel(fonts));//Para que el spinner muestre los 
		//elementos de un array.
		
		spinner2 = new JSpinner(new SpinnerListModel(lista));
		
		
		
		spinner3 = new JSpinner(new SpinnerDateModel());//Para que el  spinner te muestre la fecha actual
		
		spinner2.setPreferredSize(new Dimension(70,20));
		
		spinner4 = new JSpinner(new SpinnerNumberModel(0,-50 ,50,5));//constructor:
		//valor inicial, min, max, y de cuanto en cuanto aumenta (de 5 en 5 en este caso)
		
		spinner.setPreferredSize(new Dimension(150,20));//Para darle tamaño hay que ponerele un objeto
		//de tipo dimension
		
		spinner.addChangeListener(new EventoSpinner());
		
		mensaje.setFont(new Font("Arial", Font.PLAIN, 30));
				
		add(mensaje, BorderLayout.NORTH);
		
		PanelSpinners.add(spinner);
		
		PanelSpinners.add(spinner2);
		
		PanelSpinners.add(spinner3);
		
		PanelSpinners.add(spinner4);
		
		add(PanelSpinners, BorderLayout.CENTER);
		
		
		
		
		
	}
	
	public class EventoSpinner implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {

			mensaje.setFont(new Font((String)spinner.getValue(), Font.PLAIN, 30));
			
		}
		
		
	}
}