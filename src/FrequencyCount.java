/**
 * Created by Pruthvi on 5/8/2017.
 */

import org.omg.CORBA.INTERNAL;

/**
 * Client for Counter and sorting
 * Sorts the words on standard input, uses the sorted list to count the frequency
 * of occurrence of each, and then sorts the frequencies.
 */

public class FrequencyCount {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        String[] words = new String[n];
        for (int i=0; i<n; i++){
          words[i] = args[i+1];
        }

        Counter[] zipf = new Counter[words.length];
        Mergesort.sort(words);
        int m=0;
        for (int i =0; i<words.length-1; i++){
            if (i==0 || words[i].compareTo(words[i-1]) != 0)
                zipf[m++] = new Counter(words[i], words.length);
            zipf[m-1].increment();
        }

        Merge.sort(zipf, 0, m);
        for (int j=0; j < m; j++)
            StdOut.println(zipf[j]);
    }
}