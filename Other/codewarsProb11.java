import java.util.*;

public class codewarsProb11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		char[] letras = new char[input.length()+1];
		
		char[] invertido = new char[input.length()+1];
		
		for (int i = 0; i < input.length(); i++) {
			letras[i] = input.charAt(i);
		}
		
		int largo = input.length();
		
		int count = 0;
		
		for(char j: letras) {
			invertido[largo-count] = j;
			count++;
		}
		int  c =0;
		for (char k: invertido ) {
			
			if(c!=0)System.out.print(k);
			c++;
		}
		
		
		
		
	}

}
