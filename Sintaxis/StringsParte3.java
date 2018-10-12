
public class StringsParte3 {

	public static void main(String[] args) {
		
		String alumno1, alumno2, alumno3, alumno4; 
		
		alumno1 = "Xavi";
				
		alumno2= "Xavi";
		
		alumno3= "xavi"; //Primaera letra en munúscula
		
		alumno4 = "Juan";
		
		System.out.println(alumno1.equals(alumno2));

		System.out.println(alumno1.equalsIgnoreCase(alumno3)); //Da True
		//porque IgnoreCase se la pelan las mayúsculas y munúsculas.
		
		System.out.print(alumno1.equals(alumno4));
	}

}
