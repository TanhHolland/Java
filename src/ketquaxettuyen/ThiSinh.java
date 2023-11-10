package ketquaxettuyen;

public class ThiSinh {
    private String msv,name,rank;
    private double diem1,diem2,diemthuong;
    private int age;
    public ThiSinh(int n,String name, String date, double diem1, double diem2, double diemthuong) {
        this.msv = "PH" + String.format("%02d",n);
        this.name = name;
        int namnay = 2021;
        int namdate = Integer.parseInt(date.substring(6));
        this.age = namnay - namdate;
        this.diem1 = diem1;
        this.diem2 = diem2;
        if (diem1 > 8 && diem2 > 8) {
            this.diemthuong = 1;
        }
        else if (diem1 > 7.5 && diem2 > 7.5){
            this.diemthuong = 0.5;
        }
        else {
            this.diemthuong = 0;
        }
        double dtb = (diem1 + diem2) / 2 + this.diemthuong;
        if (dtb < 5) rank = "Truot";
        else if (dtb <=6)
    }
    @Override
    public String toString() {
        return
    }
}
