// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape
{
   public void drawShape(Graphics g)
   {
       g.fillOval(560,400,100,100);
       g.drawString("Triangle", 420, 340);
       g. drawString("A square has 4 sides", 550,525);
   }   
}
