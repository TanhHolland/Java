package bangdiemthanhphan_1;

public class SinhVien implements Comparable<SinhVien>{
    private String msv,name,lop;
    private double d1,d2,d3;

    public SinhVien(String msv, String name, String lop, String d1, String d2, String d3) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.d1 = Double.parseDouble(d1);
        this.d2 = Double.parseDouble(d2);
        this.d3 = Double.parseDouble(d3);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f %.1f %.1f",msv,name,lop,d1,d2,d3);
    }

    @Override
    public int compareTo(SinhVien o) {
        return msv.compareTo(o.msv);
    }
}
