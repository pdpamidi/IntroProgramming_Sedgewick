/**
 * Created by Pruthvi on 4/7/2017.
 */
public class EX_2_3_17_Permutations {

    public static void swap(char[] str, int i, int j){
        char temp;
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void permutations(String s){
        int n = s.length();
        char[] c = new char[n];
        for (int i = 0; i<n; i++)
            c[i] = s.charAt(i);
        permutations(c, n);
    }

    public static void permutations(char[] s, int n){
        if (n == 1) {
            for (int i=0; i<s.length; i++){
                StdOut.print(s[i] + " ");
            }
            StdOut.println();
            return;
        }
        for (int i=0; i<n; i++){
            swap(s, i, n-1);
            permutations(s, n-1);
            swap(s, i, n-1);
        }
    }

    public  static void perm1(String s) { perm1("", s); }
    private static void perm1(String prefix, String s) {
        int n = s.length();
        if (n == 0) StdOut.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
        }
    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String selected = alphabets.substring(0, n);
        StdOut.println(" Selected: " + selected);
        //permutations(selected);
        perm1(selected);
    }
}