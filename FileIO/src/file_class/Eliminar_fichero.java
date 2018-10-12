package file_class;

import java.io.File;

public class Eliminar_fichero {

	public static void main(String[] args) {

		File buscador = new File("D:"+ File.separator +"Documents"+File.separator + File.separator +"Nueva_carpeta_Ejemplo_Java" + File.separator + "nuevoArchivo.txt");
		
		buscador.delete();

		//Asegurarse de que el archivo existe para poder eliminarlo. 
		
	}

}
