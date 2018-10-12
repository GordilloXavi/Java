package practicas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.*;

public class Ejersisio_final2 {

	public static void main(String[] args) {

		new Marfo2();
		
		
		
	}

}
class Marfo2 extends JFrame{
	
	Marfo2(){

		
		setBounds(1000, 400, 580, 400);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel lamina_cuadricula = new JPanel();
		
		lamina_cuadricula.setLayout(new GridLayout(2,3));
		
		
		String[] primero = {"Mensaje","Confirmar" , "Opción" , "Entrada"};
		
		lamina_tipo = new Lafina2("Tipo", primero);
		
		lamina_cuadricula.add(lamina_tipo);
		
		String[] segundo = {"ERROR_MESSAGE","INFORMATION_MESSAGE" , "WARNING_MESSAGE" , "QUESTION_MESSAGE", "PLAIN_MESSAGE"};
		
		lamina_tipoMensaje = new Lafina2("Tipo de mensaje", segundo);
		
		lamina_cuadricula.add(lamina_tipoMensaje);
		
		String[] tercero = {"Cadena","Icono" , "Componente" , "Otros", "Object"};
		
		lamina_mensaje = new Lafina2("Mensaje", tercero);
		
		lamina_cuadricula.add(lamina_mensaje);
		
		String[] cuarto = {"DEFAULT_OPTION","YES_NO_OPTION" , "YES_NO_CANCEL_OPTION" , "OK_CANCEL_OPTION"};
		
		lamina_confirmar = new Lafina2("Confirmar", cuarto);
		
		lamina_cuadricula.add(lamina_confirmar);
		
		String[] quinto = {"String[]","Icon[]" , "Object[]" };
		
		lamina_opcion = new Lafina2("Opción", quinto);
		
		lamina_cuadricula.add(lamina_opcion);
		
		String[] sexto = {"Campo de texto","Combo"};
		
		lamina_entrada = new Lafina2("Entrada", sexto);
		
		lamina_cuadricula.add(lamina_entrada);
		
		setLayout(new BorderLayout());
		
		add(lamina_cuadricula, BorderLayout.CENTER);
				
		JPanel lamina_boton = new JPanel();
		
		JButton boton = new JButton("Mostrar");
		
		boton.addActionListener(new AccionMostrar());
		
		lamina_boton.add(boton);
				
		add(lamina_boton, BorderLayout.SOUTH);
		
		
		
		
		
		setVisible(true);

	}
	
	
	//---------------------------------------------Proporciona el mensaje---------------------------------------------
	
	
	private Object dameMensaje() {
		
		String s = lamina_mensaje.dameSeleccion();
		
		if(s.equals("Cadena")) return cadenaMensaje;
			
			
		else if(s.equals("Icono")) return iconoMensaje;
						
		else if(s.equals("Otros")) return objetoMensaje;
			
		else if (s.equals("Componente")) return componenteMensaje;
			
		else return new Object[] { cadenaMensaje,
				iconoMensaje,
				componenteMensaje,
				objetoMensaje};
		
		
	}
	//-------------------
	
	public Object[] dameOpciones() {
		
		String s= lamina_opcion.dameSeleccion();
		
		if(s.equals("String[]")) {
			
			return new String[] {"Amarillo", "Azul", "Rojo" };
			
		}else if(s.equals("Icon[]")) {
			
			return new Object[] {new ImageIcon("src/graficos/negrita.gif"), new ImageIcon("src/graficos/subrallado.gif"), new ImageIcon("src/graficos/cursiva.gif")};
			
		}else if(s.equals("Object[]")) {
			return new Object[] { cadenaMensaje,
					iconoMensaje,
					componenteMensaje,
					objetoMensaje};
		}
		return null;
	}
	
	//------------- Devuelve tipo de mensaje (warning, question...)
	
