package lietkenhanvientheochucvu;

public class NhanVien{
    private String id;
    private String name,chucvu;
    private double luongthang,thuong,phucap,tamung,songaycong,luong;

    static double getThuong(double s) {
        if (s >= 25) return 0.2f;
        if (s >= 22) return 0.1f;
        return 0.0f;
    }
    static double getPhuCap(String s) {
        if (s.compareTo("GD") == 0) return 500;
        if (s.compareTo("PGD") == 0) return 400;
        if (s.compareTo("TP") == 0) return 300;
        if (s.compareTo("KT") == 0) return 250;
        return 100;
    }
    static double getTamUng(double phucap,double luongthang) {
        double sum = phucap + luongthang;
        if (sum * 2/3 <25000) return (double) Math.round((sum * 2/3) /1000) * 1000;
        return 25000;
    }
    public NhanVien(int id, String name, String chucvu, String luong, String songaycong) {
        this.id = "NV" + String.format("%02d",id);
        this.name = name;
        this.luong = Double.parseDouble(luong);
        this.songaycong = Double.parseDouble(songaycong);
        this.chucvu = chucvu;
        phucap = getPhuCap(chucvu);
        luongthang = this.luong*this.songaycong;
        tamung = getTamUng(phucap,luongthang);
    }

    public String getChucvu() {
        return chucvu;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f %.0f",id,name,phucap,luongthang,tamung,luongthang + phucap - tamung);
    }

}
