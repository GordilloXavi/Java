package threads;
import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Threads1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame marco=new MarcoRebote();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}

class PelotaHilos implements Runnable{
	
	private Pelota pelota;
	
	private Component componente;

	public PelotaHilos(Pelota p, Component c) {
		
		pelota = p;
		
		componente = c;
		
			
		
	}
	
	
	public void run() {
		
		System.out.println("Estado del hilo al comenzar: "+ Thread.currentThread().isInterrupted());
		
		while(!Thread.interrupted()){
			
			pelota.mueve_pelota(componente.getBounds());
			
			componente.paint(componente.getGraphics());
			
			try {
			
			Thread.sleep(4);
			
			}catch(Exception e) {
				e.printStackTrace();
				System.err.println("tira excepción porque no se puede usar interrupt() mientras el thread está en sleep();");
				
				Thread.currentThread().interrupt();
			}
		
		}
		
		System.out.println("Estado del hilo al terminar: "+ Thread.currentThread().isInterrupted());
		
	}




}




//Movimiento de la pelota-----------------------------------------------------------------------------------------

class Pelota{
	
	// Mueve la pelota invirtiendo posición si choca con límites
	
	public void mueve_pelota(Rectangle2D limites){
		
		x+=dx;
		
		y+=dy;
		
		if(x<limites.getMinX()){
			
			x=limites.getMinX();
			
			dx=-dx;
		}
		
		if(x + TAMX>=limites.getMaxX()){
			
			x=limites.getMaxX() - TAMX;
			
			dx=-dx;
		}
		
		if(y<limites.getMinY()){
			
			y=limites.getMinY();
			
			dy=-dy;
		}
		
		if(y + TAMY>=limites.getMaxY()){
			
			y=limites.getMaxY()-TAMY;
			
			dy=-dy;
			
		}
		
	}
	
	//Forma de la pelota en su posición inicial
	
	public Ellipse2D getShape(){
		
		return new Ellipse2D.Double(x,y,TAMX,TAMY);
		
	}	
	
	private static final int TAMX=15;
	
	private static final int TAMY=15;
	
	private double x=0;
	
	private double y=0;
	
	private double dx=(int)(Math.random()*4+1);
	
	private double dy=(int)(Math.random()*4+1);
	
	
}

// Lámina que dibuja las pelotas----------------------------------------------------------------------


class LaminaPelota extends JPanel{
	
	//Añadimos pelota a la lámina
	
	public void add(Pelota b){
		
		pelotas.add(b);
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		for(Pelota b: pelotas){
			
			g2.fill(b.getShape());
		}
		
	}
	
	private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
}


//Marco con lámina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame{
	
	public MarcoRebote(){
		
		setBounds(600,300,700,350);
		
		setTitle ("Rebotes");
		
		lamina=new LaminaPelota();
		
		add(lamina, BorderLayout.CENTER);
		
		JPanel laminaBotones=new JPanel();
		
		arranca1 = new JButton("Thread 1");
		
		arranca1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {//15:00
				
				

				comienza_el_juego(e.getSource());
				
			}
			
			
			
		});
		
		laminaBotones.add(arranca1);
		
arranca2 = new JButton("Thread 2");
		
		arranca2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				

				comienza_el_juego(e.getSource());
				
			}
			
			
			
		});
		
		laminaBotones.add(arranca2);
		
arranca3 = new JButton("Thread 3");
		
		arranca3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				

				comienza_el_juego(e.getSource());
				
			}
			
			
			
		});
		
		laminaBotones.add(arranca3);
		
detener1 = new JButton("Detener 1");
		
		detener1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				

				detener(e.getSource());
				
			}
			
			
			
		});
		
		laminaBotones.add(detener1);
		
detener2 = new JButton("Detener 2");
		
		detener2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				

				detener(e.getSource());
				
			}
			
			
			
		});
		
		laminaBotones.add(detener2);
		
detener3 = new JButton("Detener 3");
		
		detener3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				

				detener(e.getSource());
				
			}
			
			
			
		});
		
		laminaBotones.add(detener3);
		
	
		
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	
	//Ponemos botones
	

	
	//Añade pelota y la bota 1000 veces
	
	Thread t1, t2, t3;
	
	JButton arranca1, arranca2, arranca3, detener1, detener2, detener3;
	
	//Thread t;
	
	public void comienza_el_juego (Object b){
			
			Pelota pelota=new Pelota();
			
			lamina.add(pelota);
			
		
			
			Runnable r = new PelotaHilos( pelota, lamina);
			
			if(b.equals(arranca1)) {
			
			t1 = new Thread(r);
			
			t1.start();
			
			}else if(b.equals(arranca2)) {
				
				t2 = new Thread(r);
				
				t2.start();
				
			}else if (b.equals(arranca3)) {
				t3 = new Thread(r);
				
				t3.start();
			}
		
	}
	
	public void detener(Object b) {
		
		//t.stop();
		
		if(b.equals(detener1)) {
			t1.interrupt();
		}else if(b.equals(detener2)) {
			t2.interrupt();			
		}else if(b.equals(detener3)){
			t3.interrupt();
		}
		
		//t.interrupt(); //tira excepción porque no se puede usar interrupt() mientras el thread está en sleep();
		
	}
	
	private LaminaPelota lamina;
	
	
}
