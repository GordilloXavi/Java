package clases_propias;

public class Pareja<T> {//con los corchetes y una <T> le indicamos que va a tratar con objetos de tipo Object, es decir, una clase genérica

	public Pareja(){
		
		primero = null;
		
		
	}
	
	public void setPrimero(T nuevoValor) {
		
		primero = nuevoValor;
		
		
	}
	
	public T getPrimero() {
		
		
		return primero;
		
		
	}
	
	public static void imprimirTrabajador(Pareja<? extends Empleado> P) {//si queremos que el método sea usable por las subclases de empleado, tenemos que poner en el tipo de dato <? extends Empleado>, en 
		//vez de <Empleado> solamente
		
		Empleado primero = P.getPrimero();
		
		System.err.println(primero);
		
	}
	
	
	private T primero;
	
	
	

}
