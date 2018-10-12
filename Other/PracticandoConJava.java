import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PracticandoConJava extends JFrame{
 public static void main(String[] args) {
  new PracticandoConJava();
  }
 public PracticandoConJava(){
  setTitle("Practicas GRaficas");
  setDefaultCloseOperation(3);
  setBounds(10, 10, MarG1, MarG2);
  setVisible(true);
  
  LaminaNorte lanorte= new LaminaNorte();
  add(lanorte,BorderLayout.NORTH);
  lanorte.add(BotonStop);
  lanorte.add(BotonLimpiar);
  lanorte.add(jbola);
  lanorte.add(jlinea);
  lanorte.add(jtexto);
  BotonStop.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    thread.stop();parar=false;}});
  BotonLimpiar.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    repaint();
   }});
  jlinea.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    bola=false;string=false;
   }});
  jbola.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    bola=true;string=false;
   }});
  jtexto.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
   string=true;bola=true;
  }});
  
  add(new LamainaSur(),BorderLayout.SOUTH);
  add(new RodarEvento(), BorderLayout.CENTER);
  
  }
 class RodarEvento extends JComponent{
  
  public  RodarEvento(){
   
   this.addMouseListener(new MouseAdapter() {
    
    public void mousePressed(MouseEvent e){ //Se ejecuta cuando pulsas el mouse sobre la lamina
     System.out.println("EventoCargado");
     parar=true;
     colores++;
     ancho= e.getX();
     largo=e.getY();
     Runnable arrancar= new eventosHilos(); //Instanciamos nuestra clase para poder ejecutarla varias veces...
     thread = new Thread(arrancar); // Instanciamos la clsase Thread y creamos una variable que alojara un objeto de tipo Runnable     
     thread.start(); // Finalizamos poniendo a nuestra variable thread un metodo de inicio llamado start().
     }});
   this.addMouseMotionListener(new MouseMotionAdapter() {
    public void mouseDragged(MouseEvent e) {  //Se ejecuta cuando arrastras el mouse haciendo un efecto a la linea de pintado
     
     ancho= e.getX();
     largo=e.getY();
     paint(getGraphics());
     }});  }
   public void  paint(Graphics g){
    Graphics2D drawD2 = (Graphics2D)g;
     
     if (colores==1){
      drawD2.setColor(Color.BLUE);
     }if (colores==2){
      drawD2.setColor(Color.RED);
     }if (colores==3){
      drawD2.setColor(Color.ORANGE);
     }if (colores==4){
      drawD2.setColor(Color.BLACK);
     }if (colores==5){
      drawD2.setColor(Color.GREEN);
     }if (colores==6)colores=0;
     drawD2.setStroke(new BasicStroke(5));
     if (string){
      drawD2.drawString("PildorasInformaticas", ancho, largo);
      }else drawD2.drawOval(ancho, largo, 2, 2);         
  }   
   class eventosHilos implements Runnable{

    @Override
    public void run() {
     if (largo>1 || ancho>1){
      while (parar){              
       if (largo==0){ 
        entra1=true;entra3=false;}
       if (ancho==0){
        entra2=true;entra4=false;
       }
       if (largo==MarG2-100){
        entra3=true;entra1=false;
       }
       if (ancho==MarG1-20){
        entra4=true;entra2=false;
       }
       if (entra1){
        largo++;
       }
       if (entra2){
        ancho++;
       }
       if (entra3){
        largo--;
       }
       if (entra4){
        ancho--;
       }
       if (bola){repaint();}
       
       paint(getGraphics());
       try {
        Thread.sleep(velocidad);
       } catch (InterruptedException error) {     
        error.printStackTrace();
       }

       System.out.println(largo+"   "+ ancho);    
       }
      } 
    }    
   } 
 }
  class LamainaSur extends JPanel{
   public LamainaSur(){
    texto1.setForeground(Color.BLUE);
    add(texto1);
    setBackground(Color.ORANGE);   
  }
 }
  class LaminaNorte extends JPanel{
   public LaminaNorte(){
    add(texto);
    setBackground(Color.GREEN);
  } 
 } 
  JButton BotonStop=new JButton("!Parar!");
  JButton BotonLimpiar=new JButton("Limpiar");
  JButton jbola=new JButton("Bola");
  JButton jlinea= new JButton("Linea");
  JButton jtexto=new JButton("Texto");
  Thread thread;
  int velocidad=10;
  int bucle=20000;
  int colores=0;
  int MarG1=521;
  int MarG2=552;
  boolean parar=true;
  boolean entra1=true;
  boolean entra2=true;
  boolean entra3,entra4; 
  boolean bola;
  boolean string=false;
  int ancho=-10;
  int largo=-10;
  JLabel texto= new JLabel("Botones..."); 
  JLabel texto1= new JLabel("Pulsa en la lamina central, cuantas mas veces pulsas mas rapido se mueve");
 }