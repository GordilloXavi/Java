//import javax.swing.*;
public class MatricesO_Arrays2 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*100);
		
		int numeros [] = new int[num];
		int count = 0;
		
		
			
		for(int a: numeros) { // IMPORTANTE BUCLE FOR EACH PARA ARRYS!
			
			numeros[a] = (int)(Math.random() * 100);
			
			
			count++;
						
			if (count % 15 ==0){
				
				System.out.println(numeros[a] + ", ");
				
				
			}
			else {
				System.out.print(numeros[a] + ", ");
			}
			
		}
		
				
		
	}

}


/*
String [] paises = new String [8];

		

for (int i = 0 ; i < paises.length ; i++) {
	
	String pais = JOptionPane.showInputDialog("Escribe el nombre del paás: ");

	paises [i] = pais;
	
	System.out.println(paises[i]);
	
	
}

for(String j: paises) {
	
	System.out.println(j);
	
}*/