/**
 * Created by pruth on 4/22/2017.
 */

/**
 * Extend Complex class and add new API
 * API added:
 * double theta()                   -- phase(angle of this number
 * Complex minus(Complex b)         -- difference of this number and b
 * Complex conjugate()              -- conjugate of this number
 * Complex divides(Complex b)       -- result of dividing this number by b
 * Complex power(int b)             -- result of raising this number to the bth power
 */
public class Complex_Extended extends Complex{
    //Constructor in subclass calling superclass
    public Complex_Extended(){ super(); }

    public Complex_Extended(double re, double im){
        super(re, im);
    }
    //Angle of complex number is tan-1(b/a)
    public double theta(){
        double radians = Math.atan(im()/re());
        return radians;
    }

    //Instance method for difference of numbers
    public Complex_Extended minus(Complex_Extended b){
        return new Complex_Extended(re()-b.re(), im()-b.im());
    }

    //Instance method for conjugate, i.e shift the symbol of the imaginary part
    public Complex_Extended conjugate(){
        return new Complex_Extended(re(), -im());
    }

    public Complex_Extended times(Complex_Extended b){
        double real1 = (re()*b.re() - im()*b.im());
        double imag1 = (im()*b.re() + re()*b.im());
        return new Complex_Extended(real1, imag1);
    }
    //Instance method for divides
    public Complex_Extended divides(Complex_Extended b){
        Complex_Extended b_conj = b.conjugate();
        double denominator = b.re()*b.re() + b.im()*b.im();
        Complex_Extended numerator = times(b_conj);
        return new Complex_Extended(numerator.re()/denominator, numerator.im()/denominator);
    }

    //Instance method to calculate power
    //Use recursive call to call back the function
    public Complex_Extended power(int b){
        if (b==0) return new Complex_Extended(1, 0);
        if (b==1) return new Complex_Extended(re(), im());
        return this.times(power(b-1));
    }

    //Main method to unit test the instance methods of Complex_Extended module
    public static void main(String[] args){
        double re = Double.parseDouble(args[0]);
        double im = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        Complex_Extended comp = new Complex_Extended(re, im);
        StdOut.println("Complex :" + comp + " raised to power " + n + " is " + comp.power(n));
        StdOut.println("Complex :" + comp + " divided by same complex is " + comp.divides(comp));
        StdOut.println("Complex :" + comp + " divided by same complex raised to power 2 is " + comp.divides(comp.power(2)));
        StdOut.println("Complex :" + comp + " conjugate is " + comp.conjugate());
        StdOut.println("Complex :" + comp + " phase is " + comp.theta());
        StdOut.println("Complex :" + comp + " minus same complex raised to power 2 is " + comp.minus(comp.power(2)));
    }
}