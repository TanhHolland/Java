package bangdiemhocsinh;

public class HocSinh implements Comparable<HocSinh> {
    private String ma,ten,rank;
    private double tong = 0.0;
    private String xeploai(double a) {
        if (a >= 9) return "XUAT SAC";
        if (a >= 8) return "GIOI";
        if (a >= 7) return "KHA";
        if (a >= 5) return "TB";
        return "YEU";
    }
    public HocSinh(int ma, String ten, String ds) {
        this.ma = "HS" + String.format("%02d",ma);
        this.ten = ten;
        String[] lst = ds.split("\\s+"); // nếu là ds.split(" ") báo lỗi vì nó chỉ tách 1 khoảng trắng mà không phải 2
        for (int i = 0; i <lst.length; i++) {
            if (i < 2) {
                tong += Double.parseDouble(lst[i]);
            }
            tong += Double.parseDouble(lst[i]);
        }
        tong /= 12;
        rank = xeploai(tong);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " +(double)Math.round(tong * 10)/10 +" " + rank;
    }
    @Override
    public int compareTo(HocSinh o) {
        if (o.tong > tong) return 1;
        else if (o.tong < tong) return -1;
        return 0;
    }
}
