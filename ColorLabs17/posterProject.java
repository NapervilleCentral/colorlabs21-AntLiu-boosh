import java.awt.*;
import java.util.*;
import java.util.List;
/**
 * Write a description of class posterProject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class posterProject
{
    public static void main(String[] args){
        
        
        Picture schizo = new Picture("images/Schizo3.jpg");
        //Picture canvas = new Picture("images/canvas.jpg");
        Picture temple = new Picture("images/temple.jpg");
        Pixel[] ratpix;
        ratpix = schizo.getPixels();
        //copyToCanvas(schizo, canvas, 0, 0);
        //mirrorY(schizo);
       // copyToCanvas(schizo, canvas, 2000, 0);
        
        Pixel[] tempix;
        tempix = temple.getPixels();
        temple.explore();
        
        mirrorY(temple, 20, 100, 10, 540);
        temple.explore();
        
        //canvas.explore();
        //
        
    }
    
    public static void mirrorY(Picture source){
        int width = source.getWidth();
        int mirrorPoint = width/2;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        for (int col = 0; col < source.getHeight(); col++){
            for (int row = 0; row < mirrorPoint; row++){
                leftPixel = source.getPixel(row,col);
                rightPixel= source.getPixel(width - 1 - row, col);
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    public static void mirrorY(Picture source, int y1, int y2, int x1, int x2){
        int width = x2 - x1;
        int mirrorPoint = width/2;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        for (int col = x1; col < x2; col++){
            for (int row = y1; row < y2; row++){
                leftPixel = source.getPixel(y1 + row,  x1 + col);
                rightPixel = source.getPixel(y1 + width - 1 - row, x1 + col);
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    
    public static void copyToCanvas(Picture source, Picture target, int holdX, int holdY){
        Pixel sourcePix = null;
        Pixel targetPix = null;
        for (int sourceX = 0, targetX = holdX; sourceX < source.getWidth(); sourceX++, targetX++){
            for (int sourceY = 0, targetY = holdY; sourceY < source.getHeight(); sourceY++, targetY++){
                sourcePix = source.getPixel(sourceX, sourceY);
                targetPix = target.getPixel(targetX, targetY);
                targetPix.setColor(sourcePix.getColor());
            }
        }
    }
}
