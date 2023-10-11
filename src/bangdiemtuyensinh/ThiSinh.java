package bangdiemtuyensinh;


import java.util.Scanner;

public class ThiSinh {
    private String name,ma,khuvuc,rank;
    private double toan,ly, hoa,tb,uutien;

    public ThiSinh(String name, String ma, String toan, String ly, String hoa) {
        this.name = name;
        this.ma = ma;
        this.toan = Double.parseDouble(toan);
        this.ly = Double.parseDouble(ly);
        this.hoa = Double.parseDouble(hoa);
        khuvuc = ma.substring(0,3);
        tb = (this.toan * 2.0 + this.ly + this.hoa)/4.0;
        if (khuvuc.compareTo("KV1") == 0) uutien = 0.5;
        else if (khuvuc.compareTo("KV2") == 0) uutien = 1.0;
        else uutien = 2.5;
        if (tb + uutien >=24) rank = "TRUNG TUYEN";
        else rank = "TRUOT";
    }

    @Override
    public String toString() {
        String kq = "";
        if (uutien - (int) uutien == 0.0) kq = String.format("%.0f",uutien);
        else kq = String.format("%.1f",uutien);
        return String.format("%s %s %d %.1f %s",ma,name,kq,tb,rank);
    }
}
