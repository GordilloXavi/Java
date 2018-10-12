import java.util.*;

public class CodeWarsProb5 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int R = input.nextInt();
		int r = input.nextInt();
		
		double V = 2 * (3.14 * 3.14) * R * (r*r);
		
		
		System.out.printf("%.2f", V);
		System.out.println(" cubic millimeters are needed");

	}

}
