/**
 * Created by Pruthvi on 4/30/2017.
 */

/**
 * Implementation of MergeSort on a Array of Comparable types
 */
public class Mergesort {
    public static void sort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length);
    }

    public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
        if (hi - lo <= 1) return;
        int mid = lo + (hi - lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid, hi);
        int i = lo; int j = mid;
        for (int k=lo; k< hi; k++) {
            if (i == mid) {
                aux[k] = a[j];
                j++;
            }
            else if (j == hi) {
                aux[k] = a[i];
                i++;
            }
            else if (a[i].compareTo(a[j]) < 0) {
                aux[k] = a[i];
                i++;
            }
            else {
                aux[k] = a[j];
                j++;
            }
        }


    for (int k=lo; k< hi; k++)
        a[k] = aux[k];
    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        String[] a = new String[n];
        for (int i=0; i<n; i++) {
            a[i] = args[i + 1];
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
        sort(a);
        for (int j=0; j<a.length; j++)
            StdOut.print(a[j] + " ");
    }
}