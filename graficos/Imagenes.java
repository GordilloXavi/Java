package graficos;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;


import javax.swing.*;
import javax.imageio.*;

public class Imagenes extends x{

	public static void main(String[] args) {
		
		x lamina = new x();
						
		MImage marco = new MImage(900,900);
		
		marco.add(lamina);

	}

	
}
class MImage extends JFrame{
	public MImage(int a, int b) {
	
		setBounds(1920/2-a/2,1080/2-b/2, a,b);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Gatitoo");
	}
	
}

class x extends JPanel{

	
	public x() {
		
		RatonEvento raton = new RatonEvento();
		
		addMouseListener(raton);
		
		try {
			pic = ImageIO.read(new File("src/graficos/cat.gif"));
			}
			catch(IOException e){
				System.out.println("La imagen no se ha podido encontrar.");
			}
	}
	
	
	public void paintComponent(Graphics g) {

			
			
		
		super.paintComponent(g);
			
				
		
		int alturaImg = pic.getHeight(this);
		int anchuraImg = pic.getWidth(this);
		
		g.drawImage(pic, 0, 0, null);//0,0 es la ubicacion.
	
		for(int i = 0; i<20*anchuraImg; i+=anchuraImg) {//Las fotos son 20*20.
			
			for(int j = 0;j<20*alturaImg; j+=alturaImg) {
				
		g.copyArea(0,0 ,200 ,200 ,i ,j );//Sirve para copiar una imagen o lo que sea
		//y la pega en las coordenadas especificadas
		//Los bucles for incrementan la i y la j para poner la imagen
		//en una especie de mosaico
		
		
		
		}
		}
		

	}
	private Image pic;
	
	

	
	

}


