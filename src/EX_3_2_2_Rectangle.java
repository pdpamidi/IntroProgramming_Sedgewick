/**
 * Created by pruth on 4/21/2017.
 */

/**
 * Rectangle client for EX_3_2_1_Rectangle taht takes three command line arguments n, min and max.
 * Generates n random rectangles whose width and height are uniformly distributed between min and max
 * Draw on standard drawing and print their average area and perimeter
 */
public class EX_3_2_2_Rectangle {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[1]);
        int max = Integer.parseInt(args[2]);
        double area=0, perimeter=0;
        EX_3_2_1_Rectangle[] rectangle = new EX_3_2_1_Rectangle[n];
        for (int i =0; i<n; i++) {
            rectangle[i] = new EX_3_2_1_Rectangle(0, 0, StdRandom.uniform(min, max), StdRandom.uniform(min, max));
            area += rectangle[i].area();
            perimeter+= rectangle[i].perimeter();
            rectangle[i].draw(rectangle[i]);
            StdOut.println(i + " "  + rectangle[i].area());
            StdOut.println(i + " " + rectangle[i].perimeter());
        }
        StdOut.println("Average area: " + area/n);
        StdOut.println("Average perimeter: " + perimeter/n);
    }
}
