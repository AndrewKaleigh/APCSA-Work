import java.awt.*;
import java.applet.*;
import java.util.*; 

public class Male extends Robloxian
{
    private int x = 150;
    private int y = 150;
    public void paint(Graphics g){
        Robloxian robloxian = new Robloxian();
        Hair hair = new Hair("male");
        robloxian.basicRobloxian(g);
        hair.draw(g,x,y);
    }
}
