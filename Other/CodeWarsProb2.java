import java.util.*;
public class CodeWarsProb2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int mb = input.nextInt() * 1024;
		
		int songs = mb / 11;
		
		System.out.println(songs + " songs");

	}

}
