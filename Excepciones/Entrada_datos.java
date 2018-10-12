package excepciones_I;
import java.util.*;
public class Entrada_datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada=new Scanner (System.in);
		
		int decision=entrada.nextInt();
		
		if (decision==1){
			try {
				pedirDatos();
			}catch(InputMismatchException e) {
				System.out.println("Has introducido unos valores inválidos.");
				
			}
			
			
		}else{
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();
		
	}
	
		static void pedirDatos()  throws InputMismatchException{	//Le decimos a la clase que lanza una excepción InputMismatchException. 	
			//si la excepción hereda de IOException (excepción comprobada), entonces no hay que poner " throws ..Exception" antes de abrir los corchetes.
			//Ésto se considera una mala práctica, ya que se puede arreglar el código para que no lanze la excepción y hacer que vaya más rápido que el try/catch
		
			//try {//Es  ejor manejar la excepción desde el main (cuando llamamos al metodo), y no desde dentro de método.
			
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		
		int edad=entrada.nextInt();	//Si ponemos una letra en vez de un número se lanzará una excepción de tipo InputMismatchException.
			
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años");
		
		entrada.close();
			//}catch(InputMismatchException e){
		
		//System.out.println("Has introducido unos valores inválidos.");
		
			//}
			
			System.out.println("Hemos terminado");
	}
		
		
}