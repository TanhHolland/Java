package tinhthunhapgiaovien;

public class GiaoVien {
    private String mgv,name;
    private long luongcoban,bacluong,phucap,thunhap;
    public GiaoVien(String mgv, String name, long luongcoban) {
        this.mgv = mgv;
        this.name = name;
        this.luongcoban = luongcoban;
        if (this.mgv.charAt(1) == 'T') this.phucap = 2000000;
        else if (this.mgv.charAt(1) == 'P') this.phucap = 900000;
        else this.phucap = 500000;
        this.bacluong = Long.valueOf(this.mgv.substring(2));
        this.thunhap = this.luongcoban * this.bacluong + this.phucap;
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %d %d",mgv,name,bacluong,phucap,thunhap);
    }
}
