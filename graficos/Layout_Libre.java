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
		
		setLayout(null);//�sto le indica al contenedor que tendr� una disposici�n libre, es decir,
		//podemos poner los elementos donde queramos dentro del contenedor.
		JButton boton1 = new JButton("Hola");
		
		boton1.setBounds(200, 120, 100, 60);//le ponemos la posici�n respecto a la esquina superior izquierda de la
		//l�mina y el tama�o del bot�n.
		add(boton1);
		
		JButton boton2 = new JButton("?");
		
		boton2.setBounds(100, 160, 15, 75);//le ponemos la posici�n respecto a la esquina superior izquierda de la
		//l�mina y el tama�o del bot�n.
		add(boton2);
		
	}
}