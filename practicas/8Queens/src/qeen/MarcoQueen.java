package qeen;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;


public class MarcoQueen extends JFrame {

	public MarcoQueen() {
		

		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("n Queens, creat per Xavi Gordillo");
		setLocationRelativeTo(null);
		setResizable(true);
		add(new LaminaQueens());
		
		setVisible(true);
	}
	
}

class LaminaQueens extends JPanel {
	
	private JButton botonReset = new JButton("Dibuixa el tauler");
	
	private JSpinner spin;
	
	private JLabel lab = new JLabel("Quantes reines vol avui?");
	
	private JPanel panelBotones;
	
	private JPanel panelTablero;
	
	private Font fuen = new Font("Impact", Font.BOLD, 35);
	
	private GridLayout TableroLayout;
	
	public LaminaQueens() {
		
		
		
		panelBotones = new JPanel();
		
		panelTablero = new JPanel();
		
		panelTablero.setBackground(Color.BLACK);
		
		panelBotones.setBackground(Color.BLACK);
		

		panelBotones.add(botonReset);
		
		spin = new JSpinner(new SpinnerNumberModel(4,4 ,20,1));
		
		lab.setForeground(Color.WHITE);
		
		panelBotones.add(lab);

		
		panelBotones.add(spin);
		
		botonReset.addActionListener(new AccionReset());

		
		
		setLayout(new BorderLayout());
		
		//ponerCasillas(EightQueens.display(EightQueens.solveQueens(tamano)), tamano);

		
		add(panelTablero, BorderLayout.CENTER);
		
		add(panelBotones, BorderLayout.SOUTH);


		
		
	}
	public void ponerCasillas(char[] e, int t) {
		
		quitarTablero();
		
		
		panelTablero.setBackground(Color.BLACK);

		
		panelTablero.setLayout(new GridLayout(t,t));
		
		for(int i = 0; i< e.length; i++) {
			
			JLabel l = new JLabel("    "+e[i]);
			
			l.setForeground(Color.WHITE);
			
			
			if(e[i] == 'Q')l.setForeground(Color.RED);//PONER LAS Q EN ROJO
			
			l.setFont(fuen);
			
			l.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			
			panelTablero.add(l);
			
			
		}
		
	}
	
	public void quitarTablero() {
		
		
		panelTablero.removeAll();
		
		
		revalidate();
		
		repaint();
		
		
	}
	
class AccionReset implements ActionListener{

	public void actionPerformed(ActionEvent arg0) {
		
		quitarTablero();
		
		int df = (int)spin.getValue();

		//System.out.println(df);
		//System.out.println("casillas = "+EightQueens.solveQueens(df).length + "x" + EightQueens.solveQueens(df).length);
		

		ponerCasillas(EightQueens.display(EightQueens.solveQueens(df)), df);
	}
	
}


	
	
}