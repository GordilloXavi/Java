import java.util.*;
import javax.swing.*;
public class Switch {

	public static void main(String[] args) {


		@SuppressWarnings("resource") //Esta linea no hace falta.
		Scanner x = new Scanner(System.in);
		
		System.out.println("Cálculo del área de un polígono regular: \n "
				+ "1: Triángulo, \n 2: Cuadrado, \n"
				+ " 3: Pentágono, \n 4: Hexágono, \n 5: círculo.");
		
		int figura = x.nextInt();
		
		
		
		switch (figura) {
		
		case 1: 
			System.out.println("Introduce el valor del lado del triángulo: ");
			int ladoT = x.nextInt();
			System.out.println("Introduce el valor de la altura del triángulo: ");
			int alturaT = x.nextInt();
			System.out.println("El área de tu triángulo es de "
			+ (ladoT * alturaT) +" centímetros cuadrados.");
						
			break;
			
		case 2:
			
			// Case 2 se utiliza JOptionPane
			
			String ladoC1 = JOptionPane.showInputDialog("\"Introduce el valor del "
					+ "lado del cuadrado:");
			
			int ladoC = Integer.parseInt(ladoC1);
			
			System.out.println("El área de tu cuadrado es de "
			+ ladoC*ladoC + " centímetros cuadrados. ");
			
			break;
			
		case 3:
			System.out.println("introduce el valor del lado del pentágono:");
			
			double ladoP = x.nextDouble();
			
			System.out.println("introduce el valor de la apotema del pentágono:");
			
			double apoP = x.nextDouble();
			
			double areaP = (5*ladoP * apoP) / 2;
					
			System.out.print("El área de tu pentágono regular es de ");
			
			System.out.print( areaP);
			
			System.out.println(" centímetros cuadrados.");
			
			break;
			
		case 4:
			
			System.out.println("introduce el valor del lado del hexágono regular:");
			
			double ladoH = x.nextDouble();
						
			System.out.println("introduce el valor de la apotema "
					+ "del hexágono regular:");
			
			double apoH = x.nextDouble();
			
			double areaH = 3*ladoH*apoH;
			
			System.out.print("El área de tu hexágono es de ");
			
			System.out.print(areaH);
			
			System.out.println(" centímetros cuadrados");
			
			break;
			
		case 5:
			
			System.out.println("Introduce el radio de la circumferencia:");
			
			double radioC = x.nextDouble();
			
			double resultado = radioC *radioC * Math.PI ;
			
			System.out.println("El área de tu circumferencia es"
					+ " de " + Math.round(resultado) + " centímetros cuadrados.");
			break;
			
		default: //Default es como else.
			System.out.println("La opción no es correcta.");
			
			
		}
		
		}

	

}
