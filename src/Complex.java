/**
 * Created by Pruthvi on 4/19/2017.
 */

/**
 * Complex numbers data abstraction
 * API:
 * Complex(double real, double imag) -- constructor
 * Complex plus(Complex b)
 * Complex times(Complex b)     -- Product of this number and b
 * double abs()                 -- magnitude
 * double re()                  -- real part
 * double im()                  -- imaginary part
 * String toString()            -- String representation
 */
public class Complex {
    //Instance variables
    private final double real, imag;
    //Constructor
    public Complex(double re, double im){
        real = re;
        imag = im;
    }

    //Instance methods
    public Complex plus(Complex b){
        return new Complex((real+b.re()), (imag+b.im()));
    }

    public Complex times(Complex b){
        double real1 = (real*b.re() - imag*b.im());
        double imag1 = (imag*b.re() + real*b.im());
        return new Complex(real1, imag1);
    }

    public double re(){
        return real;
    }

    public double im(){
        return imag;
    }

    public double abs(){
        return Math.sqrt(real*real + imag*imag);
    }

    public String toString(){
        return real + " + " + imag + "i";
    }
    //Test Client
    public static void main(String[] args){
        Complex z0 = new Complex(1, 1);
        Complex z = z0;
        z = z.times(z).plus(z0);
        StdOut.println("First z^2+z0:" + z);
        z = z.times(z).plus(z0);
        StdOut.println("Second z^2+z0:" + z);
    }
}
