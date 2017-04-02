/**
 * Created by pruth on 4/2/2017.
 */
public class Ex_2_2_15_SichermanDice_answer {
        public static void main(String[] args)
        {
            int T = Integer.parseInt(args[0]);

            double[] p = new double[6];

            for (int i = 0; i < 6; i++)
                p[i] = 1.0 / 6;

            int[] dieA = { 1, 3, 4, 5, 6, 8 };
            int[] dieB = { 1, 2, 2, 3, 3, 4 };

            int[] sum = new int[11];
            double[] avg = new double[11];

            for (int t = 0; t < T; t++)
                sum[dieA[StdRandom.discrete(p)] + dieB[StdRandom.discrete(p)] - 2]++;

            for (int i = 0; i < 11; i++)
                avg[i] = (double) sum[i] / T;

            StdStats.plotBars(avg);
        }
}
