package poo;//El programa flama está abajo comentado
import javax.swing.*;
public class Uso_vehiculo {

	public static void main(String[] args) {
		
		
		
		String a;
		
		String vehicle = JOptionPane.showInputDialog("Qué vehículo quieres (Furgoneta / Coche)?");
		
		a=vehicle;
		
		while(a.equalsIgnoreCase("coche") == false && a.equalsIgnoreCase("furgoneta") == false) {
			
			String h = JOptionPane.showInputDialog("Vehículo no reconocido. \n Qué vehículo quieres (Furgoneta / Coche)?");
			
			a=h;
		}
		
		if (a.equalsIgnoreCase("coche")){
			
			int g = Integer.parseInt(JOptionPane.showInputDialog("Cuantos coches quieres?"));
			
			Coche[] coches = new Coche[g];
			
			for (int i = 0; i<g; i++) {
			
			coches [i] = new Coche();
			
			String b = JOptionPane.showInputDialog("De qué clor quieres tu coche " + (i+1)+ "?");
			
			coches[i].establece_color(b);
			
			coches[i].configura_asientos(JOptionPane.showInputDialog("El coche tiene asientos de cuero?"));
			
			coches[i].configura_climatizador(JOptionPane.showInputDialog("El coche tiene climatizador?"));
			
			System.out.println(coches[i].datos_generales());
			
			System.out.println(coches[i].dime_asientos() + "\n" + 
			coches[i].dime_color() + "\n" + coches[i].dime_peso_total() + 
			"\n" + "El precio de coche son "+coches[i].precio_coche()+ "€.");
			System.out.println();
			}
		}else {
			int j = Integer.parseInt(JOptionPane.showInputDialog("Cuantas furgonetas quieres?"));
			
			Furgoneta[] furgonetas = new Furgoneta[j];
			
			for (int k = 0; k<j; k++) {
			
				int o = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de carga de la furgoneta "+ (k+1)+ "?"));
				
				int p = Integer.parseInt(JOptionPane.showInputDialog("Número de plazas de la furgoneta "+ (k+1)+ "?"));
				
			furgonetas[k] = new Furgoneta(o,p);	
			
			String q = JOptionPane.showInputDialog("De qué clor quieres tu furgoneta " + (k+1)+ "?");
			
			furgonetas[k].establece_color(q);
			
			
			System.out.println(furgonetas[k].datos_generales());
			
			System.out.println(furgonetas[k].Dime_datos());
			
			System.out.println(furgonetas[k].dimeColorFurgo());
		
			System.out.println();
			
			
		}
		
	}
	}
}
















/*
Coche Renault = new Coche(); //Esto es instanciar una clase. 
//Reanult es un ejemplar de la clase coche.

// Renault.ruedas = 7;Ésto no se puede haver ya que el encapsulamiento private hace que 
//no podamos cambiar el valor de ruedas. Por lo tanto, para poder print el número de ruedas,
//hay que crear un método GETER.


//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");Sin el método getter ésto no se puede hacer debido al private.


System.out.println(Renault.dime_largo());
*/






















/*
String message = JOptionPane.showInputDialog("Buenas. Quiere un coche o una furgoneta?");

if( message.equalsIgnoreCase("coche")){

Coche mi_coche = new Coche();

mi_coche.establece_color(JOptionPane.showInputDialog("De qué color quieres tu coche?"));

mi_coche.configura_asientos(JOptionPane.showInputDialog("El coche tiene asientos de cuero?"));

mi_coche.configura_climatizador(JOptionPane.showInputDialog("El coche tiene climatizador?"));

System.out.println(mi_coche.datos_generales());

System.out.println(mi_coche.dime_peso_total());

System.out.println(mi_coche.dime_color());

System.out.println(mi_coche.dime_asientos());

System.out.println(mi_coche.dime_climatizador());

System.out.println("El precio final del coche son " + mi_coche.precio_coche()+ "€.");
} else if (message.equalsIgnoreCase("furgoneta")) {
	
	int a =Integer.parseInt(JOptionPane.showInputDialog("Cuál es la capacidad de carga máxima de la furgoneta?"));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Cuantas plazas tiene?"));
	
	Furgoneta c = new Furgoneta(a,b);
	System.out.println(c.datos_generales());
	System.out.println(c.Dime_datos());
}else {
	System.out.println("esto tiene que volver a pedir intro de datos.");
}
*/
