/**
 * Created by pruth on 4/1/2017.
 */
public class FibonacciRecursive {
    public static long fibonacci(int n, long [] fib){
        if (n==0) return 0;
        if (n==1) return 1;
        if (fib[n]>0) return fib[n];
        fib[n] = fibonacci(n-1, fib) + fibonacci(n-2, fib);
        return fib[n];
    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        long [] fib = new long[n+1];
        long fibn = fibonacci(n, fib);
        StdOut.println("The fibonacci number " + n + " is " + fibn);
    }
}