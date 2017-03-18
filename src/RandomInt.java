/**
 * Created by Pruthvi on 3/17/2017.
 */
public class RandomInt {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double r = Math.random();
        int value = (int) (n*r);
        System.out.println(value);
        //int value2 = (int)n*r;
    }
}
