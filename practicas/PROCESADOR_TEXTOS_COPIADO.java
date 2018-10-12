package practicas;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
public class PROCESADOR_TEXTOS_COPIADO {



 public static void main(String[] args) {
  // TODO Auto-generated method stub
  MarcoProcesador2 mimarco=new MarcoProcesador2();
  mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}

class MarcoProcesador2 extends JFrame{
 
 public MarcoProcesador2(){
	 
	 System.out.println("Hay un problema con los checkbox de negrita y cursiva y "
	 		+ "el click de botón derecho. \nÉsto se puede arreglar con bastante código o simplemente eliminar los checkboxes");
	 
	 
  setBounds(350,200,600,450);
  LaminaProcesador2 milamina=new LaminaProcesador2();
  add(milamina);
  setVisible(true); 
 }
}

class LaminaProcesador2 extends JPanel{
	ButtonGroup grupo;
 public LaminaProcesador2(){
  setLayout(new BorderLayout());
  mibarra=new JMenuBar();
  
  creaLienzo();
  
  String[] itemsFuentes={"Arial","Verdana","Courier"};
  creaMenu("Fuentes",itemsFuentes);
  
  String[] itemsEstilo={"Negrita", "Cursiva"};
  creaMenu("Estilo",itemsEstilo);
  
  String[] itemsTamanos={"12","16","20","24"};
  
  creaMenu("Tamaños", itemsTamanos);

  //***
	JPopupMenu menu1 = new JPopupMenu();
	
	JMenuItem opcion1 = new JMenuItem("Negrita");
	
	JMenuItem opcion2 = new JMenuItem("Cursiva");
	
	
	//opcion2.setAccelerator(KeyStroke.getKeyStroke());

	
	


	menu1.add(opcion1);
	
	menu1.add(opcion2);
	
	opcion1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));

	opcion2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));

	opcion1.addActionListener(new StyledEditorKit.BoldAction());
	
	opcion2.addActionListener(new StyledEditorKit.ItalicAction());


	lienzo.setComponentPopupMenu(menu1);
  //**********************+*
	
	JToolBar barra = new JToolBar();
	
	JButton botonN = new JButton(new ImageIcon("src/graficos/negrita.gif"));
	
	JButton botonC = new JButton(new ImageIcon("src/graficos/cursiva.gif"));
	
	JButton botonS = new JButton(new ImageIcon("src/graficos/subrallado.gif"));

	JButton botonAzul = new JButton(new ImageIcon("src/graficos/bola_azul.gif"));
	
	JButton botonAmarillo = new JButton(new ImageIcon("src/graficos/bola_amarilla.gif"));

	JButton botonRojo = new JButton(new ImageIcon("src/graficos/bola_roja.gif"));
	
	JButton botonNegro = new JButton("Negro");
	
	JButton botonCentrado = new JButton(new ImageIcon("src/graficos/centro.gif"));

	JButton botonJustificado = new JButton(new ImageIcon("src/graficos/justificado.gif"));
	
	JButton botonIzquierda = new JButton(new ImageIcon("src/graficos/izquierda.gif"));

	JButton botonDerecha = new JButton(new ImageIcon("src/graficos/derecha.gif"));



	
	barra.setOrientation(JToolBar.VERTICAL);
	
	botonN.addActionListener(new StyledEditorKit.BoldAction());
	
	botonC.addActionListener(new StyledEditorKit.ItalicAction());
	
	botonS.addActionListener(new StyledEditorKit.UnderlineAction());
	
	botonAzul.addActionListener(new StyledEditorKit.ForegroundAction("Azul", Color.BLUE));

	botonAmarillo.addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.YELLOW));

	botonRojo.addActionListener(new StyledEditorKit.ForegroundAction("Rojo", Color.RED));

	botonNegro.addActionListener(new StyledEditorKit.ForegroundAction("", Color.BLACK));
	
	
	botonCentrado.addActionListener(new StyledEditorKit.AlignmentAction("", 1));

	botonJustificado.addActionListener(new StyledEditorKit.AlignmentAction("", 0));

	botonIzquierda.addActionListener(new StyledEditorKit.AlignmentAction("",2));

	botonDerecha.addActionListener(new StyledEditorKit.AlignmentAction("",3 ));


	
	add(barra, BorderLayout.WEST);
	
	barra.add(botonN);
	
	barra.add(botonC);
	
	barra.add(botonS);
	
	barra.addSeparator();
	
	barra.add(botonAzul);
	
	barra.add(botonAmarillo);
	
	barra.add(botonRojo);
	
	barra.add(botonNegro);
	
	barra.addSeparator();

	
	barra.add(botonCentrado);
	
	barra.add(botonJustificado);

	barra.add(botonIzquierda);

	barra.add(botonDerecha);

	


	
	//barra.add();
	
	
	
	
	
	
	
	
	
	
	
	
	
	

 }
 
 public void creaMenu(String pestaña, String[] misitems){
    JMenu mimenu=new JMenu(pestaña);
     for(String item: misitems){
      JMenuItem mimenuitem=new JMenuItem(item);
      if(mibarra.getMenuCount()==0){       
       mimenu.add(item).addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra",item)); 
      }else if(mibarra.getMenuCount()==1){
       if(item=="Negrita"){
    	   
    	   JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/graficos/negrita.gif"));
    	   

        mimenu.add(negrita).addActionListener(new StyledEditorKit.BoldAction());
       }else{
    	   JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/graficos/cursiva.gif"));

        mimenu.add(cursiva).addActionListener(new StyledEditorKit.ItalicAction());
       }
      }else{
    	
       mimenu.add(item).addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",Integer.parseInt(item))); 
      }
     }
    mibarra.add(mimenu);
  add(mibarra, BorderLayout.NORTH);
 }
 
 public void creaLienzo(){
	 
	  lienzo=new JTextPane();
	 
	 JScrollPane laminalienzo=new JScrollPane(lienzo);  
	 
 
  add(laminalienzo, BorderLayout.CENTER);
 }
 
 private JMenuBar mibarra;
 private JTextPane lienzo;
}
