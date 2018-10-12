package poo;

public class Coche {

	private int ruedas; /* Private ENCAPSULA la variable ruedas. Así ruedas
	no se puede modificar desde las otras clases. */
	
	private int largo, ancho, motor, peso_plataforma;
	
	private String color; //Las variables con private solo se pueden modificar creando un método setter y getter en la clase Coche.
	private int peso_total;
	private boolean asientos_cuero , climatizador;
	
	public Coche() {
		ruedas = 4;
		largo = 200;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
		
	}
	
	public String datos_generales() {//Éste es el método Getter. Éste nos devuelve el valor de una prpiedad encapsulada (private).
		return "La plataforma del vehículo tiene " + ruedas + " ruedas, " + largo + "cm de largo, \n"
				+ ancho +"cm de ancho, un motor de " + motor +"CV y un peso de " + peso_plataforma + "kg.";
		//si queremos que devuelva solo el número , substituir String por int, y quitar el mensaje.
	}

	public void establece_color(String color_coche) { //Éste es un método setter. Éste modifica el valor de una propiedad.
		
		color = color_coche;
	}
	
	public String dime_color() {//Otro método getter para poder ver el color del coche.
		return "El color del coche es " + color;
	}
	public String dimeColorFurgo() {
		return "El color de tu furgoneta es " + color +".";
	}
	
	public void configura_asientos(String asientos_cuero) {//SETTER
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true; // el this. sirve para diferenciar 2 variables con el mismo nombre (boolean y String)
		}else {
			this.asientos_cuero = false;
		}
	}
	
	public String dime_asientos() {//GETTER
		if (this.asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie.";
		}
	}
	
	public void configura_climatizador(String climatizador) {//SETTER
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}else {
			this.climatizador = false;
		}
	}
	public String dime_climatizador() {//GETTER
		if (this.climatizador == true) {
			return "El coche tiene climatizador.";
		}else {
			return "El coche no tiene climatizador.";
		}
	}
	
	public String dime_peso_total() {//Éste método es setter y getter a la vez. Ésto es poco recomendable.
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero) {
			peso_total+=50;
		}
		if (climatizador) {
			peso_total +=20;
		}
		return "El peso del coche es de " + peso_total + "kg.";
	}
	
	public int precio_coche() {//GETTER
		int precio_final = 10000;
		if(climatizador) {
			precio_final += 1500;
		}
		if (asientos_cuero) {
			precio_final += 2000;
		}
		return precio_final;
	}
}
