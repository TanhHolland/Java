package chuvitamgiac;

public class ChuVi {
    private Point A = new Point(), B = new Point(),C = new Point();
    private double AB,AC,BC;
    public ChuVi(double x1,double y1,double x2,double y2, double x3, double y3) {
        A.setX(x1);
        A.setY(y1);
        B.setX(x2);
        B.setY(y2);
        C.setX(x3);
        C.setY(y3);
        AB = A.distance1(B);
        AC = A.distance1(C);
        BC = B.distance1(C);
    }
    @Override
    public String toString() {
        if (AB + AC <= BC || AB + BC <= AC || BC + AC <= AB) {
            return "INVALID";
        }
        return String.format("%.3f",AB + BC + AC);
    }
}
