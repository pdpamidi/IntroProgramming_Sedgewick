/**
 * Created by pruth on 4/1/2017.
 */
public class Htree {
    public static void draw(int n, double x, double y, double size){
        if (n==0) return;
        double x0 = x-size/2, x1 = x+size/2;
        double y0 = y-size/2, y1 = y+size/2;
        draw(n-1, x0, y0, size/2);
        draw(n-1, x1, y0, size/2);
        draw(n-1, x0, y1, size/2);
        draw(n-1, x1, y1, size/2);
        StdDraw.line(x0, y0, x0, y1);
        StdDraw.line(x0, y, x1, y);
        StdDraw.line(x1, y0, x1, y1);

    }

    public static void main(String [] args){
        int n = Integer.parseInt(args[0]);
        double x= Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double size = Double.parseDouble(args[3]);
        draw(n, x, y, size);
    }
}
