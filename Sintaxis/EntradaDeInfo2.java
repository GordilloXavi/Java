import javax.swing.*;

public class EntradaDeInfo2 {

	public static void main(String[] args) {
		
		
		

		String ejemplo = JOptionPane.showInputDialog
				("Intruduce tu nombre, por favor: ");
		
	String edad = JOptionPane.showInputDialog("Cuál es tu edad? ");
		
		double edaddef = Integer.parseInt(edad); 
		
		//Importante: convierte de string a int. Clase Integer
		
		
				
				
		System.out.println("Hola, " + ejemplo+ 
				". Tú tendrás "+ (Math.round(edaddef)+1) + " años el año que viene.");
		
		
		double x = 100.0;
		
		double raiz = x/3;
		
		System.out.printf("%1.2", raiz);
	}

}
