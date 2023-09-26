package khaibaolopsinhvien;

public class SinhVien {
    private String name,lop,date;
    private float gpa;

    public SinhVien(String name, String lop, String date, float gpa) {
        this.name = name.trim();
        this.lop = lop;
        this.date = date;
        this.gpa = gpa;
    }
    public void FixDate() {
        String[] ds = date.split("/");
        date = "";
        for (int i = 0; i<ds.length-1; i++) {
            if (ds[i].length() < 2) {
                ds[i] = "0" + ds[i];
            }
            date += ds[i] + "/";
        }
        date += ds[ds.length-1];
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f","B20DCCN001",name,lop,date,gpa);
    }
}
