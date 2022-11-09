
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List;
 // resolves problem with java.awt.List and java.util.List
public class MaxColors
{

      public static void main(String[] args)
      {
         //opens picture using a dialog box
         /**/
   

         //opens a pictue using a path
         //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     
         //relative path
         //Class id     memory   constructor
        Picture splatfest = new Picture("images\\Splatfest.png");
        Picture splatfest2 = new Picture("images\\Splatfest.png"); 
        Picture splatfest3 = new Picture("images\\Splatfest.png");
        
        //makes an array of pixels. Given. Use an array for each picture. 
        Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     pixels = splatfest.getPixels();//each pixel will be processed
    
     //how many pixels or how large array
     System.out.println("This is a large array"+pixels.length  );


 
    splatfest.explore();

    Pixel[] pixels1;
           
    pixels1 = splatfest.getPixels();

    for (Pixel spot2 : pixels1){        
        spot2.setRed(255);
    
    }
    splatfest.explore();
    
    Pixel[] pixels2;
    pixels2 = splatfest2.getPixels();
    for (Pixel spot2 : pixels2){
        spot2.setGreen(255);
   
    }
    splatfest2.explore();
    
    Pixel[] pixels3;
    pixels3 = splatfest3.getPixels();
    
    for(Pixel spot2: pixels3){
        spot2.setBlue(255);
    
    }
    splatfest3.explore();
    
    splatfest.write("images/splatfestRed.png");
    splatfest2.write("images/splatfestGreen.png");
    splatfest3.write("images/splatfestBlue.png");
    
    //System.out.println(Arrays.toString(pixels3));
    
    /**/
  }//main
}//class

