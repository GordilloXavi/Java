package file_class;
import java.io.File;


public class Pruebas_rutas {

	public static void main(String[] args) {
		
		
		File archivo1 = new File("ejemplo_archivo"); //Construimos un objeto file y le especificamos una ruta. Si no le poneoms una ruta válida (como en el ejemplo), toma la carpeta del proyecto en el que estamos por defecto.
		
		System.out.println(archivo1.getAbsolutePath()); //Aquí podemos ver la ruta del archivo. Genial!
		
		System.out.println(archivo1.exists());//nos dice si el archivo que tenemos existe o no.
	}

}
