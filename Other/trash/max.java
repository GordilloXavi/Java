package trash;

public class max {

	public static void main(String[] args) {

		int[] h = new int[10];
		
		for(int i = 0; i<h.length; i++) {
			h[i] = (int)(Math.random()*100);
		}
		
		max.printArr(h);
		max.findMax(h);
		
	}
	
	static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	
	static void findMax(int[] arr) {
		
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (max < arr[i])
			
			max=arr[i];
		}
		
		
		System.out.println("highest number: " + max); 
		
	}

}
