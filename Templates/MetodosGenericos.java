package clases_propias;

import java.util.Arrays;

public class MetodosGenericos {
	
	
		
		public static <T> String dameelEmentos(T[] ArrayGenerico) {// con el <T> indicamos que el método es genérico, es decir, acepta arrays de cualquier tipo de objetos.
			
			
			return "El array " + "tiene " + ArrayGenerico.length + " elementos.";
			
				
	}
		
		public static <T> T damePrimerElemento(T[] elementos) {
			
			Arrays.sort(elementos);
			
			if (elementos.length > 0)return elementos[0];
			else return null;
			
		}

	public static void main(String[] args) {
		
		Integer[] numeros = {1,2,3}; //ATENTOS! las clases genéricas no aceptan tipos primitivos, por lo tento no podemos poner int[], sino Integer[]
		
		Character[] letras = {'c', 'a', 'r', 'l', 'o', 's'};
		
		Object[] vacio = new Object[0];
		
		System.out.println(MetodosGenericos.dameelEmentos(numeros));
		System.out.println(MetodosGenericos.dameelEmentos(letras));
		
		System.out.println(MetodosGenericos.damePrimerElemento(numeros));
		System.out.println(MetodosGenericos.damePrimerElemento(letras));
		System.out.println(MetodosGenericos.damePrimerElemento(vacio));

		
		
	}

}
