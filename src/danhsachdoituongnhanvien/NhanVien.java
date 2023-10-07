package danhsachdoituongnhanvien;

import java.util.Comparator;

public class NhanVien implements Comparable<NhanVien> {
    private String ma,ten,gioitinh,date,adress,mst,ngayki;

    public NhanVien(int ma, String ten, String gioitinh, String date, String adress, String mst, String ngayki) {
        this.ma = String.format("%05d",ma);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.date = date;
        this.adress = adress;
        this.mst = mst;
        this.ngayki = ngayki;
    }
    @Override
    public int compareTo(NhanVien o) {
        return date.compareTo(o.date);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + date + " " + adress + " " + mst + " " + ngayki;
    }
}
