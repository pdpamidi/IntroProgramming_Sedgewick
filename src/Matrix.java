/**
 * Created by pruth on 4/2/2017.
 */

/** A collection of static methods
 * for manipulating matrices
 */
public class Matrix {
    /**
     * API:
     * double dot(double[] a, double[] b)                   vector dot product
     * double[][] multiply(double[][] a, double[][] b)      matrix-matrix product
     * double[][] transpose(double[][] a)                   transpose
     * double[] multiply(double[][]a, double[]x)            matrix-vector product
     * double[] multiply(double[] x, double[][] a)          vector-matrix product
     */
    public static double dot(double[] a, double[] b){
        if (a.length != b.length) throw new RuntimeException("Illegal vector dimensions. ");
        double dotprod =0.0;
        for (int i=0; i<a.length; i++)
            dotprod += a[i]*b[i];
        return dotprod;
    }

    public static double[][] multiply(double[][] a, double[][] b){
        if (a[0].length != b.length) throw new RuntimeException(" Illegal Matrix dimensions for multiplaction. ");
        int r = a.length;
        int c = b[0].length;
        int d = a[0].length;
        double[][] matmul = new double[r][c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                for (int k=0; k<d; k++){
                    matmul[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return matmul;
    }

    public static double[][] transpose(double[][] a){
        int r = a.length;
        int c = a[0].length;
        double[][] trans = new double[c][r];
        for (int i=0; i<c; i++){
            for (int j=0; j<r; j++){
                trans[i][j] = a[j][i];
            }
        }
        return trans;
    }

    public static double[] multiply(double[][] a, double[] x){
        int r = a.length;
        int c = a[0].length;
        if (c != x.length) throw new RuntimeException("Illegal vector dimensions. ");
        double[] mularr = new double[r];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                mularr[i] += a[i][j]*x[j];
            }
        }
        return mularr;
    }

    public static double[] multiply(double[] x, double[][] a){
        int r = a.length;
        int c = a[0].length;
        if (x.length != r) throw new RuntimeException("Illegal vector dimensions. ");
        double[] mularr = new double[c];
        for (int i=0; i<c; i++){
            for (int j=0; j<r; j++){
                mularr[i] += x[j]*a[j][i];
            }
        }
        return mularr;
    }

    public static double[][] randome(int m, int n){
        double[][] arr = new double[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = StdRandom.uniform(0.0, 1.0);
            }
        }
        return arr;
    }

    public static double[][] identity(int m){
        double[][] arr = new double[m][m];
        for (int i=0; i<m; i++)
            arr[i][i] = 1.0;
        return arr;
    }

    public static void main(String[] args) {
        StdOut.println("D");
        StdOut.println("--------------------");
        double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
        StdArrayIO.print(d);
        StdOut.println();

        StdOut.println("I");
        StdOut.println("--------------------");
        double[][] c = Matrix.identity(5);
        StdArrayIO.print(c);
        StdOut.println();

        StdOut.println("A");
        StdOut.println("--------------------");
        double[][] a = Matrix.randome(5, 5);
        StdArrayIO.print(a);
        StdOut.println();

        StdOut.println("A^T");
        StdOut.println("--------------------");
        double[][] b = Matrix.transpose(a);
        StdArrayIO.print(b);
        StdOut.println();


        StdOut.println("A * A^T");
        StdOut.println("--------------------");
        double[][] f = Matrix.multiply(a, b);
        StdArrayIO.print(f);
        StdOut.println();
    }
}