import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Robloxian extends Applet
{
    
    private int x = 200;
    private int y = 200;
    
    public void basicRobloxian(Graphics g)
    {
        Torso torso = new Torso();
        Arm rightArm = new Arm("right");
        Arm leftArm = new Arm("left");
        Leg rightLeg = new Leg("right");
        Leg leftLeg = new Leg("left");
        Head head = new Head();
        Hair hair = new Hair("male");
        
        torso.draw(g,x,y);
        rightArm.draw(g,x,y);
        leftArm.draw(g,x,y);
        rightLeg.draw(g,x,y);
        leftLeg.draw(g,x,y);
        head.draw(g,x,y);
        
    } 
}
