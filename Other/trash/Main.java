package trash;

public class Main implements Runnable{
	
	public static void main(String[] args) {
		
		Runnable r = new Main();
		
		Thread t = new Thread(r);
		
		t.start();
		
	}

	@Override
	public void run() {

		contar();
	}
	
	
	void contar() {
		
		int num = 0;

		for (int i = 0; i< 50; i++) {
			System.out.print(num + " ");
			num ++;
		}
		
	}
	
}