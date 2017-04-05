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
        int intensity = (int) Math.round(intensity(color));
        Color greyed = new Color(intensity, intensity, intensity);
        return greyed;
    }

    public static boolean areCompatible(Color a, Color b){
        return Math.abs(intensity(a) - intensity(b)) >= 128.0;
    }

    public static void main(String[] args){
        int [] c = new int[6];
        for (int i=0; i<6; i++)
            c[i] = Integer.parseInt(args[i]);
        Color c1 = new Color(c[0], c[1], c[2]);
        Color c2 = new Color(c[3], c[4], c[5]);
        StdOut.println(" The colors entered are Compatible: " + areCompatible(c1, c2));
        if (areCompatible(c1, c2)) {
            AlbersSquares.drawalbers(c1, c2);
        }
        else {
            AlbersSquares.drawalbers(toGrey(c1), toGrey(c2));
        }
    }
}
