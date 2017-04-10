/**
 * Created by Pruthvi on 4/6/2017.
 */
public class PercolationProbability {
    public static double estimate(int n, double p, int trials){
        int count=0;
        for (int i=0; i<trials; i++){
            boolean[][] isOpen = Percolation.random(n, p);
            if (Percolation.percolates(isOpen)) count++;
        }
        return (double) count/trials;
    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        int trials = Integer.parseInt(args[2]);
        double q = estimate(n, p , trials);
        StdOut.println(q);
    }
}
