package lopTriangle_1;

public class Triangle {
    private double a,b,c,dist;
    public Triangle(Point A,Point B, Point C) {
        a = A.distance(B);
        b = A.distance(C);
        c = B.distance(C);
        dist = a + b + c;
    }
    public String getPerimeter() {
        return String.format("%.3f",dist);
    }
    public boolean valid() {
        if (a + b <=c || a + c <=b || b + c <= a) return false;
        return true;
    }
}
