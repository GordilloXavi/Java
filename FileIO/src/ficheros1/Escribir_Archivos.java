package ficheros1;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Archivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escribiendo escribir = new Escribiendo();
		
		escribir.escribir();
		
	}

}


class Escribiendo{
	
	public void escribir() {
		
		String frase = "Esto es una prueba de escritura.";
		
		try {
			FileWriter escritura = new FileWriter("C:\\Users\\Xavi\\Desktop\\PROGRAMAS JAVA\\ficherosEscribir.txt", false);//Fipas porque la clase por si misma crea un archivo con ese nombre sin que tu tengas que hacer nada.
			//Si queremos escribir en un archivo existente, ponemos trues en el segundo parámetro del constructor. Si ponemos false (o nada), crea un archivo con ese nombre.
			for(int i = 0; i< frase.length(); i++) {
				
				escritura.write(frase.charAt(i));
				
			}
			
			escritura.close();
			
			
		} catch (IOException e) {
			System.out.println("Archivo no encontrado");
		}
		
		
		
		
	}
	
	
}