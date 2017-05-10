/**
 * Created by Pruthvi on 5/8/2017.
 */

/**
 * Implementation of MergeSort on a Array of Comparable types
 * Using nested for loops for comparison on performance with the book version
 */
public class Mergesort2 {
    public static void sort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length);
    }

    public static void sort(Comparable[] arr, Comparable[] aux, int l, int r){
        if (r - l <= 1) return;
        int mid = l + (r - l) /2;
        sort(arr, aux, l, mid);
        sort(arr, aux, mid, r);
        int i = l;
        int j = mid;
        for (int k =l; k<r; k++){
            if(i < mid && j < r){
                if (arr[i].compareTo(arr[j]) < 0)    aux[k] = arr[i++];
                else    aux[k] = arr[j++];
            }
            else{
                if (i==mid) aux[k] = arr[j++];
                else if (j==r) aux[k] = arr[i++];
            }
        }
        for (int x=l; x< r; x++)
            arr[x] = aux[x];
    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        String[] a = new String[n];
        for (int i=0; i<n; i++) {
            a[i] = args[i + 1];
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
        StdOut.println();
        sort(a);
        for (int j=0; j<a.length; j++)
            StdOut.print(a[j] + " ");
    }
}