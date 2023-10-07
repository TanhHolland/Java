package tinhtoanphanso;

public class PhanSo {
    private long tuso,mauso;

    public PhanSo(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }
    public long UCLN(long a,long b) {
        if (b == 0) return a;
        return UCLN(b,a%b);
    }
    public long BCNN(long a,long b) {
        return (a*b)/UCLN(a,b);
    }
    public void RutGon() {
        long gcd = UCLN(tuso,mauso);
        tuso /= gcd;
        mauso /= gcd;
    }
    public PhanSo CongPhanSo(PhanSo p) {
        long mauSo = BCNN(mauso,p.mauso);
        long tuSo = tuso*(mauSo/mauso) + p.tuso*(mauSo/p.mauso);
        PhanSo res = new PhanSo(tuSo*tuSo,mauSo*mauSo);
        res.RutGon();
        return res;
    }
    public PhanSo NhanPhanSo(PhanSo a, PhanSo b) {
        long tuSo = tuso * a.tuso * b.tuso;
        long mauSo = mauso * a.mauso * b.mauso;
        PhanSo res = new PhanSo(tuSo,mauSo);
        res.RutGon();
        return res;
    }

    @Override
    public String toString() {
        return tuso + "/" + mauso;
    }
}
