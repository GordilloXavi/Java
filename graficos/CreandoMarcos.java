package graficos;
import java.awt.*;
import javax.swing.*;//imprescindible importar javax.swing para hacer aplicaciones con ventanas.
public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco ventana = new miMarco();
		
		Dimension resolucion = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)resolucion.getWidth();
		int height = (int)resolucion.getHeight();
		//Para obtener la resolución del monitor.
		
		int sizex = width/2;
		int sizey = height/2;
		
		
		ventana.setResizable(false);/*Si lo ponemos en true,
		entonces podremos cambiar el tamaño de la ventana con el ratón manualmente y podremos
		maximizar la ventana.*/
		
		ventana.setLocation(width/2- sizex/2, height/2- sizey/2);//establecemos donde 
		//aparece la ventana
		
		ventana.setSize(sizex, sizey);//en píxeles
		
		ventana.setVisible(true);//Con éste método hacemos que la ventana aparezca.
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ésto se usa para definir qué
		//hará el programa cuando se cierre la ventana.En este caso el programa finalizará.
	
		ventana.setTitle("Mi ventanita <3");
		
		Toolkit imagen = Toolkit.getDefaultToolkit();
		
		Image Icono = imagen.getImage("src/graficos/icono.gif");

		ventana.setIconImage(Icono);
	}
}




