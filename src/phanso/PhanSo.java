package phanso;

public class PhanSo {
    private long a,b;

    public PhanSo(long a, long b) {
        this.a = a;
        this.b = b;
    }
    public long UCLN (long a,long b) {
        if (b == 0)  return a;
        return UCLN(b,a%b);
    }
    public void Result() {
        long ucln = UCLN(a,b);
        a = a/ucln;
        b = b/ucln;
    }
    @Override
    public String toString() {
        return a + "/" + b;
    }
}
