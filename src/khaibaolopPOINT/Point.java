package khaibaolopPOINT;

public class Point {
    private double x;
    private double y;
    private double dist;

    Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance1(Point a) {
        return Math.sqrt((this.x - a.x)*(this.x - a.x) + (this.y - a.y)*(this.y - a.y));
    }
    public double distance2(Point a,Point b) {
        return Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y));
    }

    public void setDist(double dist) {
        this.dist = dist;
    }
    @Override
    public String toString() {
        return String.format("%.4f",this.dist);
    }
}
