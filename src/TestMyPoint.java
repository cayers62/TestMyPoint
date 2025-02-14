
import java.lang.Math;
/* this is a starter code for assignment 3*/
class MyPoint{
    /*The data fields x and y that represent the coordinates with getter methods
     */
    private double x;
    private double y;
    /* getter methods */
    public double getX() {return x; /* modify the return statement */}
    public double getY() {return y; /* modify the return statement */}
    /* implement the constructors */
    MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    /* implement the distance methods */
    public double distance(MyPoint point) {
        double dx = this.x - point.getX();
        double dy = this.y - point.getY();
        double dist = Math.sqrt(dx * dx + dy * dy);

        return dist;
    }
    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        double dist = Math.sqrt(dx * dx + dy * dy);

        return dist;
    }
    public static double distance(MyPoint pt1, MyPoint pt2) {
        double dx = pt1.getX() - pt2.getX();
        double dy = pt1.getY()- pt2.getY();
        double dist = Math.sqrt(dx * dx + dy * dy);

        return dist;
    }
}
public class TestMyPoint {

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(6,8);
        MyPoint p2 = new MyPoint(10, 30.5);



        System.out.println("The distance calculated by the first instance method: ");
        System.out.println(p1.distance(p2));
        System.out.println("*****************");
        System.out.println("The distance calculated by the second instance method: ");
        System.out.println(p1.distance(10, 30.5));
        System.out.println("*****************");
        System.out.println("The distance calculated by the static method: ");
        System.out.println(MyPoint.distance(p1, p2));

    }
}