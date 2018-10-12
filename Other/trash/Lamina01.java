package trash;

import java.awt.event.*;

import javax.swing.*;

public class Lamina01 extends JPanel{
	
		JButton boton01 = new JButton("Agrandar");
		
	public Lamina01(){
		
		
		
		add(boton01);
		
		//boton01.addActionListener(new Accion());
	}
	
	class Accion extends Marco01 implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {

		Agrandar();
			
		}
		
		
	}
	

}