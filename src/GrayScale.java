/**
 * Created by Pruthvi on 4/9/2017.
 */

import java.awt.Color;

public class GrayScale {
    public static void main(String[] args){
        //Show images in grayscale
        Picture picture = new Picture(args[0]);
        for (int col=0; col< picture.width(); col++) {
            for (int row =0; row< picture.height(); row++) {
                Color color = picture.get(col, row);
                Color gray = Luminance.toGrey(color);
                picture.set(col, row, gray);
            }
        }
        picture.show();
    }
}
