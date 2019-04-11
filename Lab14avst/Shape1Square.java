// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape
{
   public void drawShape(Graphics g)
   {
       g.fillRect(150,100,100,100);
       g.drawString("Square", 20, 40);
       g. drawString("A square has 4 sides", 150,225);
   }
}

