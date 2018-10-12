package trash;

public class prueba69 {

	public static void main(String[] args) {

		prueba69 b = new prueba69();
		
		System.err.println(b.seriesSum(3));
		
	}

	public prueba69() {
		
		
	}
	
	public String seriesSum(int n) {

		  String result = "";
		  
		  int v = 1;
		  
		  float res = 0;
		  
		  for(int i = 0; i < n; i++){
			  
			  float r = 1/v;
		  
			  res+= r;
		  
			  v= v+3;
		  
			  System.err.println(res);

		  }
		  
		  
		  res = res * 100;
		  
		  result = "" + (int)res /100;

		  return result;

		}
	
}
