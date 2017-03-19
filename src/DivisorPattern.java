/**
 * Created by Pruthvi on 3/18/2017.
 */
public class DivisorPattern {
    public static void main(String[] args){
        int n =  Integer.parseInt(args[0]);
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
                if ((i%j ==0) || (j%i ==0))
                {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}
