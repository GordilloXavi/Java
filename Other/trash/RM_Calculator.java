package trash;
import java.util.*;

public class RM_Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Weight lifted: ");
		
		int n = sc.nextInt();
		
		System.out.println("reps: ");

		int r = sc.nextInt();
		
		System.out.println("1RM = " + calculate(n,r));
		System.err.println("Esta mierda no funciona para nada");
		
	}
	
	static int calculate(int num, int reps) {
		
		int rm = num/reps * 10;
		
		return rm;
		
		
		
	}

}

