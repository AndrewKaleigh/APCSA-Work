import java.awt.*;
import java.applet.*;

//Andrew

public class arrow extends Applet
{
    public static void arrow(Graphics g){
        arrowHead(g);
        arrowBase(g);
    }
    public static void arrowHead(Graphics g){
    int ypoints[] = {225,275,250};
    int xpoints[] = {200,200,225};
    int npoints = 3;
    
    g.fillPolygon(xpoints, ypoints, 3);
    }
    
    public static void arrowBase(Graphics g){
        g.fillRect(150,150,50,5); //top bar
        g.fillRect(150,150,5,100); //down bar
        g.fillRect(150,250,50,5); //bottom bar
    }

}


