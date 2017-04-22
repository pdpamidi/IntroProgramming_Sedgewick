/**
 * Created by Pruthvi on 4/17/2017.
 */

/**
 * Uses 2 instance variables - freq[], max
 * add data points and draw are instance methods
 */
public class Histogram {
    private final double[] freq;
    private double max;

    public Histogram(int n){
        freq = new double[n];
    }

    public void addDatapoint(int n){
        freq[n]++;
        if (freq[n] > max) max = freq[n];
    }

    public void draw(){
        StdDraw.setYscale(0, max);
        StdStats.plotBars(freq);
    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        Histogram hist = new Histogram(n);
        StdDraw.setCanvasSize(400, 250);
        for (int i=0; i<trials; i++){
            hist.addDatapoint(StdRandom.uniform(0, n));
        }
        hist.draw();
    }
}
