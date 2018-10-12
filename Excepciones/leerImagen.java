package excepciones_I;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class leerImagen {

	public static void main(String[] args) {
			
		new marco_();
		
		System.out.println("RECOMENDABLE REPASAR EL VÍDEO DE EXCEPCIONES, SE ENTIENDE MUY CLARO TODO SI NO ME ACUERDO DE LO QUE OCURRE AQUÍ: \n https://www.youtube.com/watch?v=dD-ntlW5Tlc&index=142&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk#t=1.986157");
	}

}
class marco_ extends JFrame{
	
	marco_(){
	setBounds(1000,400,500,300);	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	add(new lamina_());
	setVisible(true);
	}
	
	
}
class lamina_ extends JPanel{
	
	Image imagen;
	
	lamina_(){
		try {
			imagen = ImageIO.read(new File("src/Excepciones/excepciones_I/fotocode.png"));
			//el programa no va a encontrar la imagen y va a lanzar una excepción.
		} catch (IOException e) {
			
			System.out.println("La imagen no se ha podido encontrar");
			
		}//EXCEPCIÓN COMBROBADA
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		if(imagen == null) {//con esto cubrimos la posiblilidad de que no encuentre la imagen y, por lo tanto, la variable imagen no se inicialize.
			//si esto ocurre, lo solventamos con un if y un else, ya que esto es una excepción que se puede evitar haciendo un buen
			//programa y que no se puede corregir con un try/catch
			g.drawString("No podemos encontrar la imagen", 10, 10);
		}else {//EXCEPCIÓN NO COMPROBADA
		
		int anchuraImg = imagen.getWidth(this);
		
		int alturaImg = imagen.getHeight(this);
		
		for(int i = 0; i<300; i++) {
			for(int j = 0; j<200; j++) {
				
			}
			
		}
			
		}
	}
}