/**
 * Created by Pruthvi on 4/30/2017.
 */

/**
 * Implementation of Binary Search on a sorted array
 * search() method returns the index of a string key in a sorted array
 * (or -1 if key is not in hte array)
 * Test client is an exception filter that reads a sorted whitelist
 * from file and prints the words that are not in the whitelist
 */
public class BinarySearch {

    //static method search that calls overloaded search
    public static int search(String key, String[] a){
        return search(key, a, 0, a.length);
    }

    //overload static method search
    public static int search(String key, String[] a, int lo, int hi){
        if (hi <= lo) return -1;
        int mid = lo + (hi - lo)/2;
        if (a[mid].compareTo(key) > 0 ) return search(key, a, lo, mid);
        else if (a[mid].compareTo(key) < 0) return search(key, a, mid+1, hi);
        else return mid;
    }

    //Test client that reads a file and
    public static void main(String[] args){
        In in = new In(args[0]);
        String[] a = in.readAllStrings();
        String key = args[1];
        if (search(key, a) < 0) StdOut.println(key);
    }
}
