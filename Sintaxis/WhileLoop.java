import javax.swing.*;
public class WhileLoop {

	public static void main(String[] args) {
		
		String clave = "xavigr00";
		
		String password = "";
		
		password = JOptionPane.showInputDialog("Escribe tu contraseña: ");
		
		if (clave.equals(password) == true) {
			
			System.out.println("Contraseña correcta.");
			
		}
		
		while (clave.equals(password) == false){
			
			password = JOptionPane.showInputDialog("Contraseña incorrecta. Vuelve a escribir"
					+ " tu contraseña: ");
			if (clave.equals(password) == true) {
				
				System.out.println("Contraseña correcta.");
			}
	}

}
}