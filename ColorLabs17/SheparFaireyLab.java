
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
         
      
         
         int arrayLength = pixels.length;
         //method 1
         //0-225 as range
         
         Pixel[] pixels1;
         pixels1 = me1.getPixels();
         
         for (Pixel spot1 : pixels1){
             int r, g, b;
             r = spot1.getRed();
             g = spot1.getGreen();
             b = spot1.getBlue();
             
             int gray = (int)((r + g + b)/3);
             spot1.setRed(gray);
             spot1.setGreen(gray);
             spot1.setBlue(gray);
            
         }
         
         
         //method 2 
         // find minimum and max of pixels
         // max - minimum is the range
         int div = (int)255/4;
         int div2, div3, div4;
         div2 = div * 2;
         div3 = div * 3;
         div4 = 255;
         
         
         for (Pixel spot1 : pixels1){
             int r, g, b;
             r = spot1.getRed();
             g = spot1.getGreen();
             b = spot1.getBlue();
             
             if (r <= div && g <= div && b <= div){
                 spot1.setRed(0);
                 spot1.setGreen(48);
                 spot1.setBlue(80);
             }else if (r <= div2 && g <=div2 && b <=div2){
                 spot1.setRed(176);
                 spot1.setGreen(183);
                 spot1.setBlue(167);
             }else if (r <=div3 && g <=div3 && b <=div3){
                 spot1.setRed(218);
                 spot1.setGreen(20);
                 spot1.setBlue(21);
                 
             }else{
                 spot1.setRed(250);
                 spot1.setGreen(227);
                 spot1.setBlue(173);
             }
         }
         me1.explore();
         me1.write("obama.jpg");
         
         
         int min = 13;
         int max = 255;
         int range = min - max;
         
         Pixel[] pixels2;
         
         pixels2 = me2.getPixels();
         
         
         for (Pixel spot1 : pixels2){
             int r, g, b;
             r = spot1.getRed();
             g = spot1.getGreen();
             b = spot1.getBlue();
             
             int gray = (int)((r + g + b)/3);
             spot1.setRed(gray);
             spot1.setGreen(gray);
             spot1.setBlue(gray);
            
         }
         
         int divi1 = (int) range/4;
         int divi2 = divi1 * 2;
         int divi3 = divi1 * 3;
         int divi4 = max;
         
         for (Pixel spot : pixels2){
             int r, g, b;
             r = spot.getRed();
             g = spot.getGreen();
             b = spot.getBlue();
             if (r <= divi1 && g <= divi1 && b <= divi1){
                 spot.setRed(0);
                 spot.setGreen(48);
                 spot.setBlue(80);
             }else if (r <= divi2 && g <=divi2 && b <=divi2){
                 spot.setRed(176);
                 spot.setGreen(183);
                 spot.setBlue(167);
             }else if (r <=divi3 && g <=divi3 && b <=divi3){
                 spot.setRed(218);
                 spot.setGreen(20);
                 spot.setBlue(21);
                 
             }else{
                 spot.setRed(250);
                 spot.setGreen(227);
                 spot.setBlue(173);
             }            
         
             
         }
         
         //method2
         
         me2.explore();
         
         //System.out.println(Arrays.toString(pixels1));
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
         Pixel[] pixels3;
         Picture gray = new Picture("images/gray");
         
         pixels3 = gray.getPixels();
         
         for (Pixel spot2 : pixels3){
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
             }else if(r > 98 && g > 98 && b > 98){
                 spot2.setRed(106);
                 spot2.setGreen(200);
                 spot2.setRed(23);
             
             }else if ((35 > r &&r >= 0) && (35 > g &&g >= 0) && (35 >= b && b >= 0)){
                 spot2.setRed(153);
                 spot2.setGreen(0);
                 spot2.setBlue(200);
             }else if (70 > r && 70 > g && 70 > b){
                 
                 spot2.setRed(53);
                 spot2.setGreen(70);
                 spot2.setBlue(34);
             }else{
                 spot2.setRed(233);
                 spot2.setGreen(100);
                 spot2.setBlue(10);
             } 
             
         }
         
         gray.explore();
         
         gray.write("images/katie1.jpg");
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
