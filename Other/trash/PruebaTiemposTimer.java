package trash;
import java.io.*;

import javax.swing.JOptionPane;

public class PruebaTiemposTimer {
	public static void main(String[] args) {
		
		guardarTiempo("1000");
		
		
	}

	
	static void guardarTiempo(String tiempo) {
		
		try {
			
			FileWriter guardador = new FileWriter("C:\\Users\\Xavi\\Desktop\\PROGRAMAS JAVA\\tiempos.txt");
			
			for(int i = 0; i< tiempo.length(); i++) {
				
				guardador.write(tiempo.charAt(i));
				
			}
			
			guardador.close();
			
		}catch(Exception e) {
			
			System.out.println("Se ha producido un error");
			
		}
		
		
	}
	
	static String cargarTiempos() {
		
		String tiempo = "";
		
		try {
			
			FileReader lector = new FileReader("C:\\Users\\Xavi\\Desktop\\PROGRAMAS JAVA\\tiempos.txt");
			
			int c = 0;
			
			while(c != -1) {
				
				c = lector.read();
				
				char letra = (char)c;
				
				tiempo += letra;
				
				 //System.out.print(letra);
				
			}
			
		} catch (IOException e) {
			
			//System.out.println("Archivo no encontrado");
			
			JOptionPane.showMessageDialog(null, "Se ha producido un error al cargar tus tiempos", "Error", 0);
			
		}
		
		return tiempo;
		
		
	}
}

