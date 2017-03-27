/**
 * Created by pruth on 3/25/2017.
 */
public class SamplingWOReplacement {
    //Draw a random sample of m integers from a set of n integers
    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int [] permut = new int[n];

        //Initialize perm
        for (int i=0; i<n; i++){
            permut[i]=i;
        }

        for (int j=0; j<m; j++){
            int r = (int) (Math.random() * (n-1));
            int temp = permut[r];
            permut[r]=permut[j];
            permut[j]=temp;
        }

        for (int k=0; k<m; k++){
            System.out.print(permut[k]+ " ");
        }
    }
}
