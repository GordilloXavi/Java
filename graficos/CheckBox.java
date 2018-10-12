package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckBox {

	public static void main(String[] args) {

		new MarcoCheck();
		
	}

}
class MarcoCheck extends JFrame{
	
	JPanel lamtext;
	
	static JLabel texto;
	
	MarcoCheck(){
		setBounds(1000, 400, 180, 120);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		lamtext = new JPanel();
		
		texto = new JLabel("Holaaaa!");
		
		texto.setFont(new Font ("Arial", Font.PLAIN, 20));
		
		lamtext.add(texto);
		
		add(lamtext, BorderLayout.NORTH);
		
		add(new LaminaCheck(), BorderLayout.SOUTH);

		setVisible(true);

	}
	

	
}

class LaminaCheck extends JPanel{
	
	Font bold = new Font("Arial", Font.BOLD,20);
	
	Font normal = new Font("Arial", Font.PLAIN,20);
	
	Font italic = new Font("Arial", Font.ITALIC,20);
	
	Font both = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
	
	JCheckBox caja1;
	
	JCheckBox caja2;
	
	LaminaCheck(){
		
		
		caja1 = new JCheckBox("Negrita");
		
		caja2 = new JCheckBox("Cursiva");
		
		caja1.addActionListener(new negrita());
		
		caja2.addActionListener(new negrita());
		
		add(caja1);
		add(caja2);
		
		
	}
	
	class negrita implements ActionListener{
		
			@Override
		public void actionPerformed(ActionEvent e) {
				
				//Éste código se puede acortar MUCHO y de una forma muy inteligente. Para ver como mirar el video:
				//   https://www.youtube.com/watch?v=V-hmPZ8pDkM&index=92&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk
	
			if(caja2.isSelected() && caja1.isSelected()) {
				 
				MarcoCheck.texto.setFont(both);
				
			}else if (caja2.isSelected()){
				
				MarcoCheck.texto.setFont(italic);
			}else if(caja1.isSelected()) {
				MarcoCheck.texto.setFont(bold);
			}else {
				MarcoCheck.texto.setFont(normal);

			}
			
		}
		
	}
	
	
}