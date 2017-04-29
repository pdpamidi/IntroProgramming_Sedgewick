/**
 * Created by Pruthvi on 4/28/2017.
 */

/**
 * Data Type to maintain statics of real numbers
 * One Pass implementation
 * API:
 * void add(double data)            ---     add data point
 * int datacount()                  ---     return the number of data points
 * double mean()                    ---     return the mean of the data
 * double standard_deviation()      ---     return the standard deviation
 * double variance()                ---     return the variance of the data
 */

public class EX_33_19_Statistics {
    //Instance variables
    private int points;
    private double sum, squaressum;
    //Constructor
    public EX_33_19_Statistics(){
        points =0;
        sum = 0;
        squaressum= 0;
    }
    //Instance methods
    public void add(double data){
        points+=1;
        sum+=data;
        squaressum+=(data*data);
    }

    public int datacount(){
        return points;
    }

    public double mean(){
        //return the mean of the data
        return sum/points;
    }

    public double variance(){
        //return the variance of the data
        return ((points*squaressum)-(sum*sum))/(points*(points-1));
    }

    public double standard_deviation(){
        //return the standard deviation of the data
        return Math.sqrt(variance());
    }

    //unit test client
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        EX_33_19_Statistics dataset = new EX_33_19_Statistics();
        for (int i=0; i<n; i++){
            double data = Double.parseDouble(args[i+1]);
            dataset.add(data);
        }

        StdOut.println("Mean of the data : " + dataset.mean());
        StdOut.println("Sample stddev: " + dataset.standard_deviation());
        StdOut.println("Sample variance : " + dataset.variance());

        double lo = dataset.mean() - 1.96 * dataset.standard_deviation();
        double hi = dataset.mean() + 1.96 * dataset.standard_deviation();
        StdOut.print("95% approximate confidence interval: ");
        StdOut.println("[ " + lo + ", " + hi + " ]");
    }
}