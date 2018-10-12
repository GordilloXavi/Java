import javax.swing.JOptionPane;
public class DoWileLoop2 {

	public static void main(String[] args) {
		
		
						
		String altura;
			
		int hombre = 110;
		
		int mujer = 120;
		
		String genero;
		
		do {

			genero = JOptionPane.showInputDialog("Escribe aquí tu género");

			

			if (genero.equalsIgnoreCase("hombre")){
				
				altura = JOptionPane.showInputDialog("Escribe aquí tu altura en cm");
				
				int pesoH = Integer.parseInt(altura) - hombre;
				
				System.out.println("Tu peso ideal son " + pesoH + " kilogramos.");
				
				break;
			}
				
			else if (genero.equalsIgnoreCase("mujer") ) {
				
				 	altura = JOptionPane.showInputDialog("Escribe aquí tu altura en cm");
					
					int pesoM = Integer.parseInt(altura) - mujer;
					
					System.out.println("Tu peso ideal son " + pesoM + " kilogramos.");
					
					break;
			}
					
			else {
						System.out.println("Género no válido."
								+ " Vuelva a introducir su género.");
						
					}
				

					
			} while (genero.equalsIgnoreCase("hombre")||
			genero.equalsIgnoreCase("mujer")
				||genero.equalsIgnoreCase("hombre") == false
				||genero.equalsIgnoreCase("mujer") == false);

	}

}










