package graficos;
import javax.swing.*;
import java.awt.*;
public class graficos {

	public static void main(String[] args) {

		marcoTexto ventana = new marcoTexto();
		
		lamina miLamina = new lamina();
		
		ventana.add(miLamina);
		
	}

}

class marcoTexto extends JFrame{
	
	public marcoTexto() {
		
		setVisible(true);
		
		setBounds(1920/2-250,1080/2-150,500 ,300 );
		
		setTitle("Xavi");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}

class lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("HOLA", 250, 150);
		
	}
	
	
	
}
