package poo;
class Empleados{
	
private final String nombre;//Así hacemos que el nombre no se pueda cambiar 
//una vez hemos creado el constructor Empleados. nombre es una CONSTANTE

private String seccion;

private final int Id;
private static int IdSiguiente= 1;

public Empleados(String nom) {
	
	nombre = nom;
	seccion = "Administración";
	Id = IdSiguiente;
	IdSiguiente++;
	
}

public static String dimeIdSiguiente() {//Método Static.
	return "El IdSiguiente es " + IdSiguiente;
}



public void Cambiaseccion(String seccion) {
this.seccion = seccion;
}
public String dimedatos() {
return "El empleado se llama " + nombre + ", trabaja en " + seccion + " y su Id es "+ Id +".";
}
}
public class EjemploConstructors {

	public static void main(String[] args) {
		
		Empleados xavi = new Empleados("Xavi");
		Empleados juan = new Empleados("Juan");
		Empleados antonio = new Empleados("Antonio");
		
		xavi.Cambiaseccion("Mantenimiento");
		
		System.out.println(Empleados.dimeIdSiguiente());//Para llamar un método Static, hay que usar el nombre de la clase, y no el nombre del objeto. (Empleados. , y no xavi. o el nombre de otro empleado.)
		
		System.out.println(xavi.dimedatos());
		
		System.out.println(Empleados.dimeIdSiguiente());
		
		System.out.println(juan.dimedatos());
		
		System.out.println(Empleados.dimeIdSiguiente());
		
		System.out.println(antonio.dimedatos());
		
		System.out.println(Empleados.dimeIdSiguiente());
		
		
	}

}



