/**
 * Created by Pruthvi on 3/19/2017.
 */
public class EX1_3_23Gambler1 {
    public static void main(String[] args){
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int bet = 0;
        int wins = 0;
        for (int i=0; i<trials; i++){
            int cash = stake;
            for (; (cash>0 && cash<goal); bet++){
                if (Math.random() < 0.5) cash++;
                else cash--;
                int stars=cash;
                while (stars>0){
                    System.out.print("* ");
                    stars--;
                }
                System.out.println("Trial# " + i);
            }
            if (cash == goal) wins++;
        }
        System.out.println(100*wins/trials + "% wins");
        System.out.println("Avg # of bets: "+ bet/trials);
    }
}
