
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
        p1.explore();
        
        //adjustRed()
        /**/
        for (Pixel pixelObj : p1pix){
            p1pix[i].setRed((int)value);
            i++;
        }
        p1.explore();
        /**/
       
        //negate()
        /**/
        i = 0;
        for (Pixel pixelObj : p2pix){
            p2pix[i].setRed(225 - p2pix[i].getRed());
            p2pix[i].setBlue(225 - p2pix[i].getBlue());
            p2pix[i].setGreen(225 - p2pix[i].getGreen());
            i++;
        }
        p2.explore();
        /**/
       
        //grayscale()
        /**/
        i = 0;
        for (Pixel pixelObj : p3pix){
            value = (p3pix[i].getRed() + p3pix[i].getBlue() + p3pix[i].getGreen()) / 3;
            p3pix[i].setColor(new Color((int)value, (int)value, (int)value));
            i++;
        }
        p3.explore();
        /**/
       
        //darken()
        /**/
        i = 0;
        for (Pixel pixelObj : p4pix){
            value = p4pix[i].getRed();
            if (value > 50){
                p4pix[i].setRed((int)value - 50);
            }
            else {
                p4pix[i].setRed(0);
            }
            value = p4pix[i].getBlue();
            if (value > 50){
                p4pix[i].setBlue((int)value - 50);
            }
            else {
                p4pix[i].setBlue(0);
            }
            value = p4pix[i].getGreen();
            if (value > 50){
                p4pix[i].setGreen((int)value - 50);
            }
            else {
                p4pix[i].setGreen(0);
            }
            i++;
        }
        p4.explore();
        /**/
       
        //changeColor()
        /**/
        i = 0;
        for (Pixel pixelObj : p5pix){
            if ((int)value + p5pix[i].getRed() > 255){
                p5pix[i].setRed(255);
            }
            else if ((int)value + p5pix[i].getRed() < 0){
                p5pix[i].setRed(0);
            }
            else {
                p5pix[i].setRed((int)value + p5pix[i].getRed());
            }
            if ((int)value2 + p5pix[i].getBlue() > 255){
                p5pix[i].setBlue(255);
            }
            else if ((int)value2 + p5pix[i].getBlue() < 0){
                p5pix[i].setBlue(0);
            }
            else {
                p5pix[i].setBlue((int)value2 + p5pix[i].getBlue());
            }
            if ((int)value3 + p5pix[i].getGreen() > 255){
                p5pix[i].setGreen(255);
            }
            else if ((int)value3 + p5pix[i].getGreen() < 0){
                p5pix[i].setGreen(0);
            }
            else {
                p5pix[i].setGreen((int)value3 + p5pix[i].getGreen());
            }
            i++;
        }
        p5.explore();
        /**/
       
        //colorify()
        //sky to red
        /**/
        i = 0;
        for (Pixel pixelObj : p6pix){
            if (p6pix[i].getRed() > 60 && p6pix[i].getRed() < 130){
                if (p6pix[i].getGreen() > 130 && p6pix[i].getGreen() < 190){
                    if (p6pix[i].getBlue() > 170 && p6pix[i].getBlue() < 240){
                        p6pix[i].setColor(new Color(255,0,0));
                    }
                }
            }
            i++;
        }
        p6.explore();
        /**/
    }
}
