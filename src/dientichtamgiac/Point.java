package dientichtamgiac;

public class Point {
    private double x,y;
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
    public double distance1(Point p) {
        return Math.sqrt(Math.pow(x - p.x,2) + Math.pow(y - p.y,2));
    }
    public double distance2(Point p1,Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2));
    }
}
