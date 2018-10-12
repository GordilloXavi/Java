package excepciones_I;
import java.util.*;
public class Entrada_datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�Qu� deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada=new Scanner (System.in);
		
		int decision=entrada.nextInt();
		
		if (decision==1){
			try {
				pedirDatos();
			}catch(InputMismatchException e) {
				System.out.println("Has introducido unos valores inv�lidos.");
				
			}
			
			
		}else{
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();
		
	}
	
		static void pedirDatos()  throws InputMismatchException{	//Le decimos a la clase que lanza una excepci�n InputMismatchException. 	
			//si la excepci�n hereda de IOException (excepci�n comprobada), entonces no hay que poner " throws ..Exception" antes de abrir los corchetes.
			//�sto se considera una mala pr�ctica, ya que se puede arreglar el c�digo para que no lanze la excepci�n y hacer que vaya m�s r�pido que el try/catch
		
			//try {//Es  ejor manejar la excepci�n desde el main (cuando llamamos al metodo), y no desde dentro de m�todo.
			
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		
		int edad=entrada.nextInt();	//Si ponemos una letra en vez de un n�mero se lanzar� una excepci�n de tipo InputMismatchException.
			
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (edad+1) + " a�os");
		
		entrada.close();
			//}catch(InputMismatchException e){
		
		//System.out.println("Has introducido unos valores inv�lidos.");
		
			//}
			
			System.out.println("Hemos terminado");
	}
		
		
}