package graficos;

import java.awt.*;


import javax.swing.*;
import javax.swing.event.*;

import javax.swing.text.*;

public class EventosTexto {

	public static void main(String[] args) {
		
		MarcoTxt marco = new MarcoTxt();

		marco.setVisible(true);
	}

}
class MarcoTxt extends JFrame{
	public MarcoTxt() {

		setBounds(1200, 550, 500, 150);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(false);
		
		BorderLayout layin = new BorderLayout();
		
		setLayout(layin);

		add(new LaminaTxt(), layin.NORTH);
		
		add(new Lamina22(), layin.CENTER);
		
	}
}
class LaminaTxt extends JPanel{
	
	int letras = 0;
	
	JPasswordField MiCampo;
	
	LaminaTxt(){
		
		MiCampo = new JPasswordField(15);
		
		Document MiDocumento = MiCampo.getDocument();//Importanteee!
		
		EscuchaTexto EventoTxt = new EscuchaTexto();
		
		MiDocumento.addDocumentListener(EventoTxt);
		
		add(new JLabel("Introduce la contraseña:"));
		
		add(MiCampo);
		}
	
	private class EscuchaTexto implements DocumentListener{

		
		boolean prohibido;
		
		public void comprueba() {
			
			if (letras < 4 || letras > 12) {
				Lamina22.warning.setText("La contraseña debe de tener entre 4 y 12 caracteres.");
			}else {
				Lamina22.warning.setText("");
			}
			
	
			
			for(int i = 0; i<MiCampo.getText().length(); i++) {//!! Método desaconsejado, leer abajo!
				
				if(MiCampo.getText().charAt(i) == '@' || MiCampo.getText().charAt(i) == '&' ||
						MiCampo.getText().charAt(i) == '!' || MiCampo.getText().charAt(i) == '#') {
				
				prohibido = true;
				/*TE EXPLICO el porqué del método getText TACHADO: como estamos usando un JPasswordFIeld,
				 * y no un JTextField, es mejor usar el método getPassword(). El problema es que ese método
				 * genera un array con los caracteres de tu contraeña, y no un string como getText(). No uso 
				 * getPassword() (aunque debería) porque me da palo reescribir el código. Si quiere saber como
				 *vuelve a mirar el vídeo:
				 * https://www.youtube.com/watch?v=uQWVgMeOeHw&index=89&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk	
				 */
				}
				
			}
	
			
			if (prohibido) {
				Lamina22.warning2.setText("La contraseña no puede contener los caracteres @ # ! &");

				MiCampo.setBackground(Color.RED);
				
			}else {
				Lamina22.warning2.setText("");

				MiCampo.setBackground(Color.WHITE);
			}
			prohibido = false;
		}
		
		
		
		
		@Override
		public void changedUpdate(DocumentEvent e) {
		
		}

		@Override
		public void insertUpdate(DocumentEvent e) {//Se llama cuando introduces texto en el cuadro
			
			//System.out.println("Has insertado texto.");
			letras++;
			
			comprueba();
			
			
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {//Se llama cuando borras texto del cuadro

		  //System.out.println("Has borrado texto.");
			letras--;
			
		
			comprueba();
			
		}
		
		
		
		
	}
}
class Lamina22 extends JPanel{
	
	static JLabel warning;
	
	static JLabel warning2;
	
	Lamina22(){
		
		warning = new JLabel("");
		
		warning2 = new JLabel("");
		
		add(warning);
		
		add(warning2);
		
	}
}
