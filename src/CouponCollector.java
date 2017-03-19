/**
 * Created by Pruthvi on 3/19/2017.
 */
public class CouponCollector {
    public static void main(String[] args){
        //Pass in the length of coupons as the argument
        int N = Integer.parseInt(args[0]);
        boolean[] iscollected = new boolean[N];
        int distinct = 0;
        int count = 0;
        for (int i=0; i<N; i++)
            iscollected[i]=false;

        while (distinct < N){
            int r = (int) (Math.random() * N);
            if (!iscollected[r]){
                distinct++;
                iscollected[r]=true;
            }
            count++;
        }
        System.out.println(count);
    }
}