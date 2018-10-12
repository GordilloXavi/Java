package graficos;

import java.awt.BorderLayout;

import javax.swing.*;

public class Menu_Iconos_y_mas {

	public static void main(String[] args) {

		new MarcoMenu();
		
	}

}
class MarcoMenu extends JFrame{
	
	MarcoMenu(){
		
		setBounds(1200, 550, 500, 300);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new LaminaMenu());
		
		setVisible(true);
		
		
	}
}
class LaminaMenu extends JPanel{
	
	
	
	LaminaMenu(){
		
		setLayout(new BorderLayout());
		
		JMenuBar BarraMenu = new JMenuBar();//Primero creamos la barra en la que irán las opciones
		//con la clase JMenuBar.
		
		JMenu menu1 = new JMenu("Archivo");//Creamos cada elemento de menú instanciando la clase JMenu
		JMenu menu2 = new JMenu("Edición");
		JMenu menu3 = new JMenu("Herraminetas");
		
		JMenuItem guardar = new JMenuItem("Guardar");//Creamos items para cada menú
		JMenuItem guardarcomo = new JMenuItem("Guardar Como");
		
		ImageIcon iconoCortar = new ImageIcon("src/graficos/cortar.gif");
		ImageIcon iconoCopiar = new ImageIcon("src/graficos/copiar.gif");
		ImageIcon iconoPegar = new ImageIcon("src/graficos/pegar.gif");
		
		
		JMenuItem cortar = new JMenuItem("Cortar", iconoCortar);
		JMenuItem copiar = new JMenuItem("Copiar", iconoCopiar);
		
		copiar.setHorizontalTextPosition(JMenuItem.LEFT);//Así el texto aparece a la izquierda y el icono a la derecha
		//Queda mal pero así lo podemos ver. 
		
		JMenuItem pegar = new JMenuItem("Pegar", iconoPegar);

		JMenu opciones = new JMenu("Opciones");
	
		ButtonGroup grupo1 = new ButtonGroup();
		
		JRadioButtonMenuItem opcion1 = new JRadioButtonMenuItem("Opcion 1"  );
		JRadioButtonMenuItem opcion2 = new JRadioButtonMenuItem("Opcion 2");

		
		
		menu1.add(guardar);//Añadimos cada ítem a su menú correspondiente
		menu1.add(guardarcomo);
		
		menu2.add(cortar);
		menu2.add(copiar);
		menu2.addSeparator();//Pone un separador para separar con una barra sutil un elemento de otro
		menu2.add(pegar);


		grupo1.add(opcion1);
		grupo1.add(opcion2);

		
		opciones.add(opcion1);
		opciones.add(opcion2);
		menu3.add(opciones);

		
		BarraMenu.add(menu1);//Añadimos cada elemento a la barra.
		BarraMenu.add(menu2);
		BarraMenu.add(menu3);

		
		
		add(BarraMenu, BorderLayout.NORTH);//Finlmente, agregamos la barra a la lámina
		
	}
}