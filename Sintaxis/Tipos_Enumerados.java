import java.util.*;
public class Tipos_Enumerados{

	enum Talla {
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
			
		
		}
			
		public String Dame_Abr() {
			return abreviatura;
		
		}
		
		private String abreviatura;
	};

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String entrada_datos = entrada.next().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla = "+ la_talla);
		
		System.out.println("Abreviatura = "+ la_talla.Dame_Abr());
	}

}



















/*

/*
 * Si queremos tener una variable talla (para las tallas de la ropa), que sea 
 * String talla = "Grande", y luego la queremos cambiar, a talla = "peque�a", �sto se puede hacer.
 * Pero si queremos que talla solo de pueda cambiar a valores que sean tallas (osea que no podemos hacer que tall = "azul", por ejemplo)
 * debemos crear un TIPO ENUMERADO.
 * Los tipos enumerados no se pueden crear dentro del m�todo main. 
 
	
	
enum Talla {PEQUE�O, MEDIANO, GRANDE, MUY_GRANDE};//�sta es la sintaxis del tipo enumerado.


	public static void main(String[] args) {
		
		Talla s = Talla.PEQUE�O;
		
		Talla m = Talla.MEDIANO;
		
		Talla l = Talla.GRANDE;
		
		Talla xl = Talla.MUY_GRANDE;
		
		
	}
	
*/