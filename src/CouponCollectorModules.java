/**
 * Created by pruth on 3/29/2017.
 */
public class CouponCollectorModules {
    public static int getCoupon(int n){
        return (int) (Math.random()*n);
    }

    public static int collectCoupons(int n){
        boolean[] iscollected = new boolean[n];
        int count=0;
        int distinct=0;
        while (distinct<n){
            int coupon = getCoupon(n);
            count++;
            if (!iscollected[coupon]){
                iscollected[coupon] = true;
                distinct++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int count = collectCoupons(n);
        StdOut.println(" Nu12 mber of coupons collected to get " + n + " distinct coupons: " + count);
    }
}