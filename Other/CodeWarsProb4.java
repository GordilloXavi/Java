import java.util.*;
public class CodeWarsProb4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int an = input.nextInt();
		
		int m = input.nextInt();
		
		input.close();
		
		int sum = 0;
		int resta = 0;
		int n = an;
		n++;
		if (m != 0) {
		for(int i = 0; i < m; i++) {
			
			
			sum = sum + n;
			
			n++;			
			
		}
		
		n = an;
		n--;
		
		for(int j = 0 ; j < m; j++) {
			
			
			resta = resta + n;
			
			n--;
			
		}
		System.out.print(sum + " ");
		System.out.println(resta );
		
		}
	}

}
