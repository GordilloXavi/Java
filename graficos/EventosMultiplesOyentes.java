package graficos;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class EventosMultiplesOyentes {

	public static void main(String[] args) {

		Markinos marco = new Markinos(1500,700);
		marco.setVisible(true);
		
		

	}

}
class Markinos extends JFrame{
	static int cx;
	static int cy;
	Markinos(int x, int y){
		
		cx = x;
		cy = y;
		
		setBounds(x,y,200,110);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new lamina7());
		
	}
	

	
}
class lamina7 extends JPanel{
	
	JButton abrir = new JButton("Abrir ventana");
	JButton cerrar = new JButton("Cerrar ventanas");
	
	lamina7(){
		
		OyenteNuevo mioyente = new OyenteNuevo();
	
		add(abrir);
		add(cerrar);
		
		abrir.addActionListener(mioyente);

	}
	
	private class OyenteNuevo implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			MarcoEmergente marco = new MarcoEmergente(cerrar);
			
		}
		
		
	}
	
	
	}
	
class MarcoEmergente extends JFrame{
	
	private static int win =0;
	
	int posy = 30;
	
	int posx = 210*win;
	
	private static int count = 0;
	
	public MarcoEmergente(JButton boton_principal) {
		
		Cerrar oyenteCerrar = new Cerrar();
		
		count++;
		
		win++;

		setTitle("Ventana" + count);

//Hay que acabar de pulir esto para que las ventanas nuevas se vayan ordenando en filas a medida
		//que llegan al límite de la ventana.
		
		if((posx) <= 1720 ) {
		
		setBounds(posx, posy,300,150);
		
		}else {
			posy+=150;
			win = 0; 
		
			//setBounds(posx, posy,300,150);
		
		}
		
		setVisible(true);
		
		boton_principal.addActionListener(oyenteCerrar);
		
	}
	
	private class Cerrar implements ActionListener{
	

	public void actionPerformed(ActionEvent e) {
		
		dispose();//Método de Frame que cierra la ventana.
		
		count = 0;
		}
	
	
	}

	
}


























/*
class lamina7 extends JPanel{
	
	JButton abrir = new JButton("Abrir ventana");
	JButton cerrar = new JButton("Cerrar ventana");
	
	lamina7(){
		
		
		add(abrir);
		add(cerrar);
		
		Accion accion1 = new Accion();
		
		abrir.addActionListener(accion1);
	}
	
	class Accion implements ActionListener{

		
			
		public void actionPerformed(ActionEvent e) {
			
			Markinos.cx += 50;
			Markinos.cy+=70;
			
			Markinos marcon = new Markinos(Markinos.cx,Markinos.cy);
		
			if (e.getSource() == abrir) {
				
				marcon.setVisible(true);
			}else if (e.getSource() == cerrar) {
		
			}
		}
		
		
	}
	
}*/

