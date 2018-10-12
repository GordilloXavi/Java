package ficherosByte;
import java.io.*;

public class Leyendo_y_escribiendo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
		FileInputStream xx = new FileInputStream("C:\\Users\\Xavi\\Desktop\\PROGRAMAS JAVA\\streamsFoto.webp");
		
		
		
		boolean final_ar = false;
		
		int numero_bytes = 0;
		
		long tamanyo_archivo= xx.getChannel().size();
		
		int bytes[] = new int[(int)tamanyo_archivo + 2];

		
		
		while(!final_ar) {
			 
			int byte_entrada = xx.read();
			
			if(byte_entrada >= 0) {
				
				bytes[numero_bytes] = byte_entrada; 
				
			}else {
				final_ar = true;
			}
			
			numero_bytes ++;
			
			//System.out.println(bytes[numero_bytes]);
			
			System.out.println(byte_entrada);

			
			
		}
		System.out.println("La imagen tiene " + tamanyo_archivo + " bytes!");
		
		
		
		
		xx.close();
		
		creaFichero(bytes);

		
		}catch (IOException e) {
			System.out.println("Imagen no encontrada!");
		}
		
		
	}
	
	
	static void creaFichero(int[] datosNuevoFichero) {
		
		
		try{
			
			FileOutputStream fichero_nuevo = new FileOutputStream("C:\\Users\\Xavi\\Desktop\\PROGRAMAS JAVA\\imagenCopia.webp");
			
			for(int i = 0; i< datosNuevoFichero.length; i++) {
				
				fichero_nuevo.write(datosNuevoFichero[i]);
				
			}
			
			fichero_nuevo.close();
			
		}catch(IOException e) {
			System.out.println("Ha ocurrido un error!");
		}
		
		
	}

}
