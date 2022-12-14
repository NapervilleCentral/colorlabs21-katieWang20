
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17Per7
{

    /**
     * main method, to test the picture
     *
     */
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
     Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture cute = new Picture("images/kitten2.jpg");
     Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");

     cute.explore(); //method. a method does something
     ferris1.explore();
     
     //makes an array of pixels. Given. Use an array for each picture. 
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     pixels = ferris1.getPixels();//each pixel will be processed
    
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );


    /**/
        //access each index
    System.out.println(pixels[17]);
    pixels[17].setColor(Color.yellow);
    pixels[18].setColor(Color.green);
    
    
    //ferris1.explore();
    //access each pixel
    Pixel spot = ferris1.getPixel(100,100);
    spot.setColor(Color.green);
    spot = ferris1.getPixel(50, 51);
    spot.setColor(Color.pink);
    //ferris1.explore();
   //11.02 lets get changing
    
    //System.out.println(pixels[17].getColor());
    //System.out.println(spot);
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
*/
   // loop to access indexes of array or collection
    
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
    ferris1.explore();

    Pixel[] pixelsC;
    
    pixelsC = cute.getPixels();
    int r, g, b;
    for (Pixel spot2 : pixelsC){
        r = spot2.getRed();
        g = spot2.getGreen();
        b = spot2.getBlue();
        
        if (r <= 31 && g <= 34 && b <=49){
            spot2.setRed(255);
            spot2.setGreen(239);
            spot2.setBlue(213);
        
        }
        
    }
    cute.explore();
    
    cute.write("images/creamyKitten");

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
    ferris1.write("images/ferris11.jpg");

    /**/
  }//main
}//class
