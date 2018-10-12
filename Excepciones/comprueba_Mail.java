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
	
	static void entradaTexto() throws ArrayIndexOutOfBoundsException{//IMPORTANTE INDICARLE AL MÉTODO EN CUESTIÓN QUE EL MÉTODO PUEDE TIRAR UNA EXCEPCIÓN

		Scanner sc = new Scanner(System.in);
		
		//GENERANDO UNA EXCEPCIÓN DE FORMA MANUAL
		//HAY QUE LANZAR UNA EXCEPCIÓN QUE SE ADAPTE AL TIPO DE ERROR QUE QUEREMOS GENERAR. 
		//SI NUNGUNA CLASE EXCEPCIÓN SE ADAPTA A NUESTRAS NECESIDADES (UN STRING DEMASIADO CORTO), PODEMOS CREAR UNA EXCEPCIÓN NOSOTROS MISMOS, PERO ESO YA LO VEREMOS MÁS ADELANTE.
		//COMO NO HAY EXCEPCIONES PARA STRINGS CORTAS, USAMOS LA EXCEPCIÓN DE ARRAYS:
		
		System.out.println("Mete un texto con mas de 3 caracteres:");
		
		String s  = sc.nextLine();
		
			
		if(s.length() <= 3) {
			/*
			ArrayIndexOutOfBoundsException miExcepcion = new ArrayIndexOutOfBoundsException();
			
			throw miExcepcion; //apreciamos que el throw es diferente del throws; throws se usa al principio de un método para decir que lanza una excepción. Throw se usa para lanzarla manualmente.
			*/
			
			throw new ArrayIndexOutOfBoundsException();//Más corto
		}else {
			System.out.println("Buen trabajo, me has hecho caso.");
		}
	}

}
