/**
 * Created by Pruthvi on 3/18/2017.
 */
public class BinaryWithTrace {
    public static void main(String[] args){
        //Pass in the int that needs to be converted into binary
        int N = Integer.parseInt(args[0]);
        int power = 1;
        //Find the maximum power of 2 that is just less than passed value
        while (power <=N/2)
            power*=2;

        //Find the descending power of 2 for the left over from the value
        while (power>0)
        {
            if (N < power)
                System.out.println(0);
            else {
                System.out.println(1);
                N-=power;
            }
            power/=2;
        }
    }
}
