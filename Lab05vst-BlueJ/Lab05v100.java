// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.

import java.awt.*;
import java.applet.*;

public class Lab05v100 extends Applet
{ public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int y = 10;
        int x = 20;
        int xFactor = width / height;
        g.drawRect(10,10,width,height);
        while(y!=640){
            g.drawLine(10,y,x,640); //bottom left slope
            g.drawLine(990,y,990-x,640); //bottom right slope
            g.drawLine(10,640-y,x,10); //top left
            g.drawLine(990,640-y,990-x,10); //top right
            y=y+10;
            x=x+14;
}
}
}

