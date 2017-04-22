/**
 * Created by pruth on 4/21/2017.
 */

/**
 * Data Type rational for rational numbers
 * API:
 * Rational (int numerator, int denominator)      --    Constructor
 * Rational plus(Rational b)                      --    sum of this number and b
 * Rational minus(Rational b)                     --    difference of this number and b
 * Rational times(Rational b)                     --    product of this number and b
 * Rational divides(Rational b)                   --    quotient of this number and b
 * String toString()                              --    string representation
 */
public class EX_327_Rational {
    //Instance variables
    private int numerator;
    private int denominator;
    //Constructor
    public EX_327_Rational(int num, int den){
        if (den==0){
            throw new RuntimeException("Denominator is zero");
        }
        int gcd = gcd(num, den);
        numerator = num/gcd;
        denominator = den/gcd;
    }

    //helper function
    private static int gcd(int m ,int n){
        if (n==0) return m;
        else return gcd(n, m%n);
    }

    //Instance method plus
    public EX_327_Rational plus(EX_327_Rational b){
        if (denominator == b.denominator) {
            int gcd = gcd(numerator+b.numerator, denominator);
            return new EX_327_Rational((numerator+b.numerator)/gcd, denominator/gcd);
        }
        else {
            int denom = denominator*b.denominator;
            int num1 = numerator*b.denominator;
            int num2 = b.numerator*denominator;
            int gcd = gcd(num1+num2, denom);
            return new EX_327_Rational((num1+num2)/gcd,denom/gcd);
        }
    }

    //Instance method minus
    public EX_327_Rational minus(EX_327_Rational b){
        if (denominator == b.denominator) {
            int gcd = gcd(numerator-b.numerator, denominator);
            return new EX_327_Rational((numerator-b.numerator)/gcd, denominator/gcd);
        }
        else {
            int denom = denominator*b.denominator;
            int num1 = numerator*b.denominator;
            int num2 = b.numerator*denominator;
            int gcd = gcd(num1-num2, denom);
            return new EX_327_Rational((num1-num2)/gcd,denom/gcd);
        }
    }

    //Instance method times - multiply two rational numbers
    public EX_327_Rational times(EX_327_Rational b){
        int gcd = gcd(numerator*b.numerator, denominator*b.denominator);
        return new EX_327_Rational((numerator*b.numerator)/gcd, (denominator*b.denominator)/gcd);
    }

    //Instance method divides - divide two rational numbers
    public EX_327_Rational divides(EX_327_Rational b){
        int gcd = gcd(numerator*b.denominator, denominator*b.numerator);
        return new EX_327_Rational((numerator*b.denominator)/gcd, (denominator*b.numerator)/gcd);
    }

    public String toString(){
        return numerator + " / " + denominator;
    }

    //Static main, unit test all the instance methods
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        int den1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int den2 = Integer.parseInt(args[3]);
        EX_327_Rational rational = new EX_327_Rational(num1, den1);
        EX_327_Rational rational1 = new EX_327_Rational(num2, den2);
        StdOut.println(rational);
        StdOut.println(rational1);
        StdOut.println(rational.plus(rational1));
        StdOut.println(rational.minus(rational1));
    }
}
