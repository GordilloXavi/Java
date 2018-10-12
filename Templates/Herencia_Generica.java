package clases_propias;

public class Herencia_Generica {

	public static void main(String[] args) {

		/*
		Empleado elena = new Empleado("Elena", 45, 1500);
		
		Jefe ricardo = new Jefe("Ricardo el Grande", 20, 3000);
		
		Empleado descenso = ricardo;
		*/
		
		Pareja<Empleado> administrativa = new Pareja<Empleado>();
		
		Pareja<Jefe> directora = new Pareja<Jefe>();
		
		//Pareja<Empleado> nuevoEmpleado = directora; //Podemos ver que las clases genéricas no tienen una herencia normal. en el ejemplo comentado de arriba vemos como funciona normalmente la herencia, con el principio 
		
		//ES UN? : el jefe es un empleado? si. Por lo tanto, el jefe hereda de la clase empleado y podemos hacer Empleado x = new Jefe(); sin ningún problema. 
		
		
		Pareja.imprimirTrabajador(administrativa);
		
		Pareja.imprimirTrabajador(directora);//No podemos hacer esto, aunque jefe es un empleado, solo le podemos pasar objetos de tipo empleado por parámetros, y no objetos que hereden de la clase. 
		
		//ahora nos permite hacerlo, ya que en el método imprimirTrabajador hemos puesto Pareja <? extends Empleado>. Con esta corta frase podremos usar todas las subclases que hereden de Empleado, o cualquier otra clase. 

		
		
	}

}

class Empleado{
	
	public Empleado(String nombre, int edad, int sueldo) {
		
		this.nombre = nombre;
		
		this.sueldo = sueldo;
		
		this.edad = edad;
		
		
	}
	
	public String dameDatos() {
		
		
		return "Nombre: " + nombre + ", Edad: "+ edad + ", Sueldo: " + sueldo;
		
	}
	
	
	
	private String nombre;
	
	private int sueldo;
	
	private int edad;


	
}

class Jefe extends Empleado {

	public Jefe(String nombre, int edad, int sueldo) {
		
		super(nombre, edad, sueldo);
		
	
		
		
		
	}
	
	public double incentivo(double  i) {
		
		return i;
		
	}
	
	
}