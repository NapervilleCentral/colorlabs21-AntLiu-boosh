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
        Picture schizo1 = new Picture("images/Schizo3.jpg");
        Picture schizo2 = new Picture("images/Schizo3.jpg");
        Picture schizo3 = new Picture("images/Schizo3.jpg");
        Picture loss = new Picture("images/Loss_comic.jpg");
        Picture canvas = new Picture("images/canvas.jpg");
        Picture temple = new Picture("images/temple.jpg");
        
        Pixel[] ratpix;
        ratpix = schizo.getPixels();
        copyToCanvas(schizo, canvas, 0, 0);
        mirrorY(schizo);
        //mirrorX(schizo);
        copyToCanvas(schizo, canvas, 2000, 0);
        blend(schizo1, loss);
        copyToCanvas(schizo1, canvas, 4000, 0);
        compressRight(schizo, schizo.getWidth()/2);
        copyToCanvas(schizo, canvas, 0, 1500);
        filter(schizo2);
        compressRight(schizo2, 1500);
        copyToCanvas(schizo2, canvas, 2000, 1500);
        corrupt(schizo3);
        blend(schizo3,schizo);
        copyToCanvas(schizo3, canvas, 4000, 1500);
        /*
        Pixel[] tempix;
        tempix = temple.getPixels();
        temple.explore();
        
        compressRight(temple, temple.getWidth()/2);
        temple.explore();
        */
        canvas.explore();
        //
        canvas.write("images/FinalCollage.jpg");
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
        for (int col = x1; col < y2; col++){
            for (int row = y1; row < mirrorPoint; row++){
                leftPixel = source.getPixel(x1 + row,  y1 + col);
                rightPixel = source.getPixel(x2 - 1 - row, y1 + col);
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    
    public static void mirrorX(Picture source){
        int height = source.getHeight();
        int mirrorPoint = height/2;
        Pixel upPixel = null;
        Pixel downPixel = null;
        for (int row = 0; row < source.getWidth(); row++){
            for (int col = 0; col < mirrorPoint; col++){
                upPixel = source.getPixel(row,col);
                downPixel= source.getPixel(row, height - 1 - col);
                upPixel.setColor(downPixel.getColor());
            }
        }
    }
    
    public static void blend(Picture source, Picture overlay){
        Pixel sourcePixel = null;
        Pixel overlayPixel = null;
        for (double col = 0; col < source.getHeight(); col += 2){
            for (double row = 1; row < source.getWidth() - 1; row += 3){
                sourcePixel = source.getPixel((int)row, (int)col);
                overlayPixel = overlay.getPixel((int)row, (int)col);
                sourcePixel.setColor(overlayPixel.getColor());
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
    
    public static void compressRight(Picture source, int holdX){
        if (source.getWidth() - holdX <= 20){
            return; 
        }
        int midpoint = (source.getWidth() - holdX)/2 + holdX;
        Pixel sourcePix = null;
        Pixel targetPix = null;
        
        for (int sourceX = source.getWidth() - 1, targetX = source.getWidth() - 1, count = 0; sourceX > holdX; sourceX--, targetX--, count++){
            for (int sourceY = 0, targetY = 0; sourceY < source.getHeight(); sourceY++, targetY++){
                sourcePix = source.getPixel(sourceX - count, sourceY);
                targetPix = source.getPixel(targetX, targetY);
                targetPix.setColor(sourcePix.getColor());
            }
        }
        compressRight(source, midpoint);
    }
    
    public static void filter(Picture source){
        Pixel sourcePix = null;
        for (int sourceX = 0; sourceX < source.getWidth(); sourceX++){
            for (int sourceY = 0; sourceY < source.getHeight(); sourceY++){
                sourcePix = source.getPixel(sourceX, sourceY);
                int average = (sourcePix.getRed() + sourcePix.getBlue() + sourcePix.getGreen())/3;
                if (average > 215){
                    average = 215;
                }
                else if(average < 40){
                    average = 40;
                }
                Color grey = new Color(average + 40, average, average - 40);
                sourcePix.setColor(grey);
            }
        }
    }
    
   public static void filter2(Picture source){
        Pixel sourcePix = null;
        for (int sourceX = 0; sourceX < source.getWidth(); sourceX++){
            for (int sourceY = 0; sourceY < source.getHeight(); sourceY++){
                sourcePix = source.getPixel(sourceX, sourceY);
                int average = (sourcePix.getRed() + sourcePix.getBlue() + sourcePix.getGreen())/3;
                if (average > 215){
                    average = 215;
                }
                else if(average < 40){
                    average = 40;
                }
                Color grey = new Color(average + 20, average - 20, average - 20);
                sourcePix.setColor(grey);
            }
        }
    }
    
    public static void corrupt(Picture source){
        Random randy = new Random();
        Pixel hold = null;
        Pixel change = null;
        for (int i = 0; i < 150000; i++){
            int rand1 = randy.nextInt(source.getWidth() - 1), rand2 = randy.nextInt(source.getHeight() - 1);
            int rand3 = randy.nextInt(source.getWidth() - 1), rand4 = randy.nextInt(source.getHeight() - 1);
            
            hold = source.getPixel((rand1), (rand2));
            change = source.getPixel((rand3), (rand4));
            if (randy.nextInt(10) < 8)
                change.setColor(hold.getColor());
            else{
                change.setColor(new Color(randy.nextInt(255), randy.nextInt(255), randy.nextInt(255)));
            }
            
            hold = source.getPixel((rand1 + 1), (rand2));
            change = source.getPixel((rand3 + 1), (rand4));
            if (randy.nextInt(10) < 8)
                change.setColor(hold.getColor());
            else{
                change.setColor(new Color(randy.nextInt(255), randy.nextInt(255), randy.nextInt(255)));
            }
            
            hold = source.getPixel((rand1), (rand2 + 1));
            change = source.getPixel((rand3), (rand4 + 1));
            if (randy.nextInt(10) < 8)
                change.setColor(hold.getColor());
            else{
                change.setColor(new Color(randy.nextInt(255), randy.nextInt(255), randy.nextInt(255)));
            }
            
            hold = source.getPixel((rand1 + 1), (rand2 + 1));
            change = source.getPixel((rand3 + 1), (rand4 + 1));
            if (randy.nextInt(10) < 9)
                change.setColor(hold.getColor());
            else{
                change.setColor(new Color(randy.nextInt(255), randy.nextInt(255), randy.nextInt(255)));
            }
        }
    }
}
