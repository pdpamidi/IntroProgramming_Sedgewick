import java.awt.Color;
/**
 * Created by Pruthvi on 4/4/2017.
 */
public class EX_2_2_web_2 {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        Color green = new Color(0, 114, 0);      // See Section 3.1
        StdDraw.setPenColor(green);

        // apply the update rules
        double x = 0.5;
        double y = 0.0;
        for (int i = 0; i < n; i++) {
            double tempx, tempy;
            double r = StdRandom.uniform(0.0, 1.0);

            if (r <= 0.02)  {
                tempx = 0.5;
                tempy = 0.27 * y;
            }
            else if (r <= 0.17) {
                tempx = -0.139 * x + 0.263 * y + 0.5700;
                tempy =  0.246 * x + 0.224 * y - 0.0360;
            }
            else if (r <= 0.30) {
                tempx =  0.170 * x - 0.215 * y + 0.4080;
                tempy =  0.222 * x + 0.176 * y + 0.0893;
            }
            else {
                tempx =  0.781 * x + 0.034 * y + 0.1075;
                tempy = -0.032 * x + 0.739 * y + 0.2700;
            }

            x = tempx;
            y = tempy;
            StdDraw.point(x, y);
        }
    }

}
