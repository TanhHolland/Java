package danhsachdoituongsinhvien_1;

public class SinhVien {
    private String id,name,lop,date;
    private double gpa;

    public SinhVien(int id,String name, String lop, String date, double gpa) {
        this.id = "B20DCCN" +String.format("%03d",id);
        this.name = name;
        this.lop = lop;
        String ds[] = date.split("/");
        String result = "";
        for (int i = 0; i <ds.length-1; i++) {
            ds[i] = String.format("%02d",Integer.parseInt(ds[i]));
            result += ds[i] + "/";
        }
        result += ds[ds.length-1];
        this.date = result;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f",id,name,lop,date,gpa);
    }
}
