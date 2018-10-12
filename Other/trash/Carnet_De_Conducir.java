package trash;

import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Carnet_De_Conducir {

	public static void main(String[] args) {

		new Marc();
	}

}
class Marc extends JFrame{
	
	
	Marc(){
		setBounds(800, 400, 250, 300);
		//setShape(shape);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new lamian());
		
		setVisible(true);
		
	}
}
class lamian extends JPanel{
	
	private JSpinner Npracticas;
	
	private JSpinner NintentosT;
	
	private JSpinner NintentosP;
	

	private JLabel practicas;
	
	private JLabel intentosTeo;
	
	private JLabel intentosPra;
	
	private JLabel precioLli;
	
	private JLabel precioSa;
	
	private Font fuente = new Font("Arial", Font.BOLD, 20);
	

	private double precioL = 600;
	
	private double precioS = 0;
	
	lamian(){
		
		Npracticas = new JSpinner(new SpinnerNumberModel(10,9 ,100,1));
		
		NintentosT= new JSpinner(new SpinnerNumberModel(1,0 ,10,1));
		
		NintentosP = new JSpinner(new SpinnerNumberModel(1,0 ,10,1));
		
		practicas = new JLabel("Número de prácticas: ");
		
		intentosTeo = new JLabel("Número de intentos (T): ");
		
		intentosPra = new JLabel("Número de intentos (P): ");
		
		precioLli = new JLabel("Precio Lliçá: " + precioL + "€");
		
		precioSa = new JLabel("Precio SantaEulàlia: " + precioS + "€");
		
		precioLli.setFont(fuente);
		
		precioSa.setFont(fuente);


		Npracticas.addChangeListener(new Ebento());
		
		NintentosT.addChangeListener(new Ebento());

		NintentosP.addChangeListener(new Ebento());

		
		
		add(practicas);
		
		add(Npracticas);

		add(intentosTeo);

		add(NintentosT);

		add(intentosPra);

		add(NintentosP);
		
		add(precioLli);
		
		add(precioSa);
		
				
		
	}
	
	private class Ebento implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {


			if (e.getSource() == Npracticas) {
				
				//Spinner practicas:
				
				int p =  (int)Npracticas.getValue();
				
				int It = (int)NintentosT.getValue();
				
				int Ip = (int)NintentosP.getValue();
				
				if(p < 10) {
				
				JOptionPane.showMessageDialog(lamian.this, "No se aceptan menos de 10 prácticas!", "Advertencia", 0);
				
				Npracticas.setValue(10);
				
				}else if (p == 10) {
					precioL = 600;
				}else {
					precioL = 600+((p-10)*30.22);
				}
				
				
				if(It >1) {
					
					precioL = precioL;
					
				}
				
				
			}else if(e.getSource() == NintentosT) {
				
				
				
				
				
				
				
			}else if(e.getSource() == NintentosP) {
				
				
				
				
				
				
			}
			
			precioLli.setText("Precio Lliçá: " + Math.round(precioL) + "€");
			
			precioSa.setText("Precio SantaEulàlia: " + Math.round(precioS) + "€");
			
			
		}
		
		
	}
}