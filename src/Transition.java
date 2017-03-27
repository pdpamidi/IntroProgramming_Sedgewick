/**
 * Created by pruth on 3/26/2017.
 */
public class Transition {
    public static void main(String[] args){
        int links = StdIn.readInt();
        int[][] counts = new int[links][links];
        int[] outDegrees = new int[links];
        while (!StdIn.isEmpty()){
            int row = StdIn.readInt();
            int column = StdIn.readInt();
            counts[row][column]+=1;
            outDegrees[row]++;
        }
        StdOut.println(links + " by " + links);
        for (int i=0; i< links; i++){
            for (int j=0; j<links; j++){
                double p = (0.9*counts[i][j]/outDegrees[i]) + (0.1/links);
                StdOut.printf("%8.5f", p);
            }
            StdOut.println();
        }
    }
}
