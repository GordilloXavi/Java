package excepciones_I;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		
		int figura = 0;

		try {
		
		figura = sc.nextInt();
					
int cuadrado = figura * figura;
		
		System.out.println(cuadrado);
		
		}catch(InputMismatchException e) {
			System.out.println("muy mal");
		}finally {//Lo que introduzcas dentro de esta cl�usula finally se va a ejecutar sin importar si se ha producido o no una excepci�n.
			sc.close();

		}

		
		
		
	}

}
