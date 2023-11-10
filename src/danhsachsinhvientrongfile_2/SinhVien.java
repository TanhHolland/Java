package danhsachsinhvientrongfile_2;

public class SinhVien {
    private String msv,name,lop,date;
    private double gpa;

    public SinhVien(String msv, String name, String lop, String date, double gpa) {
        this.msv = "B20DCCN" + String.format("%03d",Integer.parseInt(msv));
        this.name = name;
        this.lop = lop;
        String kq = "";
        String ds[] = date.split("/");
        for(int i = 0; i<ds.length-1; i++) {
            if (ds[i].length() < 2) ds[i] = "0" + ds[i];
            kq += ds[i]+"/";
        }
        kq+=ds[ds.length-1];
        this.date = kq;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f",msv,name,lop,date,gpa);
    }
}
