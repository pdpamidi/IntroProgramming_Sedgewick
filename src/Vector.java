/**
 * Created by Pruthvi on 4/22/2017.
 */

/**
 * API for implementing vector data type:
 * Vector(double[] a)                   --      Create a vector with the given Cartesian coordinates
 * Vector plus(Vector that)             --      sum of this vector and that
 * Vector minus(Vector that)            --      difference of this vector and that
 * Vector scale(double alpha)           --      this vector scaled by alpha
 * double dot(Vector b)                 --      dot product of this vector and that
 * double magnitude()                   --      magnitude
 * Vector direction()                   --      unit vector with the same direction as this vector
 * double cartesian(int i)              --      int cartesian coordinate
 * String toString()                    --      String representation
 */
public class Vector {
    //Declare immutable data type i.e instance variables
    private final double[] coords;     // array of vector's components
    private final int n;             // length of the vector

    // create the zero vector of length n
    public Vector(int n) {
        this.n = n;
        this.coords = new double[n];
    }
    //Constructor to initialize the coordinates
    public Vector(double[] a){
        //Use defensive copy to ensure immutability
        n = a.length;
        coords = new double[n];
        for (int i=0; i<a.length; i++)
            coords[i]= a[i];
    }

    //Instance Methods
    public Vector plus(Vector that){
    //sum of this and that vectors
        if (this.length() != that.length())
            throw new RuntimeException("Dimension for summing vectors do not match");
        double[] result = new double[coords.length];
        for (int i = 0; i< coords.length; i++)
            result[i] = this.coords[i] + that.coords[i];
        return new Vector(result);
    }

    public Vector minus(Vector that){
        if (this.length() != that.length())
            throw new RuntimeException("Dimension for subtracting vectors do not match");
        //sum of this and that vectors
        double[] result = new double[coords.length];
        for (int i = 0; i< coords.length; i++)
            result[i] = this.coords[i] - that.coords[i];
        return new Vector(result);
    }

    public Vector scale(double alpha){
        //Scale the vector by alpha and return a vector type
        double[] result = new double[coords.length];
        for (int i=0; i<coords.length; i++)
            result[i] = this.coords[i]*alpha;
        return new Vector(result);
    }

    public double dot(Vector that){
        //dot product of this and that vectors and return double value
        double result=0;
        for (int i=0; i<coords.length; i++)
            result+=coords[i]*that.coords[i];
        return result;
    }

    public double magnitude(){
        //Magnitude of the current vector
        return Math.sqrt(this.dot(this));
    }

    public Vector direction(){
        //return the direction of the vector
        return this.scale(1/this.magnitude());
    }

    public double cartesian(int i){
        //return the cartesian coordinate
        return coords[i];
    }

    public int length() {
        return n;
    }

    public double distanceTo(Vector that) {
        //Euclidean distance to other Vector
        if (this.length() != that.length())
            throw new IllegalArgumentException("dimensions disagree");
        return this.minus(that).magnitude();
    }


    public String toString(){
        //Override the default toString method from the inherited object
        StringBuilder s = new StringBuilder();
        s.append('(');
        for (int i = 0; i < n; i++) {
            s.append(coords[i]);
            if (i < n-1) s.append(", ");
        }
        s.append(')');
        return s.toString();
    }

    //Unit test all instance methods in main method
    public static void main(String[] args){
        //get the dimensions 'n'
        int n = Integer.parseInt(args[0]);
        double[] a = new double[n];
        double[] b = new double[n];
        //Create two similar vectors from command line arguments
        for (int i =0; i<n; i++){
            a[i] = Double.parseDouble(args[i+1]);
            b[i] = Double.parseDouble(args[i+1]);
        }
        Vector v1 = new Vector(a);
        Vector v2 = new Vector(b);
        StdOut.println("Vector V1: " + v1);
        StdOut.println("Vector v2: " + v2);
        StdOut.println("Vector v1 plus v2: " + v1.plus(v2));
        StdOut.println("Vector v1 after addition: " + v1);
        StdOut.println("Cartesian of vector v1: " + v1.cartesian(2));
        StdOut.println("V1 magnitude: " + v1.magnitude());
        StdOut.println("v1 scaled by 3: " + v1.scale(3));
        StdOut.println("v1 dot v2: " + v1.dot(v2));
    }
}
