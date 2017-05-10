/**
 * Created by Pruthvi on 4/29/2017.
 */

/**
 * A simulation of n-body universe that takes a command-line argument dt, reads in a universe
 * from standard input, and simulates the universe using time quantum dt
 * Uses Body data type and constructor depends on the text file format, i.e data driven design
 */
public class Universe {
    //instance variables
    private final int n;
    private final double radius;
    private final Body[] bodies;

    //Constructor
    public Universe(String filename){
        In in = new In(filename);
        n = in.readInt();
        radius = in.readDouble();
        StdDraw.setXscale(-radius, +radius);
        StdDraw.setYscale(-radius, +radius);
        bodies = new Body[n];
        for (int i =0; i<n; i++){
            double rx = in.readDouble();
            double ry = in.readDouble();
            double vx = in.readDouble();
            double vy = in.readDouble();
            double mass = in.readDouble();
            double[] rxy = {rx, ry};
            Vector r = new Vector(rxy);
            double[] vxy = {vx, vy};
            Vector v = new Vector(vxy);
            bodies[i] = new Body(r, v, mass);
        }
    }

    //Instance methods
    public void increaseTime(double dt){
        //create a force vector for each of the body
        Vector[] f = new Vector[n];
        for (int i=0; i<n; i++)
            f[i] = new Vector(new double[2]);
        //calculate the effect of force on each of the body except itself
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i!=j)
                    f[i] = f[i].plus(bodies[i].forceFrom(bodies[j]));
            }
        }

        for (int i = 0; i < n; i++) {
            bodies[i].move(f[i], dt);
        }
    }

    public void draw(){
        for (int i=0; i<n; i++)
            bodies[i].draw();
    }

    //client to create n-body simulation by reading data from file and
    //instantiating the n-bodies using constructor
    public static void main(String[] args){
        Universe newton = new Universe(args[0]);
        double dt = Double.parseDouble(args[1]);
        StdDraw.enableDoubleBuffering();
        while (true){
            StdDraw.clear();
            newton.increaseTime(dt);
            newton.draw();
            StdDraw.show();
            StdDraw.pause(10);
        }
    }
}