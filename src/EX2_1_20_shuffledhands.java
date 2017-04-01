/**
 * Created by pruth on 3/30/2017.
 */
public class EX2_1_20_shuffledhands {
    public static String[] handserved(String[] shuffledcards){
        String[] handnow = new String[5];
        for (int i=0; i<5; i++){
            handnow[i] = shuffledcards[i];
        }
        return handnow;
    }
}
