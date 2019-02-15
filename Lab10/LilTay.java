import java.awt.*;
import java.applet.*;
import java.util.*; 

public class LilTay extends Female
{
    private int x = 205;
    private int y = 245;
    public void paint(Graphics g){
      Female female = new Female();
      Face face = new Face("lilTay"); 
      
      female.paint(g);
      face.draw(g,x,y);
    }
}