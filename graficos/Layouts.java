package graficos;

import java.awt.*;

import javax.swing.*;

//	Clases FlowLayout, BorderLayout, GridLayout

public class Layouts {

	public static void main(String[] args) {

		Marco_Layout marco22 = new Marco_Layout();
	}

}

class Marco_Layout extends JFrame{
	
	Marco_Layout(){
		setVisible(true);
		
		setBounds(1250,550,400,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new Panel_Layout(), BorderLayout.NORTH);//El m�todo add admite 2 par�metros,
		//uno para decir qu� componenteagregamos y otro para especificar su posici�n. En �ste
		//caso, tenemos que especificar la posici�n de las L�MINAS JPanel, porque sino se ponen
		//una encima de la otra y solo se ve la �ltima. 
		
		add( new Panel_Layout2(), BorderLayout.CENTER);
		
	}
}

class Panel_Layout extends JPanel{//Ejemplos de los dem�s layouts comentados al final del code
	
	Panel_Layout(){

		setLayout( new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Amarillo"));
		
		add(new JButton("Rojo"));


	}
	
}
class Panel_Layout2 extends JPanel{
	public Panel_Layout2() {
		
		setLayout(new BorderLayout(5,5));

		add(new JButton("Azul"),BorderLayout.WEST);
		
		add(new JButton("Verde"),BorderLayout.CENTER);
		
		add(new JButton("Negro"),BorderLayout.EAST);
		
	}
}



/*	LAYOUT 1!!:
 * 		
		FlowLayout Izquierda = new FlowLayout(FlowLayout.CENTER,50,30);//Crea un objeto layout 
		//Los elementos de la lamina van a la izquierda(o donde especifiquemos), el espacio
		//entre ellos es 100 pixiles vert. y 100 pixeles horiz.
		setLayout(Izquierda);
		
		//setLayout( new FlowLayout(FlowLayout.LEFT,100,100)); <<M�S CORTO, MENOS CODE
 * 
 * 
 * LAYOUT 2!!:
 * 		
		setLayout( new BorderLayout(50,20));//La border Layout se divide en 5 partes. Hay que 
		//Especificar en qu� parte del layout va cada bot�n Los botones intentar�n ocupar 
		//toda una parte ENTERA, y por lo tanto se har�n muy grandes. Los modificadores indican el espacio entre otones.
		
		add(new JButton("Amarillo"), BorderLayout.EAST);//El m�todo add admite 2 par�metros,
		//uno para decir qu� componenteagregamos y otro para especificar su posici�n.
		
		add(new JButton("Rojo"),BorderLayout.NORTH);

		add(new JButton("Verde"),BorderLayout.WEST);
		
		add(new JButton("Azul"),BorderLayout.CENTER);
		
		add(new JButton("Negro"),BorderLayout.SOUTH);

		//El resultado ser� extravagante.
*/