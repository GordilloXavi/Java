package trash;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PuruebaRGB {

	public static void main(String[] args) {

		new marcoRGB();
	}

}
class marcoRGB extends JFrame{
	marcoRGB(){
		
	setBounds(1000,400,200,300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	add(new laminaRGB());
	setVisible(true);
	}
	
}
class laminaRGB extends JPanel{
	
	JPanel lamina2;
	
	JSlider R;
	
	JSlider G;
	
	JSlider B;
	
	JButton ponerColor;
	
	laminaRGB(){
		
		setLayout(new BorderLayout());
		
		lamina2 = new JPanel();
		
		add(lamina2, BorderLayout.CENTER);
		
		//ponerColor = new JButton("Aplicar");
		
		R = new JSlider(JSlider.VERTICAL, 0, 255, 255);
		
		G = new JSlider(JSlider.VERTICAL, 0, 255, 255);

		B = new JSlider(JSlider.VERTICAL, 0, 255, 255);
		
		B.setMajorTickSpacing(50);
		B.setMinorTickSpacing(5);
		
		
		//B.setPaintLabels(false);
		
		lamina2.add(R);
		
		lamina2.add(G);
		
		lamina2.add(B);
		
		R.addChangeListener(new AccionColor());
		G.addChangeListener(new AccionColor());
		B.addChangeListener(new AccionColor());
		/*
		ponerColor.addActionListener(new AccionColor());

		add(ponerColor, BorderLayout.SOUTH);*/
	}
	
	private class AccionColor implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent arg0) {

			lamina2.setBackground(new Color(R.getValue(), G.getValue(), B.getValue()));
			
		}

		
		
		
	}
	
	
}