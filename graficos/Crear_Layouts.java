package graficos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.*;

public class Crear_Layouts {

	public static void main(String[] args) {

		new marco00();
		
	}

}
class marco00 extends JFrame{
	
	marco00(){
		setBounds(1000, 400, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new lamina00());
		setVisible(true);
	}
}
class lamina00 extends JPanel{
	
	lamina00(){
		setLayout(new Encolumnas());//Utilizamos el layout que hemos creado nosotros
		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellido = new JLabel("Apellido: ");
		JLabel edad = new JLabel("Edad: ");
		JLabel tel = new JLabel("Telefono: ");


		JTextField campoN = new JTextField();
		JTextField campoA = new JTextField();
		JTextField campoE = new JTextField();
		JTextField campoT = new JTextField();

		
		add(nombre);
		
		add(campoN);
		
		add(apellido);
		
		add(campoA);
		
		add(edad);
		
		add(campoE);
		
		add(tel);
		
		add(campoT);

		
	}
}

class Encolumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	private int x;
	private int y = 20;
	
	@Override
	public void layoutContainer(Container contenedor) {
		
		int d = contenedor.getWidth();
		
		x = d/2;//para poner los componentes en el medio
		
		int contador = 0;
		
		int n = contenedor.getComponentCount(); //Almacena cuantos componentes hay agregados en este contenedor
		
		for(int i  =0; i<n; i ++) {
			contador++;
			
			Component c = contenedor.getComponent(i);//obtiene el componente número i. 
		
			
			c.setBounds(x-100, y, 100, 20);//coloca ese componente en la posición especificada
			
			x+=100;//el siguiente componente lo colocará 100px más a la derecha
			
			if (contador % 2 == 0 ) {//si contador es par...
				x= d/2;
				
				y+= 40;
			}
		}
		
		
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	
	
}




