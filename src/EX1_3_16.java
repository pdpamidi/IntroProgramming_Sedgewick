/**
 * Created by Pruthvi on 3/18/2017.
 */
public class EX1_3_16 {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        long twopow=1;
        for (int i=1; i<=n; i++)
        {
            twopow*=2;
            System.out.print(twopow + " ");
        }
    }
}
