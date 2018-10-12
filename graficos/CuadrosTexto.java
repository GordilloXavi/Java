package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CuadrosTexto {

	public static void main(String[] args) {

		MarcoT marco = new MarcoT();
		
	}

}

class MarcoT extends JFrame{
	
	MarcoT(){
		
		setLayout(new GridLayout(2,0));
		
		setBounds(1200, 550, 600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new LaminaT());
		add(new LaminaMensaje());
		setVisible(true);
	}
}
class LaminaT extends JPanel{
	
	JTextField campo1;
	
	JButton voton;
	
	JButton vorrar;
	

	LaminaT(){
		
		
		JLabel texto1 = new JLabel("Email:");//Pone texto en la pantalla
		
		add(texto1);
		
		voton = new JButton("Comprobar E-Mail");
		
		vorrar = new JButton("Borrar");
		
		vorrar.addActionListener(new Aktion());
		
		voton.addActionListener(new Aktion());
				
		campo1 = new JTextField( 15 );
		
		

		add(campo1);
		
		add(voton);		
		
		add(vorrar);
		
	}
	
	class Aktion implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == voton) {
			
				String correo = campo1.getText();
				
				int arrobas = 0;
				
				int puntos = 0;
				
				boolean orden = false;
				
				for( int i = 0; i < correo.length(); i++) {
					if( correo.charAt(i) == '@') {
						arrobas++;
						orden = false;
					}else if(correo.charAt(i) == '.') {
						puntos++;
						orden = true;
					}
				}
				
				if (arrobas == 1 && puntos ==1 && orden == true) {
					
					
					
					LaminaMensaje.mensaje.setText("E-Mail correcto!");
				}else {
					
					if(correo.equals("") == false) {
					
					LaminaMensaje.mensaje.setText("E-Mail incorrecto, por favor vuelve a introducir el correo.");
				
				}}
				
				
		}else {
			campo1.setText("");
			LaminaMensaje.mensaje.setText("");
		}
		}
	}
}

class LaminaMensaje extends JPanel{
	
	static JLabel mensaje;
	
	LaminaMensaje(){
		
		
		
		mensaje = new JLabel();
		
		add(mensaje);

		
	}
}
