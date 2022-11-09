
/**
 * Write a description of class Swap2And3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List;
//swap2 colors – swap the green value for the red value
//swap3 colors – swap all three red = green, green = blue, blue = red
public class Swap2AndSwap3
{
    public static void main (String[] args){
        
        Picture splatfest = new Picture("images//Splatfest.png");
        Pixel[] pixels;
        
        pixels = splatfest.getPixels();
        //swap 2 colors
        for (Pixel spot : pixels){
            int r, g, b;
            r = spot.getRed();
            g = spot.getGreen();
            b = spot.getBlue();
            
            spot.setGreen(r);
            spot.setRed(g);
        
        }
        splatfest.explore();
        
        Picture splatfest2 = new Picture("images//Splatfest.png");
        Pixel[] pixels2;
        
        pixels2 = splatfest2.getPixels();
        
        //swap 3 colors
        for (Pixel spot2 : pixels2){
            int r, g, b;
            r = spot2.getRed();
            g = spot2.getGreen();
            b = spot2.getBlue();
            
            spot2.setRed(g);
            spot2.setGreen(b);
            spot2.setBlue(r);
        
        }
        
        splatfest2.explore();
    }
}
