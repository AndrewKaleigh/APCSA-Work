// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape
{
   public void drawShape(Graphics g)
   {
       int x = 140;
       int y = 380;
       int xpoints[] = {50+x, 100+x, 150+x, 150+x, 100+x, 50+x, 0+x, 0+x};
       int ypoints[] = {0+y, 0+y, 50+y, 100+y, 150+y, 150+y, 100+y, 50+y};
       int npoints = 8;

       g.fillPolygon(xpoints, ypoints, npoints);
       g.drawString("Square", 20, 340);
       g. drawString("A square has 4 sides", 150,560);
   }
}

