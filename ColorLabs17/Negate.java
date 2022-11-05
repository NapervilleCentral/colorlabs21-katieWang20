
/**
 * Write a description of class Negate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.*;
import java.util.*;
import java.util.List;

public class Negate
{
    // instance variables - replace the example below with your own
    public static void main (String[] args){
        
        Picture splatfest = new Picture ("images\\Splatfest.png");
        
        Pixel[] pixels;
        pixels = splatfest.getPixels();
        
        int r, g, b;
        for (Pixel spot : pixels){
            r = spot.getRed();
            g = spot.getGreen();
            b = spot.getBlue();
            
            int inverseR = 255 - r;
            int inverseG = 255 - g;
            int inverseB = 255 - b;
            
            spot.setRed(inverseR);
            spot.setGreen(inverseG);
            spot.setBlue(inverseB);
            
        
        }
        
        splatfest.explore();
       
        
        
    }
}
