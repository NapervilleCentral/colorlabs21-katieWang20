
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture(fileName);
         pictObj.explore();
         
         //relative path
         //Picture apic = new Picture("images\\beach.jpg");
         //change with selfie picture
         Picture me = new Picture("images/selfie.jpg");
         Picture me1 = new Picture("images/beach.jpg");
         Picture me2 = new Picture("images/beach.jpg");
         
         Pixel[] pixels;
         
         pixels = me.getPixels();
         
         int min = 13;
         int max = 225; 
         
         int arrayLength = pixels.length;
         
         //turn into grayscale
         for (Pixel spot : pixels){
             int r, g, b;
             r = spot.getRed();
             g = spot.getGreen();
             b = spot.getBlue();
             
             int gray = (int)((r + g + b)/3);
             spot.setRed(gray);
             spot.setGreen(gray);
             spot.setBlue(gray);
         }
         
         me.explore();
         
         /**
          * method 1 change
          * 
          */
         
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
