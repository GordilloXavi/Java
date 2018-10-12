package file_class;


import java.io.File;
import java.io.File.*;


public class Acceso_ficheros {

	public static void main(String[] args) {
		
		//Vamos a hacer una clase que imprima todos los archivos que hay en una carpeta.
		
		File buscador = new File("D:"+ File.separator +"Documents"+File.separator); // File.separator es como poner una barra /. Pero como en diferentes sitemas operatifos las barras pueden ser diferentes, ponermos 
		//Separator para hacer que nuestro programa sea full multiplataforma
		
		 String[] nombres_archivo = buscador.list();
		 
		 for(String s: nombres_archivo) {
			 System.out.println(s);
			 
			 File f = new File(buscador.getAbsolutePath(), s);//Es una archivo con la ruta de "buscador" y el nombre de s.
			 
			 if(f.isDirectory()){
				 
				 String[] archivos_subcarpeta = f.list();
				 
				 for(String g: archivos_subcarpeta) {
					 System.out.println(g+ "ARCHIVO DE SUBCARPETA");
				 }
				 
			 }
			 
		 }
		
		 //El método isDirectory nos dice si un archivo es una carpeta (directorio = carpeta)
		 
		 
		
		
	}

}
