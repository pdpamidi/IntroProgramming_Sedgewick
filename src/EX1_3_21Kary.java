import java.util.Calendar;

/**
 * Created by Pruthvi on 3/18/2017.
 */
public class EX1_3_21Kary {
    public static void main(String[] args){
        int i = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int power = 1;

        if (!((k<=16) && (k>=2)))
            System.out.println("Error: Arguments should be of type int and int between 2 & 16");

        while (power <= i/k){
            power*=k;
        }

        while (power> 0){
            if (i < power){
                System.out.print(0);
            }
            else {
                switch (i/power){
                    case 10: System.out.print("A");
                        break;
                    case 11: System.out.print("B");
                        break;
                    case 12: System.out.print("C");
                        break;
                    case 13: System.out.print("D");
                        break;
                    case 14: System.out.print("E");
                        break;
                    case 15: System.out.print("F");
                        break;
                    default: System.out.print(i/power);
                        break;
                }
                i = (int) (i%power);
            }
            power/=k;
        }
    }
}
