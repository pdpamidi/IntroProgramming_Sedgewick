/**
 * Created by Pruthvi on 3/18/2017.
 */
public class GamblerEnhanced {
    public static void main(String[] args){
        //Pass in [Stake, goal, betamt, trials]
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int betamt = Integer.parseInt(args[2]);
        int trials = Integer.parseInt(args[3]);
        int bet =0; int wins = 0;
        for (int i=0; i<trials; i++){
            int cash = stake;
            while (cash>0 && cash<goal){
                //Simulate one bet at a time
                bet++;
                if (Math.random() <0.5) cash+=betamt;
                else cash-=betamt;
            }
            if (cash == goal) wins++;

        }
        System.out.println(100*wins/trials + "% wins");
        System.out.println("Avg # bets: " + bet/trials);
    }
}
