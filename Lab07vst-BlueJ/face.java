// Student Version
//Joe

import java.awt.*;
import java.applet.*;
import java.util.*; 
                                                                

public class face extends Applet
{  
    public static void Eyes(Graphics g, int x1, int y1, int x2, int y2)   
    {   
        g.drawOval(x1, y1, 10, 10);
        g.drawOval(x2, y2, 10, 10);
    }
    
    public static void Mouth(Graphics g, int x, int y, int height, int width, int startAngle, int endAngle)
    {
        g.fillArc(x, y, width, height, startAngle, endAngle);
    }
    
    public static void Face(Graphics g, int x, int y, int height, int width)
    {
        g.drawOval(x, y, width, height);
    }
    
    public static void Bowl(Graphics g, int x, int y, int height, int width, int startAngle, int endAngle)
    {
        g.fillArc(x, y, width, height, startAngle, endAngle);
    }
}