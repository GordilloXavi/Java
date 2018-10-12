package trash;

import javax.swing.*;

public class Marco01 extends JFrame{

	int w = 600;
	
	int h = 400;
	
	public Marco01() {
		setVisible(true);
		setBounds(800,300,w,h);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Lamina01 lamina = new Lamina01();
		
		add(lamina);
	}
	
	public void Agrandar() {
		
		w += 20;
		h += 15;
		
		setSize(w, h);
	}
}

