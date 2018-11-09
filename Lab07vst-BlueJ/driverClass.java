import java.awt.*;
import java.applet.*;

//Andrew (Joe did parameters for his stuff)

public class driverClass extends Applet{
    public void paint (Graphics g) {
        arrow.arrow(g);
        masonName.nameInBox(g);
        face.Eyes(g,300,350,500,350);
        face.Mouth(g,275,500,50,275,180,180);
        face.Face(g,200,250,350,425);
        face.Bowl(g,200,200,300,425,360,180);  
    }
}
