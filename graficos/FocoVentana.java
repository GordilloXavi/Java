package graficos;

import java.awt.event.*;

import javax.swing.*;

public class FocoVentana extends JFrame implements WindowFocusListener {
	
	public static void main(String[] args) {

		FocoVentana foco = new FocoVentana();
		
		foco.iniciar();
		
		
	}
	
	FocoVentana marco1;
	FocoVentana marco2;
	

	
	public void iniciar() {
		
		marco1 = new FocoVentana();
		
		marco2 = new FocoVentana();
		
		marco1.setVisible(true);
		
		marco2.setVisible(true);

		marco1.setBounds(150,200,600,450);
		
		marco2.setBounds(1000,200,600,450);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco1.addWindowFocusListener(this);//El objeto oyente que hay que pasarle es una 
		//instancia de la clase oyente (el marco).Como ya estamos en dicha clase, utilizamos this.
		
		marco2.addWindowFocusListener(this);
	}
	
	


	
	public void windowGainedFocus(WindowEvent e) {
		
		
		if (e.getSource() == marco1) {
			marco1.setTitle("Tengo el foco!! :D");
			
		}else {
			marco2.setTitle("Tengo el foco!! :D");
		}
	}

	
	public void windowLostFocus(WindowEvent e) {

		
		if (e.getSource() == marco1) {
			marco1.setTitle("No tengo el foco :(");
		}else {
			marco2.setTitle("No tengo el foco :(");
		}
	}

}
