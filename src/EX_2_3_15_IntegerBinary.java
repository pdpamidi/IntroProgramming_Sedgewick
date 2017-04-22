/**
 * Created by Pruthvi on 4/7/2017.
 */
public class EX_2_3_15_IntegerBinary {
    public static void recursivebinary( int n){
        if (n==0) return;
        recursivebinary(n/2);
        StdOut.print(n%2 + " ");
    }

    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        recursivebinary(m);
    }
}
