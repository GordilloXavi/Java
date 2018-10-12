
import java.util.*;

public class EntradaDeInfo {

	private static Scanner xx;

	public static void main(String[] args) {
		
		xx = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		
		String nombre_usuario = xx.nextLine();
		
		System.out.println("Introduce tu edad, por favor: ");
		
		int edad = xx.nextInt();
		
		System.out.println("Tú te llamas "+ nombre_usuario + " y tienes "+
		edad + " años.");
	}

}
