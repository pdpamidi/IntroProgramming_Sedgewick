/**
 * Created by Pruthvi on 4/6/2017.
 */
public class PercolationVisualizer {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        StdDraw.enableDoubleBuffering();

        boolean[][] isOpen = PercolationRecursive.random(n, p);
        StdDraw.setPenColor(StdDraw.BLACK);
        PercolationRecursive.show(isOpen, false);

        boolean[][] isFull = PercolationRecursive.flow(isOpen);
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        PercolationRecursive.show(isFull, true);

        StdDraw.show();
    }
}
