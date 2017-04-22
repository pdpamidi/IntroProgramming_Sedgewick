import java.awt.*;

/**
 * Created by Pruthvi on 4/12/2017.
 */
public class FlipX {
    public static void main(String[] args){
        Picture pic = new Picture(args[0]);
        int height = pic.height();
        int width = pic.width();
        pic.show();
        for (int y=0; y<height; y++){
            for (int x=0; x<width/2; x++){
                Color c1 = pic.get(x, y);
                Color c2 = pic.get(width-x-1, y);
                pic.set(x, y, c2);
                pic.set(width-x-1, y, c1);
            }
        }
        pic.show();
    }
}