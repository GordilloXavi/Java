import java.util.*;

public class Condicionales {

	private static Scanner question;

	public static void main(String[] args) {
		
		question = new Scanner(System.in);
		
				
		System.out.println("Cuál es tu edad?");

		int edad = question.nextInt();
		
		if (edad >= 18){
			
			System.out.println("Bienvenido a nuesta página para adultos.");
	}
		else {
			System.out.println("Lo sentimos, "
					+ "pero no puedes acceder a nustra página.");
		}
		
	}
	
}
			
	
