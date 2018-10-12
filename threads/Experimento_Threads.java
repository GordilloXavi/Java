package threads;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Experimento_Threads extends JFrame implements Runnable{
	
	
	private int num = 0;
	private JPanel panel = new JPanel();
	private JLabel lab = new JLabel("" +num);
	JButton b = new JButton("++");
	
	private Experimento_Threads(){
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		meteChicha(panel);
		
		add(panel);
		setVisible(true);

	}
	
	
	

	public static void main(String[] args) {

		new Experimento_Threads();
		
		
		
	}
	
	private void meteChicha(JPanel p) {
		
		p.add(b);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				num++;
				lab.setText(num + "");
			}
			
		});
		
		p.add(lab);
		
		this.add(p);
		
	}




	@Override
	public void run() {

		
		
	}

}
