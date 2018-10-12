package graficos;
import java.awt.*;
import javax.swing.*;
public class Letras {

	public static void main(String[] args) {

		Window window = new Window();
		
		capa1 lam = new capa1();
		
		window.add(lam);
		
	}

}


class Window extends JFrame{
	
	public Window() {
		
		setVisible(true);
		setBounds(600,300,590,540);
		setTitle("Bentana");
		
	}
	
}

class capa1 extends JPanel{
	
		public void paintComponent(Graphics g) {
		
			Graphics2D j = (Graphics2D) g;
			
			Font miFuente = new Font("Arial", Font.BOLD, 26);//Fuente, tipo y tamaño
			
			j.setFont(miFuente);
			
			j.setPaint(Color.blue);
		
			j.drawString("Hola, me llamo Xavi", 165, 250);
			
			j.setFont(new Font("Courier", Font.ITALIC, 30));
			
			j.setPaint(new Color(0,180,32));
			
			j.drawString("Cómo estás, Xavi?", 165, 300);
	}
}