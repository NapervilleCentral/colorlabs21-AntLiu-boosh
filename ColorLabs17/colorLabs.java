
/**
 * Write a description of class colorLabs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List;
public class colorLabs
{
    public static void main(String[] args){
        Picture p1 = new Picture("images/femaleLionAndHall.jpg");
        Picture p2 = new Picture("images/femaleLionAndHall.jpg");
        Picture p3 = new Picture("images/femaleLionAndHall.jpg");
        Picture p4 = new Picture("images/femaleLionAndHall.jpg");
        Picture p5 = new Picture("images/femaleLionAndHall.jpg");
        Picture p6 = new Picture("images/femaleLionAndHall.jpg");
        Pixel[] p1pix;
        p1pix = p1.getPixels();
        Pixel[] p2pix;
        p2pix = p2.getPixels();
        Pixel[] p3pix;
        p3pix = p3.getPixels();
        Pixel[] p4pix;
        p4pix = p4.getPixels();
        Pixel[] p5pix;
        p5pix = p5.getPixels();
        Pixel[] p6pix;
        p6pix = p6.getPixels();
        Scanner input = new Scanner(System.in);
        System.out.println("input pls: ");
        double value = input.nextDouble();
        double value2 = input.nextDouble();
        double value3 = input.nextDouble();
        int i = 0;
        
        //adjustRed()
        /*
        for (Pixel pixelObj : p1pix){
            p1pix[i].setRed((int)value);
            i++;
        }
        p1.explore();
        */
       
        //negate()
        /*
        i = 0;
        for (Pixel pixelObj : p2pix){
            p2pix[i].setRed(225 - p2pix[i].getRed());
            p2pix[i].setBlue(225 - p2pix[i].getRed());
            p2pix[i].setGreen(225 - p2pix[i].getRed());
            i++;
        }
        p2.explore();
        */
       
        //grayscale()
        /*
        i = 0;
        for (Pixel pixelObj : p3pix){
            value = (p3pix[i].getRed() + p3pix[i].getBlue() + p3pix[i].getGreen()) / 3;
            p3pix[i].setColor(new Color((int)value, (int)value, (int)value));
            i++;
        }
        p3.explore();
        */
       
        //lighten()
        /**/
        i = 0;
        for (Pixel pixelObj : p4pix){
            
        }
        p4.explore();
        /**/
       
        //changeColor()
        /*
        i = 0;
        for (Pixel pixelObj : p5pix){
            
        }
        p5.explore();
        */
       
        //blueify()
        /*
        i = 0;
        for (Pixel pixelObj : p6pix){
            
        }
        p6.explore();
        */
    }
}
