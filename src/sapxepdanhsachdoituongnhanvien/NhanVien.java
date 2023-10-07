package sapxepdanhsachdoituongnhanvien;

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
    static int getInt(String s) {
        return Integer.parseInt(s);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + date + " " + adress + " " + mst + " " + ngayki;
    }

    @Override
    public int compareTo(NhanVien o) {
        String[] s1 = date.split("/");
        String[] s2 = o.date.split("/");
        if (getInt(s1[2]) != getInt(s2[2])) return getInt(s1[2]) - getInt(s2[2]);
        else if (getInt(s1[1]) != getInt(s2[1])) return getInt(s1[1]) - getInt(s2[1]);
        return getInt(s1[0]) - getInt(s2[0]);
    }
}
