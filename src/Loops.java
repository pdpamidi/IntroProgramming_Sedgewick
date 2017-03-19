/**
 * Created by Pruthvi on 3/18/2017.
 */
public class Loops {

    public static int twospower(int power, int n){
        while(power <= n/2){
            power = 2*power;
        }
        return power;
    }

    public static int finitesum (int sum, int n){
        for (int i=1; i<=n; i++)
            sum+=i;
        return sum;
    }

    public static int finiteproduct (int product, int n){
        for (int i=1; i<=n; i++)
            product*=i;
        return product;
    }

    public static String getRuler(String ruler, int n){
        for(int i=2; i<=n; i++) {
            ruler = ruler + " " + i + " " + ruler;
        }
            return ruler;
        }

    public static void main(String[] args){
        int product = 1, sum = 0, power = 1;
        String ruler = "1";
        int arg1 = Integer.parseInt(args[0]);
        int powers =  twospower(power, arg1);
        System.out.println(powers);
        int finalsum = finitesum(sum, arg1);
        System.out.println(finalsum);
        int finalproduct = finiteproduct(product, arg1);
        System.out.println(finalproduct);
        String finalruler = getRuler(ruler, arg1);
        System.out.println(finalruler);
    }
}

