package lietkesinhvientheokhoa;

public class SinhVien {
    private String ma,ten,lop,mail,nam;

    public SinhVien(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.nam = lop.substring(1,3); // xài lớp thì đúng mã sinh viên thì không
    }

    public String getNam() {
        return nam;
    }

    @Override
    public String toString() {
        return ma +" " + ten +" " + lop +" " + mail;
    }

}
