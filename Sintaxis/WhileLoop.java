import javax.swing.*;
public class WhileLoop {

	public static void main(String[] args) {
		
		String clave = "xavigr00";
		
		String password = "";
		
		password = JOptionPane.showInputDialog("Escribe tu contrase�a: ");
		
		if (clave.equals(password) == true) {
			
			System.out.println("Contrase�a correcta.");
			
		}
		
		while (clave.equals(password) == false){
			
			password = JOptionPane.showInputDialog("Contrase�a incorrecta. Vuelve a escribir"
					+ " tu contrase�a: ");
			if (clave.equals(password) == true) {
				
				System.out.println("Contrase�a correcta.");
			}
	}

}
}