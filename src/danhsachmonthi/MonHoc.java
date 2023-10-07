package danhsachmonthi;

public class MonHoc implements Comparable<MonHoc> {
    private String ma,ten,hinhthuc;

    public MonHoc(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten.trim().replaceAll("\\s+"," ");
        this.hinhthuc = hinhthuc.trim().replaceAll("\\s+"," ");
    }
    @Override
    public String toString() {
        return String.format("%s %s %s",ma,ten,hinhthuc);
    }

    @Override
    public int compareTo(MonHoc o) {
        return ma.compareTo(o.ma);
    }
}
