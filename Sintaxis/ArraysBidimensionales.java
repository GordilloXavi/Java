
public class ArraysBidimensionales {

	public static void main(String[] args) {
		
		int [][] matrix = {
				{10,15,18,43,56},
				{76,28,23,67,91},
				{54,23,76,12,87},
				{76,12,54,12,76}			
				
		};
		
		for (int [] Sub_Array:matrix) {
			
			System.out.println();
			
			for(int number : Sub_Array) {
				System.out.print(number + " ");
				
			
			}
		}
		
		
	}

}









/*
 * SINTAXIS!
 * int [] [] matriz2D = new int [4] [5];  
 * 
 * Primera matriz 
 contiene 4 matrizes las cuales contienen 5 elementos cada una
Se pueden rellenar de forma manual como las otras, pero es la muerte (20 elementos)
matriz2D [0] [0] = 15;
matriz2D [0] [1] =32;
...
...
matriz2D [4] [5] = 581;

*/
//PROGRAMA EJEMPLO:
/*
int [] [] matrix = new int [5] [5];

for (int i = 0 ; i < 5 ; i++) {
	System.out.println();
	for (int j =0 ; j<5 ; j++) {
		matrix [i][j] = (int)(Math.random() * 50);
		
		System.out.println(" Posición ["+i+"] ["+j+ "] = "+matrix [i][j]);
		
	}
}*/