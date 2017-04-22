/**
 * Created by Pruthvi on 4/6/2017.
 */
public class PercolationRecursive {
    public static boolean[][] flow(boolean[][] isOpen){
        int n = isOpen.length;
        boolean[][] isFull= new boolean[n][n];
        for (int j=0; j<n; j++)
            flow(isOpen, isFull, 0, j);
        return isFull;
    }

    public static void flow(boolean[][] isOpen, boolean[][] isFull, int i, int j){
        int n = isOpen.length;
        if (i<0 || i>=n) return;
        if (j<0 || j>=n) return;
        if (!isOpen[i][j]) return;
        if (isFull[i][j]) return;
        isFull[i][j] = true;
        flow(isOpen, isFull, i-1, j);
        flow(isOpen, isFull, i+1, j);
        flow(isOpen, isFull, i, j-1);
        flow(isOpen, isFull, i, j+1);
    }

    public static boolean percolates(boolean[][] isOpen) {
        int n = isOpen.length;
        boolean[][] isFull = flow(isOpen);
        for (int j=0; j<n; j++){
            if (isFull[n-1][j]) return true;
        }
        return false;
    }

    public static boolean[][] random(int n, double p){
        boolean[][] isOpen = new boolean[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++)
                isOpen[i][j] = StdRandom.bernoulli(p);
        }
        return isOpen;
    }

    public static void show(boolean[][] isFull, boolean which){
        int n = isFull.length;
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(-1, n);
        StdDraw.setYscale(-1, n);
        for (int i = 0; i<n; i++){
            for (int j=0; j<n; j++){
                if (isFull[i][j] == which)
                    StdDraw.filledSquare(j, n-i-1, 0.5);
                else
                    StdDraw.square(j, n-i-1, 0.5);
            }
        }
    }
}
