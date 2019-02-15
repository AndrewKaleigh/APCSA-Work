import java.awt.*;
import java.applet.*;
import java.util.*; 

public class Female extends Robloxian
{
    private int x = 150;
    private int y = 150;
    public void paint(Graphics g){
        Robloxian robloxian = new Robloxian();
        Hair hair1 = new Hair("1");
        Hair hair = new Hair("Female");
        
        hair1.draw(g,x,y);
        robloxian.basicRobloxian(g);
        hair.draw(g,x,y);
    }
}
