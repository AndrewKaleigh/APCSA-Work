import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Tran extends Male
{
   private int x = 205;
    private int y = 245;
    public void paint(Graphics g){
      Male male = new Male();
      Face face = new Face("Tran"); 
      
      male.paint(g);
      face.draw(g,x,y);
    }
}