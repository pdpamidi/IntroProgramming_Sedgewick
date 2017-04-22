import java.awt.*;

/**
 * Created by Pruthvi on 4/16/2017.
 */
public class EX_3_1_33_ColorStudy {
    //Get the size of squares from the argument prompt
    //Get the
    public static void main(String [] args){
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(-1, 18);
        StdDraw.setYscale(-1, 18);
        int color1R = StdDraw.BOOK_BLUE.getRed();
        int color1G = StdDraw.BOOK_BLUE.getGreen();
        int color1B = StdDraw.BOOK_BLUE.getBlue();
        int color2R = StdDraw.BLACK.getRed();
        int color2G = StdDraw.BLACK.getGreen();
        int color2B = StdDraw.BLACK.getBlue();
        float step2 = 255/n;
        AlbersSquares squares = new AlbersSquares();
        for(int i=1; i<=n; i++){
            int color2RD = color2R;
            int color2GD = color2G;
            int color2BD = color2B;
            for (int j=1; j<=n; j++){
                StdDraw.setPenColor(color1R, color1G, color1B);
                StdDraw.filledSquare(i, j, .6);
                StdDraw.setPenColor(color2RD, color2GD, color2BD);
                StdDraw.filledSquare(i, j, .3);
                if (color2RD <=255-step2)
                    color2RD+=step2;
                if (color2GD <=255-step2)
                    color2GD+=step2;
                if (color2BD <= 255-step2)
                    color2BD+=step2;
            }
            if (color1R <=255-step2)
                color1R+=step2;
            if (color1G <=255-step2)
                color1G+=step2;
            if (color1B <= 255-step2)
                color1B+=step2;
        }
    }
}