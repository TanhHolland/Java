package lietkesinhvientheonganh;

public class SinhVien {
    private String ma,ten,lop,mail,nam;

    public SinhVien(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.nam = ma.substring(3,7);
    }

    public char getLop() {
        return lop.charAt(0);
    }

    public String getNam() {
        return nam;
    }

    @Override
    public String toString() {
        return ma +" " + ten +" " + lop +" " + mail;
    }

}
