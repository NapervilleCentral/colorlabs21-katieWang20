
/**
 * Write a description of class Colorify here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List;

public class Colorify
{
    // instance variables - replace the example below with your own
    public static void main (String[] args){
        Picture face = new Picture("images//face.jpg");
        
        Pixel[] pixels;
        pixels = face.getPixels();
        
        face.explore();
        
        for (Pixel spot: pixels){
            int r, g, b;
            r = spot.getRed();
            g = spot.getGreen();
            b = spot.getBlue();
            
            if ((154>= r && r >=80) && (184 >= g && g >=114) && (182>= b && b >=123)){
                spot.setRed(100);
                spot.setBlue(12);
                spot.setGreen(143);
            }
        
        
        
    
        }
        face.explore();
    }
}