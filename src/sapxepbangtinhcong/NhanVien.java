package sapxepbangtinhcong;

public class NhanVien implements Comparable<NhanVien>{
    private String id;
    private String name,chucvu;
    private double luongthang,thuong,phucap,luong,songaycong,tong;

    static double getThuong(double s) {
        if (s >= 25) return 0.2f;
        if (s >= 22) return 0.1f;
        return 0.0f;
    }
    static double getPhuCap(String s) {
        if (s.compareTo("GD") == 0) return 250000;
        if (s.compareTo("PGD") == 0) return 200000;
        if (s.compareTo("TP") == 0) return 180000;
        return 150000;
    }
    public NhanVien(int id, String name, String luong, String songaycong, String chucvu) {
        this.id = "NV" + String.format("%02d",id);
        this.name = name;
        this.luong = Double.parseDouble(luong);
        this.songaycong = Double.parseDouble(songaycong);
        this.chucvu = chucvu;
        luongthang = this.luong*this.songaycong;
        thuong = luongthang*getThuong(this.songaycong);
        phucap = getPhuCap(chucvu);
        tong = luongthang + thuong + phucap;
    }

    public double getTong() {
        return tong;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f %.0f",id,name,luongthang,thuong,phucap,tong);
    }

    @Override
    public int compareTo(NhanVien o) {
        return (int) (o.tong - tong);
    }
}
