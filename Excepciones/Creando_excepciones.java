package excepciones_I;

import java.util.Scanner;

public class Creando_excepciones {

	public static void main(String[] args) {

		
		try {
			entradaTexto1();
		} catch (longitudCarateresErronea e) {

			System.out.println("No me has hecho caso... (tiene menos de 3 caracteres)");

			e.printStackTrace(); //con esto podemos ver el mensaje que le hemos puesto a la excepción.
			
		}
		
		
	
	
	}
	
	static void entradaTexto1() throws longitudCarateresErronea{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mete un texto con mas de 3 caracteres:");
		
		String s  = sc.nextLine();
		
			
		if(s.length() <= 3) {
			
			throw new longitudCarateresErronea("El mail es demasiado corto");
		}else {
			System.out.println("Buen trabajo, me has hecho caso.");
		}
	}

}

class longitudCarateresErronea extends Exception{
	//Se recomienta que la clase tenga 2 constructores:
	
	public longitudCarateresErronea() {
		
	}
	
	public longitudCarateresErronea(String s){
		
		super(s); //Lamamos al constructor de la clase exception y le metemos el parámetro de la clase. Parecido a poner new Exception(s)
		
		
	}
}


