
import java.awt.*;
import java.applet.*;
import java.util.*; 

public class Hair{
    boolean male = false;
    boolean hair1 = false;
    public Hair(String type){ 
        if (type.equals("male")){
            male = true;
        }
        if (type.equals("1")){
            hair1 = true;
        }
    }
    public void draw(Graphics g,int x,int y){
        if (hair1 == true){
            g.setColor(Color.darkGray);
            g.fillRect(x+39,y+60,73,75); //back of hair
        }
        if (male == true){
            g.setColor(Color.darkGray);
            g.fillArc(x,y,100,130,0,32); //side part
        }
        else{
            g.setColor(Color.darkGray);
            g.fillArc(x+35,y+40,80,60,315,270); //mom cut
        }
    }
}