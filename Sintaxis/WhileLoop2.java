import java.util.*;
public class WhileLoop2 {
	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);
		double random = Math.random() * 100;
		
		int rounded = (int)random;
		
		
	
		double input = Math.random();
		
		//System.out.println(rounded );
		
		int intentos;
		
		intentos = 0;
		
		while (input != rounded) {
			
			intentos++;
			
			System.out.println("Introduce un n�mero entre el 1 y el 100:");
			
			input = a.nextInt();
			
			if (input > rounded) {
								
				System.out.println("El n�mero es demasiado alto!");
			
				
				
			
			}
			
			else if (input < rounded) {
				
				System.out.println("El n�mero es demasiado bajo!!");
				
				
			}
				
			else {	
				
				
				
					System.out.println("Enhorabuena! Has acertado el n�mero!");
					
					System.out.println("El n�mero m�gico era el " + rounded);
					
					System.out.println("Has necesitado "+  intentos + " intentos.");
					
					a.close();
				
			}
				
		
	
		
		
	}
	}
}