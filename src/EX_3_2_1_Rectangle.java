/**
 * Created by pruth on 4/21/2017.
 */


/**
 * Data Type Implementation for axis-aligned rectangles
 * API:
 * public Rectangle(double x0, double y0, double w, double h)
 * public double area()                                         -- Area of the rectangle
 * public double perimeter()                                    -- Does the rectangle compute perimeter
 * public boolean intersects(Rectangle b)                       -- Does the rectangle intersects b
 * public boolean contains(Rectangle b)                         -- Is b inside this rectangle
 * public void draw(Rectangle b)                                -- draw rectangle on standard drawing
 */
public class EX_3_2_1_Rectangle {
    private final double x, y;                      //center of the rectangle
    private final double width, height;             //width and height of the rectangle
    // Constructor for building rectangle object at x,y as center of the rectangle
    public EX_3_2_1_Rectangle(double x0, double y0, double w, double h){
        x = x0;
        y = y0;
        width = w;
        height = h;
    }

    public double area(){
        // calculate and return the area of the rectangle
        return width*height;
    }

    public double perimeter(){
        //calculate and return the perimeter of the rectangle
        return 2*(width+height);
    }

    public boolean instersects(EX_3_2_1_Rectangle b){
        //Check if any one of the four points of the rectangle b lies in the current rectangle and return true
        if (((x-width/2) >=(b.x-b.width/2)) | ((x+width/2) >= (b.x+b.width/2))
                | ((y-height/2) >= (b.y-b.height/2)) | ((y+height/2) >= (b.y+b.height/2)))
            return true;
        else return false;
    }

    public boolean contains(EX_3_2_1_Rectangle b){
        //Check if the four points of rectangle b lies in the current rectangle and return true
        if (((x-width/2) >=(b.x-b.width/2)) && ((x+width/2) >= (b.x+b.width/2))
                && ((y-height/2) >= (b.y-b.height/2)) && ((y+height/2) >= (b.y+b.height/2)))
            return true;
        else return false;
    }

    public void draw(EX_3_2_1_Rectangle b){
        /* Draw rectangle on standard drawing*/
        StdDraw.setXscale(-b.width, b.width);
        StdDraw.setYscale(-b.height, b.height);
        StdDraw.rectangle(x, y, width/2, height/2);
    }

    public static void main(String[] args){
        //Unit test each of the instance methods
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double width = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);
        EX_3_2_1_Rectangle rectangle = new EX_3_2_1_Rectangle(x, y, width, height);
        StdOut.println("Area of rectangle: " + rectangle.area());
        StdOut.println("Perimeter of rectangle: " + rectangle.perimeter());
        //create a rectangle that lies in the first one
        EX_3_2_1_Rectangle b = new EX_3_2_1_Rectangle(x/2, y/2, width/2, height/2);
        //create a rectangle that intersects the first one
        EX_3_2_1_Rectangle c = new EX_3_2_1_Rectangle(x+width/2, y+width/2, width, height);
        StdOut.println("Does rectangle contain b (true)?:" + rectangle.contains(b));
        StdOut.println("Does rectangle contain c (false)?:" + rectangle.contains(c));
        StdOut.println("Does rectangle intersect b (true)?:"+ rectangle.instersects(b));
        rectangle.draw(rectangle);
    }
}
