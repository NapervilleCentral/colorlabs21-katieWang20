
/**
 * Write a description of class AdjustColors here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdjustColors
{
 
    public static void main (String[] args){
        
        Picture splatfest = new Picture("images//Splatfest.png");
        
        Pixel[] pixels;
        pixels = splatfest.getPixels();
        double adjustR, adjustG, adjustB;
        int adjustedR, adjustedG, adjustedB;
        int r, g, b;          
       
        
       
         
        for (Pixel spot : pixels){
            
            adjustR = 0.5;
            r = spot.getRed();
            g = spot.getGreen();
            b = spot.getBlue();
            
            
            adjustedR = (int)(adjustR * r);
        
            
            spot.setRed(adjustedR);
        }
        splatfest.explore();
        
        /*
        
        for (Pixel spot : pixels){
            adjustG = 1.5;
            g = spot.getGreen();
            
            adjustedG = (int) (adjustG * g);
            
            spot.setGreen(adjustedG);
        
        }
        
        
        */
       /*
        splatfest.explore();
        
        for (Pixel spot: pixels){

            b = spot.getBlue();
            adjustB = 0.25;
            adjustedB = (int)(adjustB * b);
            spot.setBlue(adjustedB);
            
        }
        
        splatfest.explore();
        */
    }
}
