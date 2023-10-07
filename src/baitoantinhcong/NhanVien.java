package baitoantinhcong;

public class NhanVien {
    private String ten;
    private double luongthang,thuong,phucap;
    private double getThuong (double luongthang,double songaycong) {
        if (songaycong >= 25) return luongthang * 0.2;
        if (songaycong >= 22) return luongthang * 0.1;
        return 0;
    }
    private double getPhucap(String s) {
        if (s.equals("GD")) return 250000;
        if (s.equals("PGD")) return 200000;
        if (s.equals("TP")) return 180000;
        return 150000;
    }
    public NhanVien(String ten,double luong,double songaycong,String chucvu) {
        this.ten = ten;
        luongthang = luong * songaycong;
        thuong = getThuong(luongthang,songaycong);
        phucap = getPhucap(chucvu);
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f %.0f","NV01",ten,luongthang,thuong,phucap,luongthang+thuong+phucap);
    }
}
