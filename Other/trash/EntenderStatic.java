package trash;

public class EntenderStatic {
	
	public static void main(String[] args) {
		
		EntenderStatic uno = new EntenderStatic(1);
		
		EntenderStatic dos = new EntenderStatic(2);
		
		System.out.println(uno.num1 + "   blaze? " + uno.blaze);
	}
	
	private int num1;
	static int blaze = 420;
	

	public EntenderStatic(int num) {
		
		num1 = num;
		
		blaze ++;
		
		System.out.println("My num: " + num + ", and " + blaze + " blaze it");
		
	}

	

		}