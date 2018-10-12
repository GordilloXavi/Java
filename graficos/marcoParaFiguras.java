package graficos;
import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class marcoParaFiguras {

	public static void main(String[] args) {
	
		mymarco miVentana = new mymarco();
		
		laminaFiguras myLamina = new laminaFiguras();

		miVentana.add(myLamina);
		
		Color rosa = new Color(255,150,255);
		
		myLamina.setBackground(rosa);
		
	}
}
 class mymarco extends JFrame{
	 public mymarco() {
		 
		 setTitle("Dibujando");
		 setVisible(true);
		 setBounds(1920/2-350, 1080/2-200, 700, 400);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	 }
	 
 }
 
 class laminaFiguras  extends JPanel{
	 
	 public void paintComponent(Graphics g) {
			
		 super.paintComponent(g);
		 
		Graphics2D g2 = (Graphics2D) g; //Refundición para convertir el objeto g de tipo
		//Graphics al objeto g2 de tipo Graphics2D.
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,200);
		//Hay que instanciarlo así ya que Rectangle2d es una clase abstracta y éstas no se pueden 
		//Instanciar de manera convencional.
		
		g2.setPaint(Color.orange.darker());//Con éste método de Graphics2D podemos establecer el 
		//color con que pintaremos nuestas figuras.
		
		g2.fill(rectangulo);//Dibuja una rectángulo relleno
		
		g2.setPaint(Color.yellow.darker());//Pintamos el contorno de un color diferente
		
		g2.draw(rectangulo);//dibuja un rectángulo vacío
		
		Ellipse2D elipse = new Ellipse2D.Double(100,100,200,200);
		
		g2.setPaint(new Color(0,135,0).brighter().brighter()); //brighter y darker
		//cambian el brillo del color. Se pueden poner muchas veces para hacer los clores más y
		//más claros u oscuros.
		
		g2.fill(elipse);//Dibuja una elipse rellena. 
		

		g2.draw(new Line2D.Double(100,100,300,300));
	 }
 }

 
 
 
 
 
 
 
 
 
 /*
  * MANERA ALTERNATIVA DE DIBUJAR COSAS MUY SIMPLES
  *  class laminaFiguras  extends JPanel{
	 
	 public void paintComponent(Graphics g) {
			
		 super.paintComponent(g);
		 
		 g.drawRect(700/2-300,400/2-150, 600,300);
		 
		 g.drawArc(50, 100, 500, 250, 80 , 50);
		 
	 }


 }

  */
 