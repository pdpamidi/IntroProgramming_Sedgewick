/**
 * Created by pruth on 3/29/2017.
 */
public class EX2_1_11 {
    public static int absol(int n){
        if (n<0) return -1;
        else if (n==0) return 0;
        else return 1;
    }

    public static int absol(double n){
        if (n<0.0) return -1;
        else if (n==0.0) return 0;
        else return 1;
    }

    public static void main(String[] tag){
        int n1 = Integer.parseInt(tag[0]);
        double n2 = Double.parseDouble(tag[0]);
        int absol1 = absol(n1);
        int absol2 = absol(n2);
        StdOut.println("Absol int type return: " + absol1);
        StdOut.println("Absol double type return: " + absol2);
    }
}
