
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
        /*
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture(fileName);
         pictObj.explore();
         */
         //relative path
         Picture apic = new Picture("images\\beach.jpg");
         //change with selfie picture
         Picture me = new Picture("images/rat.jpg");
         Picture me1 = new Picture("images/beach.jpg");
         Picture me2 = new Picture("images/beach.jpg");
         
         Pixel[] mepix;
         mepix = me.getPixels();
         me.explore();
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
        int minintensity = 765;
        int maxintensity = 0;
        for (Pixel pixelObj : mepix){
            intensity = mepix[i].getRed() + mepix[i].getBlue() + mepix[i].getGreen();
            if (intensity > maxintensity){
                maxintensity = intensity;
            }
            else if (intensity < minintensity){
                minintensity = intensity;
            }
        }
        for (Pixel pixelObj : mepix)
        {
            //set the red value of the current pixel to the new value
            intensity = mepix[i].getRed() + mepix[i].getBlue() + mepix[i].getGreen();
            if (intensity <= maxintensity / 4){
                mepix[i].setColor(new Color(0,0,0));
            }
            else if (intensity <= maxintensity / 2){
                mepix[i].setColor(new Color(0,0,255));
            }
            else if (intensity <= (maxintensity * 3) / 4){
                mepix[i].setColor(new Color(255,0,0));
            }
            else{
                mepix[i].setColor(new Color(255,255,255));
            }
            i++;
        }
         /**
          * custom color palette
          */
        me.explore();  
         
    }//main       
}//class
