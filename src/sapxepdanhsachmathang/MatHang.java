package sapxepdanhsachmathang;

public class MatHang implements Comparable<MatHang>{
    private String ma,ten,loai;
    private double tong;

    public MatHang(int ma, String ten, String loai, double giamua, double giaban) {
        this.ma = String.format("%d",ma);
        this.ten = ten;
        this.loai = loai;
        this.tong = giaban - giamua;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f",ma,ten,loai,tong);
    }

    @Override
    public int compareTo(MatHang o) {
        if (o.tong > tong) return 1;
        else if (o.tong < tong) return -1;
        return 0;
    }
}
