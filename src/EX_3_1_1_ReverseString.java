/**
 * Created by Pruthvi on 4/12/2017.
 */
public class EX_3_1_1_ReverseString {
    public static String reverse(String s){
        char[] r = s.toCharArray();
        int n = s.length();
        for (int i=0; i<n/2; i++){
            char temp = r[i];
            r[i] = r[n-i-1];
            r[n-i-1] = temp;
        }
        return new String(r);
    }

    public static void main(String[] args){
        StdOut.println(reverse(args[0]));
    }
}
