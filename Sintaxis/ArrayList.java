package ArrayList;

import java.util.*;

public class UsoEmpleado {
	
	public static void main(String[] args) {
		/*
		Empleado listaempleados[] = new Empleado[3];
		
		listaempleados[0] = new Empleado("Ana", 45,2500 );
		listaempleados[1] = new Empleado("Antonio",55 , 2000);
		listaempleados[2] = new Empleado("Maria", 25, 2600);
			
		
		for (Empleado e: listaempleados) {
			
			System.err.println(e.dameDatos());
			
		
		//Por fin podemos prescindir del array!
		//ya no hace falta especificar el tamaño de la lista. Podemos añadir elementos infinitamente!!!
		}*/
		
	ArrayList<Empleado> arrayEmpleados= new ArrayList<Empleado>(); //Un arrayList solo puede almacenar objetos en su interior (nada de int, long, double, etc.). Hay que especificar el tipo de objeto que va a almacenar la ArrayList <>
	
	arrayEmpleados.add(new Empleado("Juan", 38, 3000));
	arrayEmpleados.add(new Empleado("Anna", 26, 3000));
	arrayEmpleados.add(new Empleado("Maria", 55, 3000));
	arrayEmpleados.add(new Empleado("Xavier", 18, 3000));
	arrayEmpleados.add(new Empleado("Miguel", 18, 3000));
	arrayEmpleados.add(new Empleado("Roger", 18, 3000));
	arrayEmpleados.add(new Empleado("Pol", 18, 3000));
	arrayEmpleados.add(new Empleado("Laia", 18, 3000));
	
	System.out.println("Hay "+ arrayEmpleados.size() + " empleados:"); 
	/*
	for (Empleado e: arrayEmpleados) {
		
		System.err.println(e.dameDatos());
	
	}*/
	
	System.out.println("El empleado del mes es " + arrayEmpleados.get((int)(Math.random()*arrayEmpleados.size())).dameNombre() + "!!!");
	
	Empleado[] Emplea2 = new Empleado[arrayEmpleados.size()];
	
	arrayEmpleados.toArray(Emplea2);
	
	
	Iterator<Empleado> miIterador = arrayEmpleados.iterator();//Creamos un objeto de tipo iterator con el método iterator() de la clase ArrayList
	
	
	while(miIterador.hasNext()) {//has next devuelve true si hay otro elemento después de éste en el arrya, y false si es el último elemento
		
		System.out.println(miIterador.next().dameNombre()); //el método next() devuelve el suguiente empleado del arrayList
		
	}
	

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
	
	public String dameNombre() {
		
		
		return nombre;
	}
	
	private String nombre;
	
	private int sueldo;
	
	private int edad;


	
}