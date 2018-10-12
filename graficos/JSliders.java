package graficos;

import java.awt.Font;

import javax.swing.*;

public class JSliders {

	public static void main(String[] args) {

		new Marruecos();
	}

}
class Marruecos extends JFrame{
	
	Marruecos(){
		
		setBounds(1000, 400, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new LaminaSlider());
		
		setVisible(true);

	
	}
}
class LaminaSlider extends JPanel{
	
	JSlider control;
	
	LaminaSlider(){
		
		control = new JSlider(JSlider.HORIZONTAL,0,100,80);//En el constructor podemos poner 
		//La orientación, valores min y max del slider y su valor inicial.
		
		control.setMajorTickSpacing(50);//Las marcas mayores (donde salen los numeros) van de 50 en 50.
		
		control.setMinorTickSpacing(25);//Las marcas menores van de 25 en 25.
				
		control.setPaintTicks(true);//Hace que aparezcan los números.
		
		control.setPaintLabels(true);//Hace que salgan los numeritos cada 25 uds.
		
		control.setFont(new Font ("Serif", Font.ITALIC, 12));//se puede cambiar la fuente de los nums.
		
		control.setSnapToTicks(true);//Hace que solo puedas dejar el slider en los números (si es cada 25, 
		//solo puede estar en 0,25,50,etc.),
		
		add(control);
		
	}
}