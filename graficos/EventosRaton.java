package graficos;

import java.awt.event.*;

import javax.swing.*;

public class EventosRaton {

	public static void main(String[] args) {

		CreaMarco marco = new CreaMarco();
		

		
	}

}

class CreaMarco extends JFrame{
	
	CreaMarco(){
		
		setVisible(true);
		
		setBounds(0,0,200,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RatonEvento raton = new RatonEvento();
		
		RatonArrastrado arrastrando = new RatonArrastrado();
		
		addMouseMotionListener(arrastrando);
		
		addMouseListener(raton);
	}
	
}

class RatonEvento extends MouseAdapter{
	
	public void mouseClicked(MouseEvent e) {

		System.out.println("Coorednada x: " + e.getX() + " \nCoordenada y: " + e.getY());	
		System.out.println();
	}
	
	public void mousePressed(MouseEvent e) {
		
		if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has pulsado el bóton izquierdo.");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado la rueda del ratón.");
		}else {
			System.out.println("Has pulsado el botón dereho.");
		}
		
	}
	
	
}

class RatonArrastrado  implements MouseMotionListener{

	
	public void mouseDragged(MouseEvent e) {
		System.out.println("Estás arrastrando el ratón.");
	}

	
	public void mouseMoved(MouseEvent e) {
		System.out.println("Estás moviendo el ratón.");
		
		}
	}//Ésto se llama cada momento que mueves el ratón, como unas 200 veces por segundo si 
	//lo mueves todo el rato.
	
	





/* De nuevo, ejemplo de clase que hereda de la interfaz.

class RatonEvento implements MouseListener{

	
	public void mouseClicked(MouseEvent e) {

		System.out.println("Has hecho una pulsación completa del ratoón. .");		
	}

	
	public void mouseEntered(MouseEvent e) {

		System.out.println("El ratón ha entrado a la ventana");
	}

	
	public void mouseExited(MouseEvent e) {
		
		System.out.println("El raton ha salido de la ventana.");
		
	}

	
	public void mousePressed(MouseEvent e) {
	
		System.out.println("Has presionado el raton.");
	}

	
	public void mouseReleased(MouseEvent e) {
	
		System.out.println("Has levantado el raton.");
		
	}
	
	
}
*/