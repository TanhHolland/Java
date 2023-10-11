package tinhgiaban_1;

public class SanPham {
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
        thanhtien = this.gianhap * this.soluong + phivanchuyen;
        giaban = thanhtien*1.02;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %.0f %.0f %.0f",id,name,dv,phivanchuyen,thanhtien,giaban);
    }
}
