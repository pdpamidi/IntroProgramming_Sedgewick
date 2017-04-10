/**
 * Created by Pruthvi on 4/9/2017.
 */
public class Scale {
    public static void scale(int w, int h, Picture source, Picture target){
        for (int colT=0; colT<w; colT++){
            for (int rowT=0; rowT<h; rowT++){
                int colS = colT*source.width()/w;
                int rowS = rowT*source.height()/h;
                target.set(colT, rowT, source.get(colS, rowS));
            }
        }
    }

    public static void main(String[] args){
        int w = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        Picture source = new Picture(args[2]);
        Picture target = new Picture(w, h);
        scale(w,h,source,target);
        source.show();
        target.show();
    }
}