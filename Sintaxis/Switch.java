import java.util.*;
import javax.swing.*;
public class Switch {

	public static void main(String[] args) {


		@SuppressWarnings("resource") //Esta linea no hace falta.
		Scanner x = new Scanner(System.in);
		
		System.out.println("C�lculo del �rea de un pol�gono regular: \n "
				+ "1: Tri�ngulo, \n 2: Cuadrado, \n"
				+ " 3: Pent�gono, \n 4: Hex�gono, \n 5: c�rculo.");
		
		int figura = x.nextInt();
		
		
		
		switch (figura) {
		
		case 1: 
			System.out.println("Introduce el valor del lado del tri�ngulo: ");
			int ladoT = x.nextInt();
			System.out.println("Introduce el valor de la altura del tri�ngulo: ");
			int alturaT = x.nextInt();
			System.out.println("El �rea de tu tri�ngulo es de "
			+ (ladoT * alturaT) +" cent�metros cuadrados.");
						
			break;
			
		case 2:
			
			// Case 2 se utiliza JOptionPane
			
			String ladoC1 = JOptionPane.showInputDialog("\"Introduce el valor del "
					+ "lado del cuadrado:");
			
			int ladoC = Integer.parseInt(ladoC1);
			
			System.out.println("El �rea de tu cuadrado es de "
			+ ladoC*ladoC + " cent�metros cuadrados. ");
			
			break;
			
		case 3:
			System.out.println("introduce el valor del lado del pent�gono:");
			
			double ladoP = x.nextDouble();
			
			System.out.println("introduce el valor de la apotema del pent�gono:");
			
			double apoP = x.nextDouble();
			
			double areaP = (5*ladoP * apoP) / 2;
					
			System.out.print("El �rea de tu pent�gono regular es de ");
			
			System.out.print( areaP);
			
			System.out.println(" cent�metros cuadrados.");
			
			break;
			
		case 4:
			
			System.out.println("introduce el valor del lado del hex�gono regular:");
			
			double ladoH = x.nextDouble();
						
			System.out.println("introduce el valor de la apotema "
					+ "del hex�gono regular:");
			
			double apoH = x.nextDouble();
			
			double areaH = 3*ladoH*apoH;
			
			System.out.print("El �rea de tu hex�gono es de ");
			
			System.out.print(areaH);
			
			System.out.println(" cent�metros cuadrados");
			
			break;
			
		case 5:
			
			System.out.println("Introduce el radio de la circumferencia:");
			
			double radioC = x.nextDouble();
			
			double resultado = radioC *radioC * Math.PI ;
			
			System.out.println("El �rea de tu circumferencia es"
					+ " de " + Math.round(resultado) + " cent�metros cuadrados.");
			break;
			
		default: //Default es como else.
			System.out.println("La opci�n no es correcta.");
			
			
		}
		
		}

	

}
