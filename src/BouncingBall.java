/**
 * Created by pruth on 3/26/2017.
 */
public class BouncingBall {
    public static void main(String[] args){
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        double rx = 0.480, ry = 0.860;
        double vx = 0.015, vy = 0.023;
        double radius = 0.1;
        StdDraw.enableDoubleBuffering();
        long i = 0;
        while (i < 100000){
            i++;
            if (Math.abs(rx+vx) + radius>1.0) vx=-vx;
            if(Math.abs(ry+vy) + radius > 1.0) vy=-vy;
            rx+=vx;
            ry+=ry;
            StdDraw.clear();
            StdDraw.filledCircle(rx, ry, radius);
            StdDraw.show();
            StdDraw.pause(20000);
        }
    }
}
