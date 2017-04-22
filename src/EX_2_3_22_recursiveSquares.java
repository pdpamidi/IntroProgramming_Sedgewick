import java.awt.*;

/**
 * Created by Pruthvi on 4/4/2017.
 */
public class EX_2_3_22_recursiveSquares {
    public static void drawsquares(int n, double x, double y, double size){
        if (n==0) return;
        double x0 = x-size/2, x1 = x+size/2;
        double y0 = y-size/2, y1 = y+size/2;

        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, size/2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, size/2);

        drawsquares(n-1, x0, y0, size/2.2);
        drawsquares(n-1, x1, y0, size/2.2);
        drawsquares(n-1, x0, y1, size/2.2);
        drawsquares(n-1, x1, y1, size/2.2);
    }

    public static void main(String [] args){
        int n = Integer.parseInt(args[0]);
        double x=0.5, y=0.5;
        double size = 0.5;
        drawsquares(n, x, y, size);
    }
}
