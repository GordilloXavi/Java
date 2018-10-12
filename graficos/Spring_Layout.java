package graficos;

import javax.swing.*;

public class Spring_Layout {

	public static void main(String[] args) {

		new marcoMuelle();
	}

}
class marcoMuelle extends JFrame{
	
	marcoMuelle(){
		setBounds(500, 400, 1000, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new laminaMuelle());
		
		setVisible(true);
		
	}
}
class laminaMuelle extends JPanel{
	
	laminaMuelle(){
		
		JButton boton1 = new JButton("Boton 1");
		
		JButton boton2 = new JButton("Boton 2");

		JButton boton3 = new JButton("Boton 3");

		SpringLayout miLayout = new SpringLayout();
		
		setLayout(miLayout);//Si no a�adimos ning�n muelle, pondr� los botones uno encima de otro
		//y parecer� que solo hay uno
			
		
		add(boton1);	
				
		add(boton2);		

		add(boton3);		

		Spring muelle1 = Spring.constant(0, 10, 100);//Crea un muelle con los valores siguientes 
		//(valor m�nimo, valor en reposo y valor m�ximo). Dependiendo de �stos, 
		//el muelle tiene una determinada fueza, rebote, etc.
		
		Spring muelleRigido = Spring.constant(20);//construye un muelle que no se estira. el par�metro es
		//la distancia entre los componentes (o largo de muelle), que no va a cambiar
		
		miLayout.putConstraint(SpringLayout.WEST, boton1, muelle1, SpringLayout.WEST, this);
		//Los argumentos hacen referencia a:
		//1. Punto inicial del muelle (donde comienza), respecto al componente(Jbutton)
		//2. Componente sobre el que trabajo(JButton)
		//3. Punto final del muelle, respecto al compontnet (JButton)
		//4. Contenedor donde se sit�a todo (la l�mina, por eso usamos this.)
		
		miLayout.putConstraint(SpringLayout.WEST, boton2, muelleRigido, SpringLayout.EAST, boton1);
		//lo mismo para los otros botones.
		//PARA ACLARAR TODO ESTO, VER V�DEO!!(EN SERIO, ESTO ES COMPLICADO )
		//   https://www.youtube.com/watch?v=GJVgIyFRktM&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=116
		
		miLayout.putConstraint(SpringLayout.WEST, boton3, muelleRigido, SpringLayout.EAST, boton2);
		//Si ponemos el muelle r�gido, la distancia entre los componentes ser� siempre la misma. En cambio, 
		//Si ponemos el muelle que se estira, la distancia entre los componentes se estirar�. 

		miLayout.putConstraint(SpringLayout.EAST, this, muelle1, SpringLayout.EAST, boton3);

	}
}