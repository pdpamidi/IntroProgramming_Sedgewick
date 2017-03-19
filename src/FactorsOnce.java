/**
 * Created by Pruthvi on 3/19/2017.
 */
public class FactorsOnce {
    public static void main(String[] args){
        long N = Long.parseLong(args[0]);
        for (long factors=2; factors<=N/factors; factors++){
            boolean seen = false;
            while (N%factors==0){
                N/=factors;
                if (!seen){
                    System.out.print( factors + " ");
                    seen=true;
                }
            }
        }
        if (N>1)
            System.out.print(N);
        System.out.println();
    }
}
