package graficos;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BarraHerramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Barra mimarco=new Marco_Barra();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Barra extends JFrame{
	
	public Marco_Barra(){
		
		setTitle("Marco con Barra");
		
		setBounds(500,300,600,450);
		
		lamina=new JPanel();
		
		add(lamina);
		
		// configuración de acciones
		
		Action accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/bola_azul.gif"), Color.BLUE);
		
		Action accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/bola_amarilla.gif"), Color.YELLOW);
		
		Action accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/bola_roja.gif"), Color.RED);
		
		JMenu menu = new JMenu("Color");
		
		menu.add(accionAzul);
		
		menu.add(accionAmarillo);
		
		menu.add(accionRojo);
		
		JMenuBar barraMenu = new JMenuBar();
		
		barraMenu.add(menu);
	
		setJMenuBar(barraMenu);
		
		//***************
		
		//BRUTAL BARRA DE HERRAMINETAS QUE SE PUEDE ARRASTRAR Y TODO!
		
		JToolBar barraHerramientas = new JToolBar();
		
		JButton botonExit = new JButton("Salir", new ImageIcon("src/graficos/exit.gif"));
		
		botonExit.addActionListener(new AccionSalir());
		
		barraHerramientas.add(accionAzul);
		
		barraHerramientas.add(accionAmarillo);
		
		barraHerramientas.add(accionRojo);
		
		barraHerramientas.addSeparator();
		
		barraHerramientas.add(botonExit);

		
		
		add(barraHerramientas, BorderLayout.NORTH);
		
		//******************************
	}
		
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color c){
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			
			putValue("Color", c);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			Color c=(Color) getValue("Color");
			
			lamina.setBackground(c);
			
		}		
		
	}
	
	private class AccionSalir implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
					
			dispose();
		}
		
		
	}
	private JPanel lamina;
}



