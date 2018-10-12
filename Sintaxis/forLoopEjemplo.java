import javax.swing.JOptionPane;
public class forLoopEjemplo {

	public static void main(String[] args) {
		
		
		int punto;
		
		int arroba;
		
		do {
			
			String mail = JOptionPane.showInputDialog("Introduce tu E-Mail:");
			
			arroba = 0;
			
			punto = 0;
			
			for(int i = 0; i< mail.length() ; i++) {
				
								
				if (mail.charAt(i) == '@') {
					
					
					
					arroba ++;	
							 	
						
				}
				else if(mail.charAt(i) == '.'){
					
					punto++;
					
					
				}
				
			}
		}while (arroba != 1 || punto < 1);
		
	
		//System.out.println("puntos : " +punto);
		//System.out.println("arrobas: " +arroba);
		
		if (arroba == 1 && punto > 0) {
			
			System.out.println("E-Mail correcto");
			
		}
		
		else if (arroba != 1 ||punto == 0) {
			System.out.println("E-Mail incorrecto");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
	}	
		
}	
		
		/*
		  String mail = JOptionPane.showInputDialog("Introduce tu E-Mail:");
		
		int numero_arrobas = 0;
		
		for(int i = 0; i< mail.length() ; i++) {
			
			
			
			if (mail.charAt(i) == '@' && numero_arrobas == 0) {
				
				System.out.println("E-Mail correcto");
				
				numero_arrobas++;
					
			}
						
				
			}
		if (numero_arrobas ==0 ) {
			System.out.print("E-Mail incorrecto.");
		}
			
		}
		

	
		 */
		
		