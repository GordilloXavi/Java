package graficos;

import javax.swing.*;

public class Layout_Libre {

	public static void main(String[] args) {

		new marcoLibre();
	}

}
class marcoLibre extends JFrame{
	
	marcoLibre(){
		setBounds(1000, 400, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new laminaLibre());
		setVisible(true);
	}
}
class laminaLibre extends JPanel{
	
	laminaLibre(){
		
		setLayout(null);//Ésto le indica al contenedor que tendrá una disposición libre, es decir,
		//podemos poner los elementos donde queramos dentro del contenedor.
		JButton boton1 = new JButton("Hola");
		
		boton1.setBounds(200, 120, 100, 60);//le ponemos la posición respecto a la esquina superior izquierda de la
		//lámina y el tamaño del botón.
		add(boton1);
		
		JButton boton2 = new JButton("?");
		
		boton2.setBounds(100, 160, 15, 75);//le ponemos la posición respecto a la esquina superior izquierda de la
		//lámina y el tamaño del botón.
		add(boton2);
		
	}
}