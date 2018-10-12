package graficos;

import java.awt.MenuItem;

import javax.swing.*;

public class Menus_emergentes {

	public static void main(String[] args) {

		new MarcoEmergentes();
	}

}
class MarcoEmergentes extends JFrame{
	
	MarcoEmergentes(){
		setBounds(1000, 400, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new LaminaEmergentes());
		
		setVisible(true);
	}
}
class LaminaEmergentes extends JPanel{
	
	LaminaEmergentes(){
		
		JPopupMenu menu1 = new JPopupMenu();
		
		JPopupMenu menu2 = new JPopupMenu();

		JMenuItem botonmenu = new JMenuItem("Has hecho click derecho en el botón!");
		
		menu2.add(botonmenu);
		
		System.out.println("Haz click derecho en el botón y en la \n lámina para ver el comportamiento");
		
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		
		JMenuItem opcion2 = new JMenuItem("Opcion 2");

		JButton x = new JButton("Hola");
		
		x.setComponentPopupMenu(menu2);
		
		add(x);
		
		menu1.add(opcion1);
		
		menu1.add(opcion2);

		setComponentPopupMenu(menu1);//Le dices a la lámina qué menú tiene que abrir.
		//si queremos que se abra un menú diferente al hacer click derecha sobre otro componente
		//(botón, lámina, textarea, etc) tenemos que pasarle éste método al componente en cuestión.

		add(menu1);
	}
}