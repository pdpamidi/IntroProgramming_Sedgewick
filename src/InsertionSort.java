/**
 * Created by Pruthvi on 4/30/2017.
 */

/**
 * Implementation of classic Insertion sort on an array of Comparable
 * Use Comparable interface to make sure the data type have compareTo()
 * This method gives total order
 */
public class InsertionSort {
    //Sort the Comparable array
    public static void sort(Comparable[] a){
        //sort a[] into increasing order
        int n = a.length;
        for (int i=1; i<n; i++)
            for (int j=i; j>0; j--)         //start at i and proceed to beginning checking the location to insert
                if (a[j].compareTo(a[j-1]) < 0)     //compareTo is less than 0 when a[j-1] is greater than a[j]
                    exchange(a, j-1, j);        //exchange the values at locations j-1, j
                else break;
    }

    //Static method to exchange the Comparable types at i and j positions
    public static void exchange(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //read strings from standard input and sort them
    public static void main(String[] args){
        In in = new In(args[0]);
        String[] a = in.readAllStrings();
        for (int i=0; i<a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
        sort(a);
        for (int i=0; i<a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }
}