package tongphanso;

public class PhanSo {
    private long tu,mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public long UCLN(long a,long b) {
        if (b == 0) return a;
        return UCLN(b,a%b);
    }
    public void RutGon() {
        long GCD = UCLN(tu,mau);
        tu /= GCD;
        mau /= GCD;
    }
    public void Result(PhanSo a) {
        long BCNN = (mau * a.mau) /UCLN(mau,a.mau);
        tu *= BCNN / mau;
        a.tu *= BCNN / a.mau;
        tu += a.tu;
        mau = BCNN;
        RutGon();
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
