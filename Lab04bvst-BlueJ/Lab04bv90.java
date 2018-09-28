// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bv90 extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
        g.drawRect(25,25,225,225); // back wall
        g.drawRect(100,100,225,225); // front wall
        g.drawLine(25,25,100,100); // top left edge
        g.drawLine(250,250,325,325); // bottom right edge
        g.drawLine(25,250,100,325); // bottom left edge
        g.drawLine(250,25,325,100); // top right edge
        
        // DRAW SPHERE
        g.drawOval(50,75,225,225); // outer circle
        g.drawArc(50,175,225,25,0,180); // arcs going up
        g.drawArc(50,150,225,75,0,180);
        g.drawArc(50,125,225,125,0,180);
        g.drawArc(50,100,225,175,0,180);
        g.drawArc(175,50,25,225,90,180); // arcs going left
        g.drawArc(150,50,75,225,90,180);
        g.drawArc(125,50,125,225,90,180);
        g.drawArc(100,50,175,225,90,180);
        
        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(775,450,200,200); // outer circle
        g.drawLine(775,550,941,475); // triangle
        g.drawLine(875,650,941,475);
        g.drawLine(775,550,875,650); // triangle
        g.drawOval(810,518,93,93);
        
        // DRAW APCS
        g.fillRect(25,500,25,125); // A
        g.fillRect(75,500,25,125);
        g.fillRect(50,500,25,25);
        g.fillRect(50,550,25,25); // A
        g.fillRect(125,500,25,125); // P
        g.fillRect(150,500,50,25);
        g.fillRect(175,525,25,25);
        g.fillRect(150,550,50,25); // P
        g.fillRect(225,500,75,25); // C
        g.fillRect(225,525,25,75);
        g.fillRect(225,600,75,25); // C
        g.fillRect(325,500,75,25); // S
        g.fillRect(325,525,25,25);
        g.fillRect(325,550,75,25);
        g.fillRect(375,575,25,25);
        g.fillRect(325,600,75,25); // S
        
        // DRAW PACMEN FLOWER
        g.fillArc(775,160,100,100,135,275); // top
        g.fillArc(710,225,100,100,225,275); // left
        g.fillArc(775,290,100,100,315,275); // bottom
        g.fillArc(840,225,100,100,45,275); // right
	}

}


