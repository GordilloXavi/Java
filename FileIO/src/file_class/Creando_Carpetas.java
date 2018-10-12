package file_class;
import java.io.*;
public class Creando_Carpetas {

	public static void main(String[] args) {

		File buscador = new File("D:"+ File.separator +"Documents"+File.separator + File.separator +"Nueva_carpeta_Ejemplo_Java"); // File.separator es como poner una barra /. Pero como en diferentes sitemas operatifos las barras pueden ser diferentes, ponermos 
		//Separator para hacer que nuestro programa sea full multiplataforma
		
		File nuevoArchivo = new File("D:"+ File.separator +"Documents"+File.separator + File.separator +"Nueva_carpeta_Ejemplo_Java" + File.separator + "nuevoArchivo.txt" );
		
		
		buscador.mkdir(); //Crea una nueva carpeta en la ruta que le hemos puesto  en el segundo argumento del constructor
		
		try {
			nuevoArchivo.createNewFile();//crea un nuevo archivo de texto en la ruta especificada. 
		} catch (IOException e) {
			System.out.println("El archivo ya existe!");
			e.printStackTrace();
		}
		
	}

}
