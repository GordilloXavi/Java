package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		
		persona[] lasPersonas = new persona[3];
		
		lasPersonas[0] = new Empleado2("Juan", 70000, 2020, 1, 1);
		
		lasPersonas[1] = new Alumno("Xavi", "ingenieria Informática");

		//lasPersonas[2] = new persona("Anónimo");
		
		lasPersonas[2] = new Empleado2("Antonio");
		
		for(persona e: lasPersonas) {
			System.out.println("Nombre: " + e.DameNombre());
			System.out.println(e.dameDescripcion());
			e.IncrementaId();
		}
		
	}

}

abstract class persona{//Si una clase lleva un método abstracto, la clase también tiene que ser abstracta.
	
	static private int Id = 0;
		
	public persona(String nom) {
		nombre = nom;
		
		
	}
	private String nombre;
	
public String DameNombre() {
	return nombre;
}
public abstract String dameDescripcion();
//Método abstracto.
//Es un método que será diferente para cada clase que herede de persona 
//(a diferencia del método nombre, que es igual para todas las clases que heredan de persona. )

public void IncrementaId() {
	Id++;
}

public int DameId() {

	return Id;
	
}

}




class Empleado2 extends persona{
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);//Ponemos mes-1 porque enero es el mes 0
		
		altaContrato = calendario.getTime();
		
		
	}
	
	public String dameDescripcion() {
		return "Este empleado tiene un Id = " + DameId() + " y  un sueldo = " + sueldo;
	}
	
	
	public Empleado2(String nom) {
	
		this(nom, 50000, 2020 , 1, 1);
	}
	
	
	public double dime_sueldo() {
		return sueldo;
	}
	
	public Date dime_fecha() {
		return altaContrato;
	}
	
	public void sube_sueldo(double porcentaje) {
		
		
		sueldo += (porcentaje/100) * sueldo;
		
	}
	

	private double sueldo;
	private Date altaContrato;

}

class Alumno extends persona{

	private String carrera;
	
	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}
	
	public String dameDescripcion() {
		return "Este alumno tiene un Id = " + DameId() + " y está estudiando la carrear de " + carrera;
	}//Observar que dameDescripcion devuelve algo diferente depenmdiendo de si está
	//en la clase alumno o en la clase Empleado2. De ahí que sera un método abstracto.
	
}




