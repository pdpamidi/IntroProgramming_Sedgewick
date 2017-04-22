/**
 * Created by Pruthvi on 4/7/2017.
 */
public class BottomUpFibonacci {
    public static long fibonacci(int n) {
        long[] f = new long[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i=2; i<=n; i++)
            f[i] = f[i-1] + f[i-2];

        return f[n];
    }

    public static void main(String [] args){
        int n = Integer.parseInt(args[0]);
        StdOut.println(n + "th Fibonacci number " + fibonacci(n));
    }
}
