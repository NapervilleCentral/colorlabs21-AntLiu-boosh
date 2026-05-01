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
        Picture schizo = new Picture("images/Schizo2.jpg");
        Pixel[] ratpix;
        ratpix = schizo.getPixels();
        schizo.explore();
    }
}
