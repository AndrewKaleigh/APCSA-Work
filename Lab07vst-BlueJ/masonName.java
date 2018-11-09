import java.awt.*;
import java.applet.*;

//Andrew

public class masonName extends Applet{
    public static void nameInBox (Graphics g){
     m(g);
     a(g);
     s(g);
     o(g);
     n(g);
     box(g);
    }
    public static void m(Graphics g){
        g.fillRect(210,110,5,30);  //M left
        g.fillRect(220,110,5,30);  //M mid
        g.fillRect(230,110,5,30);  //M right
        g.fillRect(210,110,20,5);  //M top
    }
    
    public static void a(Graphics g){
        g.fillRect(240,110,5,30);  //A left
        g.fillRect(250,110,5,30);  //A right
        g.fillRect(240,110,15,5);  //A top
        g.fillRect(240,120,15,5);  //A bottom
    }
    
    public static void s(Graphics g){
        g.fillRect(260,110,15,5);  //S top
        g.fillRect(260,120,15,5);  //S mid
        g.fillRect(260,135,15,5);  //S bottom
        g.fillRect(260,110,5,15);  //S left
        g.fillRect(270,120,5,20);  //S right
        
    }  
    
    public static void o(Graphics g){
        g.fillRect(285,110,5,30);  //O ; left
        g.fillRect(295,110,5,30);  //O right
        g.fillRect(285,110,15,5);  //O top 
        g.fillRect(285,135,15,5);  //O bottom
    }
    
    public static void n(Graphics g){
        g.fillRect(305,110,5,30);  //N right
        g.fillRect(315,110,5,30);  //N left
        g.fillRect(305,110,15,5);  //N top 
    } 
    public static void box(Graphics g){
     g.fillRect(200,100,130,5); //top bar
     g.fillRect(200,150,130,5); //bottom bar
     g.fillRect(200,100,5,50); //left bar
     g.fillRect(330,100,5,55); //right bar
     
    }
}
