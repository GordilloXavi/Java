import java.util.*;
public class CodeWarsProb6 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		
		int aciertos = 0;
		
		String bet = a.nextLine();
		
		String answer = a.nextLine();
		
		for(int i = 0; i < bet.length() ; i++) {
			
			
				
				if (bet.charAt(i) == answer.charAt(i)) {
					aciertos++;
				}
				
			
			
		}

		System.out.println(aciertos);
	}

}
