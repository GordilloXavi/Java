package poo;

public class Furgoneta extends Coche{
//Extends coche quiiere decir que la clase Furgoneta
	//hereda los valores iniciales de la clase coche y además se le pueden añadir más características.
	
		private int capacidad_carga;
		private int plazas_extra;
		 
		public Furgoneta(int capacidad_carga, int plazas_extra) {
			
			super(); //Llama al constructor de la clase de la que hereda (Coche).
			
			this.capacidad_carga = capacidad_carga;
			this.plazas_extra = plazas_extra;
		}
		public String Dime_datos() {
			return "La capacidad de la furgoneta es de " + capacidad_carga + "kg. \n"
					+ "Y las plazas son " + plazas_extra;
		}
	}

