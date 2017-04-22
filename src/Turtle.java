/**
 * Created by Pruthvi on 4/17/2017.
 */

/**
 * API:
 * Turtle(double x0, double y0, double a0)
 * void turnleft(double delta)
 * void goForward(double step)
 */
public class Turtle {
    // Declare Private variables
    private double x, y;
    private double angle;
    //Constructor with starting point and angle
    public Turtle(double x0, double y0, double a0){
        x = x0;
        y = y0;
        angle = a0;
    }
    //Turn the turtle left by delta
    public void turnLeft(double delta){
        angle+=delta;
    }
    //Go from x,y a step distance with angle
    public void goForward(double step){
        double x1 = x, y1 = y;
        x += step*(Math.cos(Math.toRadians(angle)));
        y += step*(Math.sin(Math.toRadians(angle)));
        StdDraw.line(x1, y1, x, y);
    }

    public static void main(String[] args){
        //n - number of sides of the polygon
        //
        int n = Integer.parseInt(args[0]);
        double angle = 360.0/n;
        double step = Math.sin(Math.toRadians(angle/2));
        double x = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        StdDraw.setXscale(-1, 2);
        StdDraw.setYscale(-1, 2);
        Turtle turtle = new Turtle(x, y, angle/2);
        for (int i=0; i<n; i++){
            turtle.goForward(step);
            turtle.turnLeft(angle);
        }
    }
}
