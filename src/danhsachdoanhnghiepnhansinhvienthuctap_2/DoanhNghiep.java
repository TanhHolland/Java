package danhsachdoanhnghiepnhansinhvienthuctap_2;

public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma,ten;
    public int soluong;

    public DoanhNghiep(String ma, String ten, String soluong) {
        this.ma = ma;
        this.ten = ten;
        this.soluong = Integer.parseInt(soluong);
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if (soluong == o.soluong) {
            return ma.compareTo(o.ma);
        }
        return o.soluong - soluong;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soluong;
    }
}
