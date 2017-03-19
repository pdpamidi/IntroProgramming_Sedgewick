/**
 * Created by Pruthvi on 3/18/2017.
 */
public class Factors {
    //Implemented on Own so basic case
    //print and remove from n all factors of factor
    //
    public static void main(String[] args){
        long N = Long.parseLong(args[0]);
        for (long factor=2; factor<=N/factor; factor++){
            while (N%factor == 0){
                N/=factor;
                System.out.print(factor + "  ");
            }
        }
        if (N>1)
            System.out.print(N);
        System.out.println();
    }
}
