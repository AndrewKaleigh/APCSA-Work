// Lab06v90.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
                                                                

public class Lab06v90 extends Applet
{
    
    public void paint(Graphics g)   
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);

        // Draw Random Lines
        for(int i=0;i<100;i++){
            
            int lx1= (int) (Math.random()*390+10);
            int lx2= (int) (Math.random()*390+10);
            int ly1= (int) (Math.random()*290+10);
            int ly2= (int) (Math.random()*290+10);
            int re=  (int) (Math.random()*255);
            int bl=  (int) (Math.random()*255);
            int gr=  (int) (Math.random()*255);
            Color randColor = new Color(re,bl,gr);
            g.setColor(randColor);
            g.drawLine(lx1,ly1,lx2,ly2);
        }
        // Draw Random Squares
       for(int i=0;i<100;i++){
            
            int sx1= (int) (Math.random()*330+410);
            int sx2= 50;
            int sy1= (int)(Math.random()*240+10);
            int sy2= 50;
            int re=  (int) (Math.random()*255);
            int bl=  (int) (Math.random()*255);
            int gr=  (int) (Math.random()*255);
            Color randColor = new Color(re,bl,gr);
            g.setColor(randColor);
            g.fillRect(sx1,sy1,sx2,sy2);
        }
        // Draw Random Circles
        for(int i=0;i<100;i++){
            
            int d = (int) (Math.random()*200);
            int cx1= (int) (Math.random()*190+10);
            int cy1= (int) (Math.random()*90+310);
            int re= (int) (Math.random()*255);
            int bl= (int) (Math.random()*255);
            int gr= (int) (Math.random()*255);
            Color randColor = new Color(re,bl,gr);
            g.setColor(randColor);
            g.drawOval(cx1,cy1,d,d);
        }

        
        // Draw 3-D Box
       int re= (int) (Math.random()*255);  //right side
       int bl= (int) (Math.random()*255);
       int gr= (int) (Math.random()*255);
       Color randColor = new Color(re,bl,gr);
       g.setColor(randColor);
        Polygon right = new Polygon();
        right.addPoint(650,400);
        right.addPoint(650,475);
        right.addPoint(675,500);
        right.addPoint(675,425);
        g.fillPolygon(right);
        
       re= (int) (Math.random()*255);  //back side
       bl= (int) (Math.random()*255);
       gr= (int) (Math.random()*255);
       Color randColor2 = new Color(re,bl,gr);
       g.setColor(randColor2);
       g.fillRect(575,400,75,75);
       
       re= (int) (Math.random()*255);  //front side
       bl= (int) (Math.random()*255);
       gr= (int) (Math.random()*255);
       Color randColor3 = new Color(re,bl,gr);
       g.setColor(randColor3);
       g.fillRect(600,425,75,75);
        
       re= (int) (Math.random()*255);  //left side
       bl= (int) (Math.random()*255);
       gr= (int) (Math.random()*255);
       Color randColor4 = new Color(re,bl,gr);
       g.setColor(randColor4);
        Polygon left = new Polygon();
        left.addPoint(575,400);
        left.addPoint(575,475);
        left.addPoint(600,500);
        left.addPoint(600,425);
        g.fillPolygon(left);

    
    }
        
}



    
 