/**
 * Created by pruth on 4/23/2017.
 */

/**
 * Sketch client that provides the information that is needed
 * to find the two most similar documents from a set of documents
 */
public class CompareDocuments {
    public static void main(String[] args){
        // k - length of n-grams, d - dimensions, n - number of documents, a[] - the sketches
        int k = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        String[] filenames = new String[3];
        filenames[0] = args[2];
        filenames[1] = args[3];
        filenames[2] = args[4];
        StdIn.readAllStrings();
        int n = filenames.length;
        Sketch[] a = new Sketch[n];
        for (int i=0; i<n; i++){
            a[i] = new Sketch(new In(filenames[i]).readAll(), k, d);
        }
        StdOut.print(" ");
        for (int j=0; j<n; j++){
            StdOut.printf("%8.4s", filenames[j]);
        }

        StdOut.println();
        for (int i=0; i<n; i++){
            StdOut.print(filenames[i]);
            for (int j=0; j<n; j++)
                StdOut.print(a[i].similarTo(a[j]));
            StdOut.println();
        }
    }
}