import java.awt.Color;

/**
 * Created by pruth on 4/3/2017.
 */
public class Luminance {
    public static double intensity(Color color){
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        double intensity = 0.299*r+0.587*g+0.114*b;
        return intensity;
    }

    public static Color toGrey(Color color){
        double intensity = Math.round(intensity(color));
        
    }

    public static boolean areCompatible(Color a, Color b){

    }

    public static void main(String[] args){

    }
}
