package excepciones_I;

import java.util.Scanner;

public class comprueba_Mail {

	public static void main(String[] args) {

		try {
		entradaTexto();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No me has hecho caso...");
		}
	
	
	}
	
	static void entradaTexto() throws ArrayIndexOutOfBoundsException{//IMPORTANTE INDICARLE AL M�TODO EN CUESTI�N QUE EL M�TODO PUEDE TIRAR UNA EXCEPCI�N

		Scanner sc = new Scanner(System.in);
		
		//GENERANDO UNA EXCEPCI�N DE FORMA MANUAL
		//HAY QUE LANZAR UNA EXCEPCI�N QUE SE ADAPTE AL TIPO DE ERROR QUE QUEREMOS GENERAR. 
		//SI NUNGUNA CLASE EXCEPCI�N SE ADAPTA A NUESTRAS NECESIDADES (UN STRING DEMASIADO CORTO), PODEMOS CREAR UNA EXCEPCI�N NOSOTROS MISMOS, PERO ESO YA LO VEREMOS M�S ADELANTE.
		//COMO NO HAY EXCEPCIONES PARA STRINGS CORTAS, USAMOS LA EXCEPCI�N DE ARRAYS:
		
		System.out.println("Mete un texto con mas de 3 caracteres:");
		
		String s  = sc.nextLine();
		
			
		if(s.length() <= 3) {
			/*
			ArrayIndexOutOfBoundsException miExcepcion = new ArrayIndexOutOfBoundsException();
			
			throw miExcepcion; //apreciamos que el throw es diferente del throws; throws se usa al principio de un m�todo para decir que lanza una excepci�n. Throw se usa para lanzarla manualmente.
			*/
			
			throw new ArrayIndexOutOfBoundsException();//M�s corto
		}else {
			System.out.println("Buen trabajo, me has hecho caso.");
		}
	}

}
