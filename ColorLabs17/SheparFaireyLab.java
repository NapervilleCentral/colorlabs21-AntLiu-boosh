
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
         Picture me1 = new Picture("images/rat.jpg");
         Picture me2 = new Picture("images/rat.jpg"); 
         Picture me3 = new Picture("images/rat2.jpg");
         Picture me4 = new Picture("images/rat2.jpg");
         Picture me5 = new Picture("images/rat2.jpg");
         
         Pixel[] mepix;
         mepix = me.getPixels();
         Pixel[] mepix1;
         mepix1 = me1.getPixels();
         Pixel[] mepix2;
         mepix2 = me2.getPixels();
         Pixel[] mepix3;
         mepix3 = me3.getPixels();
         Pixel[] mepix4;
         mepix4 = me4.getPixels();
         Pixel[] mepix5;
         mepix5 = me5.getPixels();
         //me.explore();
         
        int i = 0;
        int intensity;
        int minintensity = 765;
        int maxintensity = 0;
        
         /**
          * method 1 change
          * 
          */
        /*
        for (Pixel pixelObj : mepix1)
        {
            //set the red value of the current pixel to the new value
            intensity = mepix1[i].getRed() + mepix1[i].getBlue() + mepix1[i].getGreen();
            if (intensity <= 191.25){
                mepix1[i].setColor(new Color(0, 51, 76));
            }
            else if (intensity <= 382.5){
                mepix1[i].setColor(new Color(217, 26, 33));
            }
            else if (intensity <= 573.75){
                mepix1[i].setColor(new Color(112, 150, 158));
            }
            else{
                mepix1[i].setColor(new Color(252, 227, 166));
            }
            i++;
        }
        me1.explore();
        */
         /**
          * method 2 change
          * 
          */
        /* 
        i = 0;
        intensity = 0;
        minintensity = 765;
        maxintensity = 0;
        for (Pixel pixelObj : mepix){
            intensity = mepix[i].getRed() + mepix[i].getBlue() + mepix[i].getGreen();
            if (intensity > maxintensity){
                maxintensity = intensity;
            }
            else if (intensity < minintensity){
                minintensity = intensity;
            }
            i++;
        }
        i=0;
        for (Pixel pixelObj : mepix)
        {
            //set the red value of the current pixel to the new value
            intensity = mepix[i].getRed() + mepix[i].getBlue() + mepix[i].getGreen();
            if (intensity <= maxintensity / 4){
                mepix[i].setColor(new Color(0, 51, 76));
            }
            else if (intensity <= maxintensity / 2){
                mepix[i].setColor(new Color(217, 26, 33));
            }
            else if (intensity <= (maxintensity * 3) / 4){
                mepix[i].setColor(new Color(112, 150, 158));
            }
            else{
                mepix[i].setColor(new Color(252, 227, 166));
            }
            i++;
        }
        me.explore();  
        */
         /**
          * custom color palette
          * CAT
          */
        //me1.explore();
        i = 0;
        intensity = 0;
        minintensity = 765;
        maxintensity = 0;
        for (Pixel pixelObj : mepix2){
            intensity = mepix2[i].getRed() + mepix[i].getBlue() + mepix[i].getGreen();
            if (intensity > maxintensity){
                maxintensity = intensity;
            }
            else if (intensity < minintensity){
                minintensity = intensity;
            }
            i++;
        }
        i=0;
        for (Pixel pixelObj : mepix2){
            //set the red value of the current pixel to the new value
            intensity = mepix2[i].getRed() + mepix2[i].getBlue() + mepix2[i].getGreen();
            if (intensity <= maxintensity / 4){
                mepix2[i].setColor(new Color(167, 0, 0));
            }
            else if (intensity <= maxintensity / 2){
                mepix2[i].setColor(new Color(217, 0, 0));
            }
            else if (intensity <= (maxintensity * 3) / 4){
                mepix2[i].setColor(new Color(255, 112, 112));
            }
            else{
                mepix2[i].setColor(new Color(255, 164, 164));
            }
            i++;
        }
        //me2.explore();
        me2.write("images/cat.jpg");
        /**
         * custom color Palette
         * Not CAT
         */
        i = 0;
        intensity = 0;
        minintensity = 765;
        maxintensity = 0;
        for (Pixel pixelObj : mepix3){
            intensity = mepix3[i].getRed() + mepix3[i].getBlue() + mepix3[i].getGreen();
            if (intensity > maxintensity){
                maxintensity = intensity;
            }
            else if (intensity < minintensity){
                minintensity = intensity;
            }
            i++;
        }
        
        i=0;
        for (Pixel pixelObj : mepix3){
            //set the red value of the current pixel to the new value
            intensity = mepix3[i].getRed() + mepix3[i].getBlue() + mepix3[i].getGreen();
            if (intensity <= maxintensity / 4){
                mepix3[i].setColor(new Color(0, 36, 38));
            }
            else if (intensity <= maxintensity / 2){
                mepix3[i].setColor(new Color(0, 61, 64));
            }
            else if (intensity <= (maxintensity * 3) / 4){
                mepix3[i].setColor(new Color(7, 107, 112));
            }
            else{
                mepix3[i].setColor(new Color(2, 136, 142));
            }
            i++;
        }
        me3.explore();
        
        i=0;
        for (Pixel pixelObj : mepix4){
            //set the red value of the current pixel to the new value
            intensity = mepix4[i].getRed() + mepix4[i].getBlue() + mepix4[i].getGreen();
            if (intensity <= maxintensity / 5){
                mepix4[i].setColor(new Color(1, 46, 52));
            }
            else if (intensity <= (maxintensity * 2) / 5){
                mepix4[i].setColor(new Color(14, 70, 78));
            }
            else if (intensity <= (maxintensity * 3) / 5){
                mepix4[i].setColor(new Color(36, 96, 104));
            }
            else if (intensity <= (maxintensity * 4) / 5){
                mepix4[i].setColor(new Color(66, 122, 130));
            }
            else{
                mepix4[i].setColor(new Color(105, 150, 156));
            }
            i++;
        }
        me4.explore();
        
        i=0;
        for (Pixel pixelObj : mepix5){
            //set the red value of the current pixel to the new value
            intensity = mepix5[i].getRed() + mepix5[i].getBlue() + mepix5[i].getGreen();
            if (intensity <= maxintensity / 7){
                mepix5[i].setColor(new Color(0, 0, 0));
            }
            else if (intensity <= (maxintensity * 2) / 7){
                mepix5[i].setColor(new Color(85, 0, 0));
            }
            else if (intensity <= (maxintensity * 3) / 7){
                mepix5[i].setColor(new Color(14, 70, 78));
            }
            else if (intensity <= (maxintensity * 4) / 7){
                mepix5[i].setColor(new Color(170, 57, 57));
            }
            else if (intensity <= (maxintensity * 5) / 7){
                mepix5[i].setColor(new Color(66, 122, 130));
            }
            else if (intensity <= (maxintensity * 6) / 7){
                mepix5[i].setColor(new Color(255, 170, 170));
            }
            else{
                mepix5[i].setColor(new Color(200, 255, 255));
            }
            i++;
        }
        me5.explore();
    }//main       
}//class
