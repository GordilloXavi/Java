import java.util.*;
public class CodeWarsProb3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int dist = input.nextInt();
		
		int dehidratation = input.nextInt();
		
		input.close();
		
		System.out.println(dist / dehidratation);
		
	}

}
