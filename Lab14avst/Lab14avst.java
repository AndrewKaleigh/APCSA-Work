// Lab14avst.java
// Lab14a
// Student starting version


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Lab14avst extends Applet
{
    public void paint(Graphics g)
    {
        Shape1Square g1 = new Shape1Square();
        Shape2Triangle g2 = new Shape2Triangle();
        Shape3Octagon g3 = new Shape3Octagon();
        Shape4Circle g4 = new Shape4Circle();
        drawGrid(g);
        g1.drawShape(g);
        g2.drawShape(g);
        g3.drawShape(g);
        g4.drawShape(g); 
   }

   public void drawGrid(Graphics g)
    {
        g.drawRect(10,10,800,600);
        g.drawLine(10,300,810,300);
        g.drawLine(410,10,410,610);
    }
}

