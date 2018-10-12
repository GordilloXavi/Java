package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EventosMultiplesFuentes {

	public static void main(String[] args) {

		MarcoAccion marco = new MarcoAccion();
		
		
		
		
		// VER ESTO PARA ENTENDER EL PROGRAMA!!
		// https://www.youtube.com/watch?v=8FQnwZrr8Ck&index=77&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk
		
	}

}

class MarcoAccion extends JFrame{
	
	public MarcoAccion(){
		setBounds(500, 500, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanelAccion Lamina01 = new PanelAccion();
		add(Lamina01);
		setVisible(true);

		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}
}
class PanelAccion extends JPanel{
	
	
	public PanelAccion(){
		
		
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/yellow.gif"), Color.YELLOW);
		
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/light-blue.gif"), Color.blue.brighter());

		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/red.gif"), Color.red);


		add(new JButton(accionAmarillo));
		add(new JButton(accionRojo));
		add(new JButton(accionAzul));
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//El botón que reciba la combinación de teclas tiene que estar 
		//en la ventana que tenga el foco.
		
		KeyStroke teclaAmarrillo = KeyStroke.getKeyStroke("ctrl A");
		//Creamos una combinación de teclas.
		KeyStroke OtraTeclaAmarrillo = KeyStroke.getKeyStroke("shift A");
		
		KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
		
		KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
		
		mapaEntrada.put(teclaAmarrillo, "fondo_amarillo" );
		
		mapaEntrada.put(OtraTeclaAmarrillo, "fondo_amarillo" );
		//podemos poner el fondo amarillo con ctrl+a o con shift+a
		mapaEntrada.put(teclaAzul, "fondo_azul" );
		
		mapaEntrada.put(teclaRojo, "fondo_rojo" );
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("fondo_amarillo" , accionAmarillo);
		
		mapaAccion.put("fondo_azul" , accionAzul);
		
		mapaAccion.put("fondo_rojo" , accionRojo);
		
	}
	
	class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color color_boton){
			
			putValue(Action.NAME, nombre );
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color "+ nombre);
			putValue("color_de_fondo" , color_boton);
			
		}
		
		
		public void actionPerformed(ActionEvent e) {
			
			Color c = (Color)getValue("color_de_fondo");
			
			setBackground(c);
			
		}
		
	}
	

	
	
}

