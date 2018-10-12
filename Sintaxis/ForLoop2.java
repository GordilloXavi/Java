import java.util.*;
public class ForLoop2 {

	public static void main(String[] args) {
		
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un número y la \n "
				+ "consola extraerá su factorial: ");
		
		long fact = 1L;
		
		long num = input.nextInt();
		
		for ( long i = 1L ; i <= num ; i ++) {
			
			
			fact = fact * i;
			
			
						
		}
		
		
		
		System.out.println(num + " factiorial es " + fact );
		System.out.println("9,223,372,036,854,775,807");

	}

}
