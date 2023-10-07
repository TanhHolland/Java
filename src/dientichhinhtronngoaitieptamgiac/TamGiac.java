package dientichhinhtronngoaitieptamgiac;

public class TamGiac {
    private double dientich;
    private Point A;
    private Point B;
    private Point C;
    private double a,b,c;
    public TamGiac(double x1,double y1,double x2,double y2,double x3,double y3) {
        A = new Point(x1,y1);
        B = new Point(x2,y2);
        C = new Point(x3,y3);
        a = A.distance1(B);
        b = A.distance1(C);
        c = B.distance1(C);
    }
    @Override
    public String toString() {
        if (a + b <=c || a + c <= b || b + c <= a) {
            return "INVALID";
        }
        double p = (a+b+c)/2.0;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        double r = (a*b*c)/(4.0*s);
//        dist = Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b))/4.0;
        return String.format("%.3f",r*r*Math.PI);
    }
}
