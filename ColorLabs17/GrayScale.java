
/**
 * Write a description of class GrayScale here.
 *idk i searched up some formula
 * @author (your name)
 * @version (a version number or a date)
 * thanks to google for giving the formula to make everything grayscale
 * 
 */
import java.awt.*;
import java.util.*;
import java.util.List;

public class GrayScale
{
    // instance variables - replace the example below with your own
    public static void main (String[] args){
        Picture splatfest = new Picture("images//Splatfest.png");
        Pixel[] pixels;
        
        pixels = splatfest.getPixels();
        
        for (Pixel spot : pixels){
            int r, g, b;
            r = spot.getRed();
            g = spot.getGreen();
            b = spot.getBlue();
            
            int gray = (int)(0.3*r + 0.59 * g + 0.11 * b);
            
            
            spot.setRed(gray);
            spot.setGreen(gray);
            spot.setBlue(gray);
            
        
        }
        splatfest.explore();
    
    }    
    
    
}
