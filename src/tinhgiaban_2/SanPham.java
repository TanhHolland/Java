package tinhgiaban_2;

public class SanPham implements Comparable<SanPham> {
    private String name,dv;
    private double gianhap,soluong;
    private double phivanchuyen,thanhtien,giaban;
    private String id;
    public SanPham(int id,String name, String dv, String gianhap, String soluong) {
        this.name = name;
        this.dv = dv;
        this.gianhap = Double.parseDouble(gianhap);
        this.soluong = Double.parseDouble(soluong);
        this.id = "MH" + String.format("%02d",id);
        phivanchuyen = this.gianhap * this.soluong * 0.05;
        phivanchuyen = (double) Math.round(phivanchuyen/10) * 10;
        thanhtien = this.gianhap * this.soluong + phivanchuyen;
        thanhtien = (double) Math.round(thanhtien/10) * 10;
        giaban = thanhtien*1.02/this.soluong;
        giaban = Math.round(giaban / 100.0) * 100.0 + 100.0;
    }

    public double getGiaban() {
        return giaban;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.0f %.0f %.0f",id,name,dv,phivanchuyen,thanhtien,giaban);
    }

    @Override
    public int compareTo(SanPham o) {
        return (int) (o.getGiaban() - giaban);
    }
}