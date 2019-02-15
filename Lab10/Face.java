import java.awt.*;
import java.applet.*;
import java.util.*; 

public class Face{
    boolean lilTayFace = false;
    public Face(String type){ 
        if (type.equals("lilTay")){
            lilTayFace = true;
        }
    }
    public void draw(Graphics g,int x,int y){
        g.setColor(Color.black);
        if(lilTayFace){
          g.drawArc(x,y,40,20,180,180);  //mouth
          g.fillArc(x+2,y-6,7,7,0,180); //left eye
          g.fillArc(x+30,y-6,7,7,0,180); //right eye
        } else{
          g.fillArc(x,y,40,20,180,180);  //mouth
          g.fillOval(x+2,y-6,7,7); //left eye
          g.fillOval(x+30,y-6,7,7); //right eye
        }
    }
}
