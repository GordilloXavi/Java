package clases_propias;

public class UsoPareja {

	public static void main(String[] args) {
		
		
		Pareja<String> ejemplo = new Pareja<String>();
		
		ejemplo.setPrimero("Diego");//como le hemos dicho <String, este método ya está preparado para recibir objetos de tipo string. Genial!!>
		
		
		System.out.println(ejemplo.getPrimero());
		
		Persona pers1 = new Persona("Miguelangel");
		
		Pareja<Persona> ejemplo2 = new Pareja<Persona>();
		
		ejemplo2.setPrimero(pers1);
		
		System.err.println(ejemplo2.getPrimero().getName());
		
		
	}

}
class Persona{
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
		
		
	}
	
	public String getName() {
		return nombre;
	}
	
	
	
	
	private String nombre;
	
}