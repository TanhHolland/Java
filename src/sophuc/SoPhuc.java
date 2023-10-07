package sophuc;

public class SoPhuc {
    private long a,b;

    public SoPhuc(long a, long b) {
        this.a = a;
        this.b = b;
    }
    public SoPhuc CongHaiSoPhuc(SoPhuc p) {
        return new SoPhuc(a + p.a,b + p.b);
    }
    public SoPhuc NhanHaiSoPhuc(SoPhuc p) {
        return new SoPhuc(a * p.a - b * p.b,a * p.b + b * p.a);
    }
    @Override
    public String toString() {
        String chuanhoa;
        if (b >=0) chuanhoa = " + " + String.valueOf(b) + "i";
        else chuanhoa = " - " + String.valueOf(b*-1) + "i";
        return a + chuanhoa;
    }
}
