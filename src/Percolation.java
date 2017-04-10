/**
 * Created by Pruthvi on 4/5/2017.
 */

import org.w3c.dom.DOMImplementation;

/**
 * API:
 * boolean[][] flow(boolean[][] isOpen)
 * boolean percolates(boolean[][] isOpen)
 * void show(boolean[][] isFull, boolean which)
 * boolean[][] random(int n, double p)
 */
public class Percolation {
    public static boolean[][] flow(boolean[][] isOpen){
        int n = isOpen.length;
        boolean[][] isFull = new boolean[n][n];
        for (int j=0; j<n; j++)
            isFull[0][j] = isOpen[0][j];

        for (int i=1; i<n; i++){
            for (int j=0; j<n; j++){
                isFull[i][j] = isOpen[i][j] && isFull[i-1][j];
            }
        }
        return isFull;
    }

    public static boolean percolates(boolean[][] isOpen) {
        boolean[][] isFull = flow(isOpen);
        int n = isOpen.length;
        for (int j=0; j<n; j++){
            if (isFull[n-1][j]) return true;
        }
        return false;
    }

    public static void show(boolean[][] isFull, boolean which){
        int n = isFull.length;
        StdDraw.setPenColor(9,  90, 166);
        StdDraw.setXscale(-1, n);
        StdDraw.setYscale(-1, n);
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (isFull[i][j] == which)
                    StdDraw.filledSquare(j, n-i-1, 0.5);
                else StdDraw.square(j, n-i-1, 0.5);
            }
        }
    }

    public static boolean[][] random(int n, double p) {
        boolean[][] a = new boolean[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] = StdRandom.bernoulli(p);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        boolean[][] isOpen =random(n, p);
        StdOut.println("The system size is "+ n + " by " + n + " and the probability is " + p);
        StdOut.println(" Does it percolate?:");
        StdOut.println(percolates(isOpen));
        /**StdOut.println("------------------------");
        StdArrayIO.print(isOpen);
        StdOut.println("-------------------------");
        StdArrayIO.print(flow(isOpen));**/
        //show(isOpen, true);
        show(flow(isOpen), true);

    }
}