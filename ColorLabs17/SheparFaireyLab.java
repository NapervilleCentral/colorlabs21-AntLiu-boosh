
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
         Picture apic = new Picture("images\\beach.jpg");
         //change with selfie picture
         Picture me = new Picture("images/beach.jpg");
         Picture me1 = new Picture("images/beach.jpg");
         Picture me2 = new Picture("images/beach.jpg");
         
         Pixel[] mepix;
         mepix = me.getPixels();
         /**
          * method 1 change
          * 
          */
        
         /**
          * method 2 change
          * 
          */
        int i = 0;
        int intensity;
        int minintensity;
        int maxintensity;
        for (Pixel pixelObj : mepix){
            
        }
        for (Pixel pixelObj : mepix)
        {
            //set the red value of the current pixel to the new value
            intensity = mepix[i].getRed() + mepix[i].getBlue() + mepix[i].getGreen();
            if (intensity <= 191){
                
            }
            else if (intensity <= 382){
                
            }
            else if (intensity <= 573){
                
            }
            else{
                
            }
            i++;
        }
         /**
          * custom color palette
          */

         
    }//main       
}//class
