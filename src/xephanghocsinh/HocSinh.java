package xephanghocsinh;

public class HocSinh implements Comparable<HocSinh>{
    private String ma,name,xeploai;
    private double diemso;

    public HocSinh(int id, String name, String diem) {
        this.ma =  "HS" + String.format("%02d",id);
        this.name = name;
        diemso = Double.parseDouble(diem);
        if (diemso > 9) xeploai = "Gioi";
        else if (diemso >= 7) xeploai = "Kha";
        else if (diemso >= 5) xeploai = "Trung Binh";
        else xeploai = "Yeu";
    }

    public double getDiemso() {
        return diemso;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + diemso +" " + xeploai + " ";
    }

    @Override
    public int compareTo(HocSinh o) {
//        return (int) (diemso - o.diemso); // So sánh kiểu này thì không được.
//        return o.ma.compareTo(ma);
        if (diemso < o.diemso) return 1;
        else if (diemso > o.diemso) return -1;
        return 0;
    }
}
