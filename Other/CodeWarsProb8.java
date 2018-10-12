import java.util.*;
public class CodeWarsProb8 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String a  = input.nextLine();
		
		for (int i = 0; i< a.length(); i++) {
			char c = a.charAt(i);
			if (Character.isUpperCase(a.charAt(i))) {
				System.out.print(Character.toLowerCase(c));
			}else {
				char c1 = a.charAt(i);
				System.out.print(Character.toUpperCase(c1));
			}
		}
		
	}

}
