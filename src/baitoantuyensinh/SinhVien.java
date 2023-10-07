package baitoantuyensinh;

public class SinhVien {
    private String ma,ten,tinhtrang;
    private double toan,ly,hoa,uutien,tb;

    public SinhVien(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public double DiemUuTien(String s) {
        if (s.equals("KV1")) return 0.5;
        if (s.equals("KV2")) return 1.0;
        return 2.5;
    }
    public void Ketqua() {
        String id = ma.substring(0,3);
        uutien = DiemUuTien(id);
        tb = toan*2 + ly + hoa ;
        if (tb + uutien >= 24) tinhtrang = "TRUNG TUYEN";
        else tinhtrang = "TRUOT";
    }

    @Override
    public String toString() {
        Ketqua();
        String kquutien,kqtb;
        if (uutien == (int) uutien) {
            kquutien = String.format("%.0f",uutien);
        }
        else {
            kquutien = String.format("%.1f",uutien);
        }
        if (tb == (int) tb) {
            kqtb = String.format("%.0f",tb);
        }
        else {
            kqtb = String.format("%.1f",tb);
        }
        return String.format("%s %s %s %s %s",ma,ten,kquutien,kqtb,tinhtrang);
    }
}
