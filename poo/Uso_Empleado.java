package poo;

import java.util.*;

/*Ahora vamos a hacer lo mismo que en el programa coche y 
 * Uso_Coche, pero vamos a hacer todo el programa en una sola clase. 
 hacer esto no es muy recomendable, pero era una de las clases del curso y hay que 
 saber que se puede hacer.*/
public class Uso_Empleado {
	public static void main(String[] args) {

		Jefe jefeRRHH = new Jefe("Juan", 55000, 2006, 9, 25);

		jefeRRHH.establece_incentivo(2570);

		Empleado[] mis_empleados = new Empleado[6];

		mis_empleados[0] = new Empleado("Ana", 30000, 2000, 7, 7);

		mis_empleados[1] = new Empleado("Carlos", 50000, 1995, 6, 15);

		mis_empleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);

		mis_empleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);

		mis_empleados[4] = jefeRRHH;

		mis_empleados[5] = new Jefe("Maria", 95000, 1999, 5, 26);// podemos hacer esto ya que jefe hereda de empleado
		// , es decir, un jefe es un empleado.

		// Comparable ejemplo = new Empleado("Elisabeth"); Ésto también se puede hacer

		Empleado diector_comercial = new Jefe("Sandra", 85000, 2012, 3, 3);

		System.out.println(jefeRRHH.Tomar_decisiones("dar más días de vacaciones a los empleados."));

		if (diector_comercial instanceof Jefe) {

			((Jefe) diector_comercial).Tomar_decisiones("Dar un buen curso" + " de programación a sus empleados.");

			System.out.println("El director general es un jefe.");
			// instanceof sirve para ver si un objeto pertenece a una clase.
			// en este caso, si diector_comercial pertenece a la clase jefe, se ejecuta la
			// línea de codigo.
		}

		for (Empleado e : mis_empleados) {
			e.sube_sueldo(5);

			e.establece_bonus(1000);
		}
		Arrays.sort(mis_empleados);// Para ordenar por sueldo los empleados.

		for (Empleado e : mis_empleados) {
			System.out.println("Nombre: " + e.dime_nombre() + " \n Sueldo: " + e.dime_sueldo() + " \n Fecha de alta: "
					+ e.dime_fecha() + " \n Bonus: " + e.damebonus());
		}
		Arrays.sort(mis_empleados);
	}
}

class Empleado implements Comparable, Bonus {// Cuand pones varias clases en un fichero solo la clase main puede ser
												// public.

	public Empleado(String nom, double sue, int agno, int mes, int dia) {// Esto es un método constructor.
		// Este tiene unos parámetros y tiene que tener el MISMO nombre que la clase en
		// la que está
		// El constructor de encarga de darle un estado inicial a un objeto.

		nombre = nom;

		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);// Ponemos mes-1 porque enero es el mes
																					// 0

		altaContrato = calendario.getTime();

	}

	public Empleado(String nom) {/*
									 * éste constructor tiene el mismo nombre que el otro constructor. Si solo sabes
									 * el nombre del empleado, con este constructor solo tienes que preocuparte de
									 * poner el nombre del empleado y ya está. El this(); rellena los otros campos
									 * por un número por defecto.
									 */
		this(nom, 50000, 2020, 1, 1);
	}

	public String dime_nombre() {// Getter

		return nombre;
	}

	public double dime_sueldo() {// Getter
		return sueldo;
	}

	public Date dime_fecha() {// Getter
		return altaContrato;
	}

	public void sube_sueldo(double porcentaje) {// Setter

		sueldo += (porcentaje / 100) * sueldo;

	}

	public int compareTo(Object miObjeto) {// Usamos esto para ordenar por sueldo a los empleados.

		Empleado otroEmpleado = (Empleado) miObjeto;

		if (this.sueldo < otroEmpleado.sueldo) {
			return -1;
		} else if (this.sueldo == otroEmpleado.sueldo) {
			return 0;
		} else {
			return 0;
		}
	}

	public int damebonus() {

		return bonus;
	}

	public void establece_bonus(int bonus) {
		this.bonus = bonus;
	}

	private int bonus;
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}

class Jefe extends Empleado implements Jefes {// La palabra final hace que ninguna otra clase pueda heredar de jefe.
	private double incentivo;

	public Jefe(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);

	}

	public void establece_incentivo(double b) {
		incentivo = b;
	}

	public double dameSueldo() {
		double sueldoJefe = super.dime_sueldo();// El super. hace que el métido dime_sueldo no se llame a si mismo
												// (parecido a this.)
		return sueldoJefe + incentivo;

	}
	// Cuando implementamos una interfaz estamos obligados a crear todos los métodos
	// que tiene ésta interfaz dentro de la clase.

	public String Tomar_decisiones(String decision) {
		return "Un miembro de la dirección la tomado la decisión de " + decision;
	}

}

/*
 * MANERA TOSCA DE HACERLO Empleado empleado1 = new Empleado("Xavi Gordillo" ,
 * 85000, 1990, 12,17 ); Empleado empleado2 = new Empleado("Juan" , 95000, 1995,
 * 06,02 ); Empleado empleado3 = new Empleado("Maria" , 105000, 2002, 03,15 );
 * 
 * empleado1.sube_sueldo(5); empleado2.sube_sueldo(5); empleado3.sube_sueldo(5);
 * 
 * System.out.println(empleado1.dime_nombre() + ": \n" + "Cobra " +
 * empleado1.dime_sueldo() + "€ al año. \n" + "Lleva trabajando aquí desde " +
 * empleado1.dime_fecha() + ". \n" ); System.out.println(empleado2.dime_nombre()
 * + ": \n" + "Cobra " + empleado2.dime_sueldo() + "€ al año. \n" +
 * "Lleva trabajando aquí desde " + empleado2.dime_fecha() + ". \n" );
 * System.out.println(empleado3.dime_nombre() + ": \n" + "Cobra " +
 * empleado3.dime_sueldo() + "€ al año. \n" + "Lleva trabajando aquí desde " +
 * empleado3.dime_fecha() + ". \n" );
 */

// Hacer casting de objetos:
// Jefe jefa_finanzas = (Jefe)mis_empleados[5]; <<<ESTO DA UN ERROR Y NO SÉ POR
// QUÉ

// jefa_finanzas.establece_incentivo(55000);
