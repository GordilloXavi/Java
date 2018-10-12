package graficos;

import java.awt.*;
import javax.swing.*;

public class JSpinnerEjemplo {

	public static void main(String[] args) {

		new MarcoEx();
		
		System.out.println("F�jate que si pulsamos el bot�n de arriba se decrementa \n y si pulsamos el de abajo de incrementa");
		
		/*VAMOS A APRENDER A HACER QUE PULSANDO LA FLECHA ABAJO DEL SPINNER AUMENTE EL VALOR Y PULSANDO
		 * LA FLECHA ARRIBA DISMMINUYA, ES DECIR, INVERTIR EL COMPORTAMIENTO DEL SPINNER POR DEFECTO.
		 * �sto de consigue con clases internas anonimas, un concepto MUY �TIL pero un poco dif�cil.
		 * Para repasarlas, ver el v�deo:
		 * 
		 * https://www.youtube.com/watch?v=nOisCjNznaE&index=98&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk#t=4.315805
		 */
	}

}

class MarcoEx extends JFrame{
	MarcoEx(){
		setBounds(1250, 550, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new LaminaEx());
		setVisible(true);
	
	}
	
}
class LaminaEx extends JPanel{
	
	JSpinner control;
	
	LaminaEx(){
		
		//�STO ES UNA CLASE AN�NIMA:
		//Se crea la clase SIN NOMBRE dentro del constructor, para cambiar las propiedades de 
		//la clase del constructor (as� no hay que crear una nueva clase que herede los m�todos de la otra)
		//para luego tener que sobreescribir dichos m�todos. 
		
		
		control = new JSpinner(new SpinnerNumberModel() {
			
			public Object getNextValue() {
				
				return super.getPreviousValue();
				
			}
			
			public Object getPreviousValue() {
				
				return super.getNextValue(); 
			}
			
			
		});//�ste tipo de clase es muy �til y se recomineda aprenderlo.
		
		
		
		
		
		control.setPreferredSize(new Dimension(70,20));
		
		add(control);
	}
	
	
	
		
	
	
}

/*C�DIGO ALTERNATIVO SIN CLASE AN�NIMA!!
 * 
 * 
 * LaminaEx(){
		
		control = new JSpinner(new SpinnerInvertido());//hay 	que crear una clase anonima para poder met�rsela como par�metro 
		//al spinner.
		
		control.setPreferredSize(new Dimension(70,20));
		
		add(control);
	}
	
	private class SpinnerInvertido extends SpinnerNumberModel{
		
		public SpinnerInvertido() {
			
			super(0,-10,10,1);//La instrucci�n super llama al contructor de la clase de la que hereda
	
		}
		
		//Ahora hay que sobreescibir algunos m�todos de SpinnerNumberModel
		
		public Object getNextValue() {
			
			return super.getPreviousValue();//Les estamos dando la vuelta a los m�todos 
			
		}
		
		public Object getPreviousValue() {
			
			return super.getNextValue();//Les estamos dando la vuelta a los m�todos 
		}
		
	}
 */




