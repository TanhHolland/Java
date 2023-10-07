package lopTriangle_1;

import java.util.Scanner;

public class Point{
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        return new Point(a,b);
    }
    public double distance(Point p) {
        return Math.sqrt(Math.pow(x-p.x,2) + Math.pow(y-p.y,2));
    }
}
