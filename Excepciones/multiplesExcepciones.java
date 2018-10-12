package excepciones_I;

import javax.swing.JOptionPane;

public class multiplesExcepciones {

	public static void main(String[] args) {

		try {
		division();
		}catch(ArithmeticException e) {
			System.out.println("No pongas un 0 en el denominador.");
			
			e.getMessage();
		}catch(NumberFormatException f) {
			System.out.println("Escribe un número, por favor.");
			
			f.getMessage();
		}
		
	}
	
	static void division() {// throws ArithmeticException, NumberFormatException{
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		
		System.out.println("El resultado es " + num1/num2);
		
		
	}

}

