/**
 * Created by Pruthvi on 3/18/2017.
 */
public class HarmonicNumber {
    public static void main(String[] args){
        double sum = 0.0;
        int n = Integer.parseInt(args[0]);
        for (int i=1; i<=n; i++)
            sum+=1.0/i;
        System.out.println(sum);
    }
}
