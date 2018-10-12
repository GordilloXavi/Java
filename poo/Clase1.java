package poo;

public class Clase1 {

	protected int mivar = 5;//Protected es un modificador de acceso como public o private, 
	//que hace que se pueda acceder a las clases y a las variables desde clases de otros paquetes, 
	//pero no desde clases de otros ficheros (eso con public si se puede hacer).
	protected int mivar2= 7;
	
	protected String MiMetodo() {//Método getter
		return "El valor de mivar2 es: " + mivar2;
	}
	
}
