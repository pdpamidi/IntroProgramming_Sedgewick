/**
 * Created by pruth on 3/29/2017.
 */
public class ReverseArray {
    public static String[] reverse(String[] arr){
        String [] newarr = new String[arr.length];
        for (int i=0; i<arr.length; i++){
            newarr[i] = arr[(arr.length-i-1)];
        }
        return newarr;
    }

    public static String[] reverseInplace(String[] arr){
        for (int i=0; i<arr.length; i++){
            String temp = arr[i];
            arr[i] = arr[(arr.length-i-1)];
            arr[(arr.length-i-1)] = arr[i];
        }
        return arr;
    }

    public static void main(String[] args){
        String [] arr = new String[args.length];
        StdOut.println(" String Array before flipping: ");
        for (int i=0; i<args.length; i++){
            arr[i] = args[i];
            StdOut.print(arr[i] + " ");
        }

        String [] afterarr = reverse(arr);

        StdOut.println();
        StdOut.println(" New String array after calling reverse: ");
        for (int i=0; i<args.length; i++){
            StdOut.print(afterarr[i] + " ");
        }

        StdOut.println();
        StdOut.println(" String Array after calling reverse in place: ");
        for (int i=0; i<args.length; i++) {
            StdOut.print(reverseInplace(arr)[i]+ " ");
        }


    }
}
