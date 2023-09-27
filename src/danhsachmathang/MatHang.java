package danhsachmathang;

public class MatHang implements Comparable<MatHang> {
    private String ma, ten, donvi;
    private int giamua, giaban, loinhuan;

    public MatHang(String ma, String ten, String donvi, int giamua, int giaban) {
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua;
    }

    @Override
    public int compareTo(MatHang o) {
        if (loinhuan != o.loinhuan) {
            return o.loinhuan - loinhuan;
        }
        return ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donvi + " " + giamua + " " + giaban +" " + loinhuan;
    }
}
