package ficheros1;

import java.io.*;


public class Acceso_fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Acceso_fichero accediendo = new Acceso_fichero();
		
		accediendo.lee();
		
	}
	
	
	
	public void lee() {
		
		 
		
		try {
			
			FileReader entrada = new FileReader("C:\\Users\\Xavi\\Desktop\\PROGRAMAS JAVA\\ficherosPrueba.txt");
			
			int c = 0;
			
			while(c != -1) {
				
				c = entrada.read();
				
				char letra = (char)c;
				
				 System.out.print(letra);
				
			}
			
		} catch (IOException e) {
			
			System.out.println("Archivo no encontrado");
			
		}
		
		
	}

}

