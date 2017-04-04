/**
 * Created by pruth on 4/2/2017.
 */
public class EX_2_1_33_Benford {
    public static int leading(int n) {
        while (n > 9){
            n = n/10;
        }
        return n;
    }

    public static double[] avg(int[] arr, int n){
        double [] avgarr = new double[arr.length];
        for (int i=0; i< arr.length; i++){
            avgarr[i] = 100*arr[i]/n;
        }
        return avgarr;
    }

    public static void main(String [] args) {
        int [] leadingcount = new int[10];
        int z= Integer.parseInt(args[0]);
        int n = 0;
        while (n<z){
            int k = StdIn.readInt();
            int leadingdigit = leading(k);
            leadingcount[leadingdigit]++;
            n++;
        }

        StdOut.println("Digit       Frequency");
        for (int i=0; i<10; i++) {
            StdOut.printf("%d       %.2f", leadingcount[i], avg(leadingcount, n)[i]);
        }
    }
}