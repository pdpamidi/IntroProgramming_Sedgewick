/**
 * Created by Pruthvi on 4/5/2017.
 */

/** API:
 * boolean [][] flow(boolean[][] isOpen)
 * boolean percolates(boolean[][] isOpen)
 * void show(boolean[][] a, boolean which)
 * boolean[][] random(int n, double p)
 *
 */
public class Percolation {
    public static boolean[][] flow(boolean[][] isOpen) {
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
        for (int i=0; i<n; i++){
            if (isFull[n-1][i]) return true;
        }
        return false;
    }

    public static void main(String [] args) {
        boolean[][] isOpen = StdArrayIO.readBoolean2D();
        StdArrayIO.print(flow(isOpen));
        StdOut.println(percolates(isOpen));
    }
}
