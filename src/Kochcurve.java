/**
 * Created by Pruthvi on 4/19/2017.
 */

/**
 * Koch curve of order n - draw a Koch curve of order n-1, turn left 60 degrees,
 * draw a second Koch curve of order n-1...
 * Use Turtle program to draw koch curve
 */
public class Kochcurve {
    //Static method to generate the recursive curve
    public static void koch(int n, double step, Turtle turtle){
        if (n == 0){
            turtle.goForward(step);
            return;
        }
        koch(n-1, step, turtle);
        turtle.turnLeft(60.0);
        koch(n-1, step, turtle);
        turtle.turnLeft(-120.0);
        koch(n-1, step, turtle);
        turtle.turnLeft(60.0);
        koch(n-1, step, turtle);
    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        double step = 1.0/Math.pow(3.0, n);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(-1, 1);
        Turtle turtle = new Turtle(0.0, 0.0, 0.0);
        koch(n, step, turtle);
    }
}
