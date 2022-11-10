
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
        
 
         //relative path
         //Picture apic = new Picture("images\\beach.jpg");
         //change with selfie picture
         Picture me = new Picture("images/selfie.jpg");
         Picture me1 = new Picture("images/selfie.jpg");
         Picture me2 = new Picture("images/selfie.jpg");
         
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
         me.write("images/gray");
         Pixel[] pixels2;
         Picture gray = new Picture("images/gray");
         
         pixels2 = gray.getPixels();
         
         for (Pixel spot2 : pixels2){
             int r, g, b;
             r = spot2.getRed();
             g = spot2.getGreen();
             b = spot2.getBlue();
             
             //if (r >= 249 && g >= 249 && b >= 244){
                 //r = 222
             //    spot2.setRed(222); 
             //    spot2.setBlue(255);
             //    spot2.setBlue(255);
                
              if (r > 207 && g > 207 && b > 207){
                 spot2.setRed(222);
                 spot2.setGreen(255);
                 spot2.setBlue(255);
             }else if (r > 148 && g > 158 && b > 148){
                 spot2.setRed(0);
                 spot2.setBlue(51);
                 spot2.setGreen(153);
             
             }else if ((35 > r &&r >= 0) && (35 > g &&g >= 0) && (35 >= b && b >= 0)){
                 spot2.setRed(153);
                 spot2.setGreen(0);
                 spot2.setBlue(0);
                
             } 
             
         }
         
         gray.explore();
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
