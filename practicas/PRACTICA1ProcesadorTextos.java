package practicas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class PRACTICA1ProcesadorTextos {

	public static void main(String[] args) {
		
		//JOptionPane.showMessageDialog( null, "Bienvenido a Xavi, el mejor procesador de texto que existe");

		new MarcoProc();
		
	}

	//importante para entender como hacer que cambia solo el área seleccionada y porqué yo
	//sólo lo he hecho para la negrita y la cursiva (en los jcombobox no se como se hace)
	//https://www.youtube.com/watch?v=EbhWqyIPjzA&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=102#t=18.011598
	
	
}
@SuppressWarnings("serial")
class MarcoProc extends JFrame{
	
	MarcoProc(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screenSize.getWidth();
		int height = (int)screenSize.getHeight();
		setTitle("Editor de textos Xavi");
		
		setBounds(width/2- 400, height/2-250, 800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setAlwaysOnTop(true);
		
		add(new LaminaComponents());
		
		
		setVisible(true);
	}
}
@SuppressWarnings("serial")
class LaminaComponents extends JPanel{
	
	private JTextPane escribir;
	
	private JComboBox<String> fuentes;
	
	private JComboBox<Integer> tamanoLetra;
	
	private JCheckBox negrita;
	
	private JCheckBox cursiva;
	
	private JScrollPane laminaTexto;
	
	private JPanel laminaNorte;
	
	LaminaComponents(){
		
		setLayout(new BorderLayout());//LAMINA DE TEXTO
		
		escribir = new JTextPane();
	
		
		escribir.setFont(new Font("Arial", Font.PLAIN, 12));
		
		laminaTexto = new JScrollPane(escribir);

		add(laminaTexto, BorderLayout.CENTER);
		
		//*********************************************************//
		
		laminaNorte = new JPanel();
		
		add(laminaNorte, BorderLayout.SOUTH);
		
		//*********************************************************//
		
		
		
		fuentes = new JComboBox<String>();
				
		String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for (int i = 0; i< fonts.length; i++) {
			
			fuentes.addItem(fonts[i]);
			
		}
		
		fuentes.setEditable(true);
		
		fuentes.addActionListener(new AccionFuente());
		
		laminaNorte.add(fuentes);
		
		fuentes.setSelectedIndex(1);
		
		//****************************************************//
		
		tamanoLetra = new JComboBox<Integer>();
		
		
		for (int i = 8; i <= 72; i+= 2) {
			
			tamanoLetra.addItem(i);
			
			if (i == 28) {
				i += 6;
			}else if (i == 36) {
				i+=10;
			}else if (i == 48) {
				i+= 22;
			}
	
		}
		
		tamanoLetra.setEditable(true);
		
		tamanoLetra.setSelectedItem(12);
		
		tamanoLetra.addActionListener(new AccionTamano());
		
		laminaNorte.add(tamanoLetra);

		//****************************************************//
		
		
		negrita = new JCheckBox("Negrita");//Poener icono de una N seria fino
		
		cursiva = new JCheckBox("Cursiva");
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());//IMPORTANTISIMO!!!!
		
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		//SOLO PONGO LAS JCHECKBOX PARA QUE CAMBIEN EL TEXTO SELECCIONADO PORQUE CON LAS JCOBOBOX NO SÉ COMO
		//HACERLO. VER VÍDEO!
		//https://www.youtube.com/watch?v=EbhWqyIPjzA&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=102#t=18.011598
		
		
		laminaNorte.add(negrita);
		
		laminaNorte.add(cursiva);


		
	}
	
	
	
	class AccionFuente implements ActionListener{
		
		Font currentFont;

		@Override
		public void actionPerformed(ActionEvent e) {

			currentFont = escribir.getFont();
			
			escribir.setFont(new Font((String)fuentes.getSelectedItem(), currentFont.getStyle(), currentFont.getSize()));
			
		}
		
	}
	
	class AccionTamano implements ActionListener{

		Font currentFont;
		
		@Override
		public void actionPerformed(ActionEvent e) {

			currentFont = escribir.getFont();
			
			escribir.setFont(new Font(currentFont.getFontName(), currentFont.getStyle(), (int) tamanoLetra.getSelectedItem()));
			
		}
		
	}
	
	
	
	class AccionEstilo implements ActionListener{
	
		Font fuenT;
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			fuenT = escribir.getFont();
			
			
			escribir.setFont(fuenT);
			
				
			

		if (negrita.isSelected() && cursiva.isSelected()) {
			escribir.setFont(new Font(fuenT.getFontName(), Font.BOLD + Font.ITALIC, fuenT.getSize()));
			//System.out.println("both");
		}else if(negrita.isSelected()) {
			escribir.setFont(new Font(fuenT.getFontName(), Font.BOLD, fuenT.getSize()));
			//System.out.println("bold");
		}else if (cursiva.isSelected()) {
			escribir.setFont(new Font(fuenT.getFontName(), Font.ITALIC, fuenT.getSize()));
			//System.out.println("italic");
		}else {
			escribir.setFont(new Font(fuenT.getFontName(), Font.PLAIN, fuenT.getSize()));
			//System.out.println("plain");
		}
			
			
			
			
		}

	}
}








/*

class AccionEstilo implements ActionListener{



@Override
public void actionPerformed(ActionEvent e) {

	
	Font currentFont = escribir.getFont();
	
	Font normal =  new Font(currentFont.getFontName(), Font.PLAIN, currentFont.getSize());

	Font both = new Font(currentFont.getFontName(), Font.BOLD + Font.ITALIC, currentFont.getSize());
	
	Font italic = new Font(currentFont.getFontName(),Font.ITALIC, currentFont.getSize());;
	
	Font bold = new Font(currentFont.getFontName(), Font.BOLD, currentFont.getSize());;
	/*
	int tipo = 0;
	
	if (negrita.isSelected()) {
		tipo+= Font.BOLD;
	}else if (cursiva.isSelected()) {
		tipo+= Font.ITALIC;
	}
	
	escribir.setFont(new Font(currentFont.getFontName(), tipo, currentFont.getSize()));


	if(cursiva.isSelected() && negrita.isSelected()) {
		 
		escribir.setFont(both);
		
	}else if (cursiva.isSelected()  && negrita.isSelected() == false){
		
		escribir.setFont(italic);
	}else if(negrita.isSelected()  && cursiva.isSelected() == false) {
		escribir.setFont(bold);
	}else {
		escribir.setFont(normal);

	}
}

}
*/