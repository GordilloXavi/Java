package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AreaTexto {

	public static void main(String[] args) {

		MarcoTx marco = new MarcoTx();
		
	}

}
class MarcoTx extends JFrame{
	
	MarcoTx(){	
		
		setBounds(1000, 400, 600, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new laminaTx());
		
		setVisible(true);

	}
}

class laminaTx extends JPanel{
	
	JTextArea areaTexto;
	
	laminaTx(){
		
		areaTexto = new JTextArea(8,20);//por defecto, cuando llegas al final del area,
		//ésta se ensancha de manera infinita. Hay una solución:
		
		areaTexto.setLineWrap(true);//Éste método hace que se haga un salto de línea cuando llegas
		//al final. Aún así, si llegas abajo del todo, la lámina se hace más profunda. Veamos cómo arreglarlo:
		
		JScrollPane laminaConScroll = new JScrollPane(areaTexto);//Ésta lámina especial tiene la 
		//particularidad de que tiene barras de desplazamineto!
		
		
		add(laminaConScroll);
		
		JButton boton1 = new JButton("Imprime en consola el texto que has escrito");
		
		boton1.addActionListener(new GestionaArea());
		
		add(boton1);
		
	}
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			System.out.println(areaTexto.getText());
			
			
		}
		
		
	}
}









