/**
 * Created by Pruthvi on 4/23/2017.
 */

/**
 * Data mining of text documents
 * Sketch uses vector to calculate n-gram frequency of the text file and compares the similarity between
 * two text documents based on content
 * API for sketch:
 * Sketch(String text, int k, int d)            -- constructor
 * double similarTo(Sketch other)               -- Similarity measure between this sketch and other
 * String toString()                            -- String representation
 */
public class Sketch {
    //Private Instance variables
    private final Vector profile;

    //Constructor for sketch
    public Sketch(String text, int k, int d){
        // text - text name, k - number of k-grams, d - dimensionality of the vector
        int n = text.length();
        double[] freq = new double[d];
        for (int i=0; i<n-k; i++){          // Go to length of text - last k-gram,
            String kgram = text.substring(i, i+k);  // calculate the hash and generate hash frequencies
            int hash = kgram.hashCode();
            freq[Math.abs(hash%d)] += 1;
        }
        Vector vector = new Vector(freq);   //create a new vector for the hash frequencies
        profile = vector.direction();       //create a directionality i.e divided by magnitude to normalize
    }

    //Instance method to compare similarity between methods
    public double similarTo(Sketch that){
        return profile.dot(that.profile);
    }

    public String toString(){
        return " " + profile;
    }

    //Unit test the functionality
    public static void main(String[] args){
        int k = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        String text = args[2];
        Sketch sketch = new Sketch(text, k, d);
        StdOut.println(sketch);
    }
}