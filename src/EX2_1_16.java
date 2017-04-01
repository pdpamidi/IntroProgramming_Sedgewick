/**
 * Created by pruth on 3/29/2017.
 */
public class EX2_1_16 {
    //Find the minimum of the passed array
    public static double min(double[] arr){
        double minval=Double.POSITIVE_INFINITY;
        for (int i=0; i<arr.length; i++){
            if (arr[i] < minval)
                minval=arr[i];
        }
        return minval;
    }

    //Find the maximum in the array
    public static double max(double[] arr){
        double maxval = Double.NEGATIVE_INFINITY;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > maxval)
                maxval = arr[i];
        }
        return maxval;
    }
    //Scale takes double array and scales the array
    public static double[] scale(double[] arr){
        double minval = min(arr);
        double maxval = max(arr);
        double diff;
        if (minval != maxval)   diff = Math.abs(maxval-minval);
        else {
            System.out.println(" The minimum and maximum are the same and cann't scale");
            return arr;
        }

        for (int i=0; i<arr.length; i++){
            double adjarr = arr[i] - minval;
            arr[i] = adjarr/diff;
        }

        return arr;
    }

    public static void main(String [] args){
        int length = Integer.parseInt(args[0]);
        double[] arr = new double[length];
        System.out.println("Orignal Random array created");
        for (int i=0; i<length; i++){
            arr[i] = (Math.random() * length);
            System.out.printf("%.2f " ,arr[i]);
        }

        StdOut.println();
        System.out.println("Scaled array: ");
        for (int i=0; i<length; i++)
            System.out.printf("%.2f ", scale(arr)[i]);
    }
}
