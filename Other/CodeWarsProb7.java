import java.util.*;
public class CodeWarsProb7 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

		String message = input.nextLine();//Input
		
		char[] caracteres = new char[message.length()];
		
		


		for (int i = 0; i < message.length(); i++) {
			caracteres[i] = message.charAt(i);
			
			//System.out.println(letras[i]);
		}
		
		int cuentaL = 0;
		
		int cuentaN = 0;
		
		for (char i: caracteres) {
			if(! Character.isDigit(caracteres[i]) ){
				//letras[cuentaL] = i;
				cuentaL++;
			}else {
				//numeros[cuentaN] = i;
				cuentaN++;
			}
		}
		
		char letras[] = new char[cuentaL];
		
		char numeros[] = new char[cuentaN];
		
		cuentaL = 0;
		cuentaN = 0;
		
		for (char i: caracteres) {
			if(! Character.isDigit(caracteres[i]) ){
				letras[cuentaL] = i;
				cuentaL++;
			}else {
				numeros[cuentaN] = i;
				cuentaN++;
			}
		}
		
		for(char j: letras) System.out.print(j);
		
		for (char k: numeros) System.out.print(k);
		
	}
}










































/*

Scanner input = new Scanner(System.in);

String message = input.nextLine();

for (int i = 0; i < message.length() ; i++) {
	
	if (message.charAt(i) >= '0' || message.charAt(i) <= '9' ) {
		if (i != message.length() -1) {
			System.out.print(message.charAt(i));
		}
		else {
			System.out.print(message.charAt(i));
		}
	}
	
	
}
/*for(int j = 0 ; j<message.length(); j++) {
	
	if (message.charAt(j) != '0' ||message.charAt(j) != '1' ||
			message.charAt(j) != '2' ||message.charAt(j) != '3' ||message.charAt(j) != '4' ||
			message.charAt(j) != '5' ||message.charAt(j) != '6' ||message.charAt(j) != '7' ||
			message.charAt(j) != '8' ||message.charAt(j) != '9' ) {
		
	}*/