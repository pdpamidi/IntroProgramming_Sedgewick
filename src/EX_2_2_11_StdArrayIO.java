/**
 * Created by pruth on 4/2/2017.
 */
public class EX_2_2_11_StdArrayIO {
    private EX_2_2_11_StdArrayIO(){ }

    public static double[] readDouble1D(){
        int n = StdIn.readInt();
        double[] arr = new double[n];
        for (int i=0; i<n; i++){
            arr[i] = StdIn.readDouble();
        }
        return arr;
    }

    public static double[][] readDouble2D(){
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        double[][] arr = new double[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = StdIn.readDouble();
            }
        }
        return arr;
    }

    public static void print(double[] a){
        for (int i=0; i<a.length; i++)
            StdOut.printf("%9.5f ", a[i]);
    }

    public static void print(double[][] a){
        int c = a[0].length;
        int r = a.length;
        StdOut.println(r + " by " + c + " matrix");
        for (int i=0; i<r; i++)
        {
            StdOut.println();
            for (int j=0; j<c; j++)
                StdOut.printf(" %9.5f ", a[i][j]);
        }
    }

    public static int[] readInt1D(){
        int n = StdIn.readInt();
        int[] arr = new int[n];
        for (int i=0; i< n; i++)
            arr[i] = StdIn.readInt();
        return arr;
    }

    public static int[][] readInt2D() {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        int [][] arr = new int[m][n];
        for (int i=0; i < m; i++)
            for (int j=0; j< n; j++)
                arr[i][j] = StdIn.readInt();

        return arr;
    }

    public static void print(int[] a){
        for (int i=0; i< a.length; i++)
            StdOut.printf("%9d ", a[i]);
    }

    public static void print(int[][] a){
        int m = a.length;
        int n = a[0].length;
        StdOut.println(m + " by " + n + " matrix");
        for (int i=0; i< m; i++) {
            StdOut.println();
            for (int j=0; j<n; j++) {
                StdOut.printf("%9d ", a[i][j]);
            }
        }
    }

    public static boolean[] readBoolean1D(){
        int n = StdIn.readInt();
        boolean[] arr = new boolean[n];
        for (int i=0; i<n; i++) {
            arr[i] = StdIn.readBoolean();
        }

        return arr;
    }

    public static boolean[][] readBoolean2D(){
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        boolean[][] arr = new boolean[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = StdIn.readBoolean();
            }
        }
        return arr;
    }

    public static void print(boolean[] a){
        for (int i =0; i< a.length; i++)
        {
            if (a[i]) StdOut.printf("1 ");
            else StdOut.printf("0 ");
        }
    }

    public static void print(boolean[][] a){
        int m = a.length;
        int n = a[0].length;
        StdOut.println(m + " by " + n + " matrix");
        for (int i=0; i<m; i++){
            StdOut.println();
            for (int j=0; j<n; j++)
            {
                if (a[i][j]) StdOut.printf("1 ");
                else StdOut.printf("0 ");
            }
        }
    }
/**
 * Unit test each of the methods
 */
    public static void main(String[] args){
        double[] a = EX_2_2_11_StdArrayIO.readDouble1D();
        EX_2_2_11_StdArrayIO.print(a);
        StdOut.println();

        double[][] b = EX_2_2_11_StdArrayIO.readDouble2D();
        EX_2_2_11_StdArrayIO.print(b);
        StdOut.println();

        int[] c = EX_2_2_11_StdArrayIO.readInt1D();
        EX_2_2_11_StdArrayIO.print(c);
        StdOut.println();

        int[][] d = EX_2_2_11_StdArrayIO.readInt2D();
        EX_2_2_11_StdArrayIO.print(d);
        StdOut.println();

        boolean[] e = EX_2_2_11_StdArrayIO.readBoolean1D();
        EX_2_2_11_StdArrayIO.print(e);
        StdOut.println();

        boolean[][] f = EX_2_2_11_StdArrayIO.readBoolean2D();
        EX_2_2_11_StdArrayIO.print(f);
        StdOut.println();
    }

}