	public int dameIcono() {
		
		String s = lamina_tipoMensaje.dameSeleccion();
		
		if(s.equals("QUESTION_MESSAGE")) {
			
			return 3 ;
			
		}else if(s.equals("ERROR_MESSAGE")) {
			
			return 0 ;
			
		}else if(s.equals("INFORMATION_MESSAGE")) {
			
			return 1 ;
			
		}else if(s.equals("WARNING_MESSAGE")) {
			
			return 2 ;
			
		}else {
			return -1;
		}
		
	}
	
	
	//-----------------------------------LAMINA CONFIRMAR-------------------------------------------------------
	
	public int dameConfirmar() {
		
		String s = lamina_confirmar.dameSeleccion();
		
		if(s.equals("DEFAULT_OPTION")) {
			return -1 ;
		}else if(s.equals("YES_NO_OPTION")) {
			return 0 ;
		}else if(s.equals("YES_NO_CANCEL_OPTION")) {
			return 1 ;
		}else if(s.equals("OK_CANCEL_OPTION")){
			return 2 ;
		}else {
			return -1;
		}
	}
	
	//______________________________
	
	
	
	private class AccionMostrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			if(lamina_tipo.dameSeleccion().equals("Mensaje")) {
				
				JOptionPane.showMessageDialog(Marfo2.this, dameMensaje(), "Título" , dameIcono());
				
			}else if(lamina_tipo.dameSeleccion().equals("Confirmar")) {
				
				JOptionPane.showConfirmDialog(Marfo2.this, dameMensaje(), "Título", dameConfirmar(), dameIcono());
				
				
				
			}else if(lamina_tipo.dameSeleccion().equals("Entrada")) {
				
				if(lamina_entrada.dameSeleccion().equals("Combo")) {
					JOptionPane.showInputDialog(Marfo2.this, dameMensaje(), "Titulo", dameIcono(),null, new String[] {"Amarillo", "Azul","Rojo"}, "Azul");

				}else {

				JOptionPane.showInputDialog(Marfo2.this, dameMensaje(), "Titulo", dameIcono());
				}
				
			}else {
				JOptionPane.showOptionDialog(Marfo2.this, dameMensaje(), "Titulo", 0, dameIcono(), null, dameOpciones(), null );
			}
			
		}
		
	}
	
	private Lafina2 lamina_tipo;
	
	private Lafina2 lamina_tipoMensaje;
	
	private Lafina2 lamina_mensaje;
	
	private Lafina2 lamina_confirmar;
	
	private Lafina2 lamina_opcion;
	
	private Lafina2 lamina_entrada;
	
	private String cadenaMensaje = "Mensaje";
	
	private Icon iconoMensaje = new ImageIcon("src/graficos/negrita.gif");
	
	private Object objetoMensaje = new Date();
	
	private Component componenteMensaje = new Lamina_Ejemplo();
}

class Lamina_Ejemplo extends JPanel{
	

				
		public void paintComponent(Graphics g){
			
			super.paintComponents(g);
			
			Graphics2D g2 = (Graphics2D)g;
			
			Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
			
			g2.setPaint(Color.GREEN);
			
			g2.fill(rectangulo);
		}
	
	
}

class Lafina2 extends JPanel{
	
	int cont;
	
	ButtonGroup grupo;
	
	public Lafina2(String titulo, String[] opciones) {
		
		cont = 0;
		
		setBorder(BorderFactory.createTitledBorder( titulo ));
		
		setLayout(new BoxLayout(Lafina2.this, BoxLayout.Y_AXIS ));//los componetes estarán distribuidos verticalmente
		
		grupo = new ButtonGroup();
		
		for(String s: opciones) {
					
					
			JRadioButton boton = new JRadioButton(s);
			
			boton.setActionCommand(s);
			
			grupo.add(boton);
			
			add( boton );
						
			boton.setSelected(cont == 0);
			
			cont++;
			

		}
		
	}
	
	public String dameSeleccion(){
				
		return grupo.getSelection().getActionCommand();
		
	}
	
	
}