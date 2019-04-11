// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape
{
   public void drawShape(Graphics g)
   {
       int xpoints[] = {575, 625, 675};
       int ypoints[] = {200, 125, 200};
       int npoints = 3;

       g.fillPolygon(xpoints, ypoints, npoints);
       g.drawString("Triangle", 420, 40);
       g. drawString("A square has 4 sides", 550,225);
   }
}

