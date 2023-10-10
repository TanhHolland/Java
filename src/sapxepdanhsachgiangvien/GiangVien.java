package sapxepdanhsachgiangvien;

public class GiangVien implements Comparable<GiangVien> {
    private String ma,name,lop,ten;

    public GiangVien(int ma,String name, String lop) {
        this.ma = "GV" + String.format("%02d",ma);
        String[] dd = name.split("\\s+");
        ten = dd[dd.length-1];
        this.name = name;
        String[] d = lop.split("\\s+");
        String result = "";
        for(int i = 0; i<d.length; i++)
            result += String.valueOf(d[i].charAt(0)).toUpperCase();
        this.lop = result;
    }
    @Override
    public String toString() {
        return ma +" " + name + " " + lop;
    }

    @Override
    public int compareTo(GiangVien o) {
        return ten.compareTo(o.ten);
    }
}
