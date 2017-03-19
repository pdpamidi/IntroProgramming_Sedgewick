/**
 * Created by Pruthvi on 3/18/2017.
 */
public class Binary {
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        int power = 1;
        //The maximum power of N
        while (power <= N/2)
            power*=2;

        //Find other powers in descending order
        while (power>0){
            if (N < power){
                System.out.print(0);
            }
            else {
                System.out.print(1);
                N-=power;
            }
            power/=2;
        }
    }
}
