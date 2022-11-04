
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
public class Colors
{

      public static void main(String[] args)
      {
      //opens picture using a dialog box
      /**/
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     
     //relative path
     //Class id     memory   constructor
     Picture trio = new Picture("images\\trio.jpg");
   
     //makes an array of pixels. Given. Use an array for each picture. 
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     pixels = trio.getPixels();//each pixel will be processed
    
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );


    /**/
        //access each index
    System.out.println(pixels[17]);
    pixels[17].setColor(Color.yellow);
    pixels[18].setColor(Color.green);
    
    
    //ferris1.explore();


    //for each loop spot  is a ?
    int count = 0;
    for (Pixel spot2 : pixels){
        //System.out.println( spot2 );
        //
        spot2.setGreen((int)(spot2.getGreen() * 0.5));
        
        if (count % 3 == 0){
            spot2.setColor(new Color(255, 240, 245));
        }
        count ++;
        
        if (count % 13 == 0){
            spot2.setColor(new Color(23, 100, 200));
        
        }
    }    
    trio.explore();

    Pixel[] pixelsT;
    
    pixelsT = trio.getPixels();
    int r, g, b;
    for (Pixel spot2 : pixelsT){
        r = spot2.getRed();
        g = spot2.getGreen();
        b = spot2.getBlue();
        
        if (r <= 31 && g <= 34 && b <=49){
            spot2.setRed(255);
            spot2.setGreen(239);
            spot2.setBlue(213);
        
        }
        
    }
    trio.explore();


 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
  

    /**/
  }//main
}//class

