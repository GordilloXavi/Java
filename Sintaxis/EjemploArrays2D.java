import javax.swing.*;
public class EjemploArrays2D {
	public static void main(String[] args) {
						
		double incremento = 0;
		double interes = 0.1;
		
		double tabla [][] = new double [6][5];
		
		double a = Double.parseDouble(
				JOptionPane.showInputDialog("Metele un numero de dineros"));		 
		
		for (int i = 0; i<6 ; i++) {
			double acumulado = a;
			System.out.println(Math.round((interes+incremento)*100) + "%:");
			System.out.println();
			for( int j = 0 ; j <5 ; j++ ) {
				if (j != 0) {
				acumulado = acumulado + acumulado*(interes+ incremento);
				
				tabla [i][j] = acumulado ;
				
				System.out.printf("%1.2f",tabla [i] [j]);
				System.out.print(" ");
				System.out.println();
				}
				else {
					
					tabla [i][j] = acumulado ;
										
					System.out.println( tabla [i][j]);
				}
			}
			System.out.println();
			incremento += 0.01;
		}
	}
}
