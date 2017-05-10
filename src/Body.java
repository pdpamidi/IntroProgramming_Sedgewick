/**
 * Created by Pruthvi on 4/29/2017.
 */

/**
 * N-Body Simulation according to Newton's Laws
 * Use Vector abstraction to hold location and velocity
 * API:
 * Body(Vector r, Vector v, double mass)        --  Constructor, instance variables vector objects and double
 * void move(Vector f, double dt)               --  apply force f, move body for dt seconds
 * void draw()                                  --  draw the ball
 * Vector forceFrom(Body b)                     --  force vector between this body and b
 */
public class Body {
    //Instance variables
    private Vector r;
    private Vector v;
    private final double mass;

    //Constructor
    public Body(Vector r0, Vector v0, double m0){
        r = r0;
        v= v0;
        mass = m0;
    }

    public void move(Vector f, double dt){
        Vector a = f.scale(dt);
        v = v.plus(a.scale(dt));
        r = r.plus(v.scale(dt));
    }

    public void draw(){
        StdDraw.setPenRadius(0.0125);
        StdDraw.point(r.cartesian(0), r.cartesian(1));
    }

    public Vector forceFrom(Body b){
        double G = 6.67e-11;
        Vector delta = b.r.minus(r);
        double dist = delta.magnitude();
        double magnitude = (G * mass * b.mass) / (dist * dist);
        Vector force = delta.direction().scale(magnitude);
        return force;
    }

    //Client to unit test all the methods
}
