package tracuudonhang;

public class DonHang {
    private String name,ma,stt;
    private double dongia,soluong,giamgia,thanhtien;

    public DonHang(String name, String ma, String dongia, String soluong) {
        this.name = name;
        this.ma = ma;
        stt = ma.substring(1,4);
        this.dongia = Double.parseDouble(dongia);
        this.soluong = Double.parseDouble(soluong);
        int k = Integer.valueOf(String.valueOf(ma.charAt(4)));
        if (k == 1) giamgia = this.dongia * this.soluong *0.5;
        else giamgia = this.dongia * this.soluong *0.3;
        thanhtien = this.dongia * this.soluong - giamgia;
    }

    @Override
    public String toString() {
        return name + " " + ma + " " + stt + " "+ String.format("%.0f",giamgia) + " " + String.format("%.0f",thanhtien);
    }

}

