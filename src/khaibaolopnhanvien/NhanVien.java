package khaibaolopnhanvien;

public class NhanVien {
    private String name,gender,date,adress,mst,dateki;

    public NhanVien(String name, String gender, String date, String adress, String mst, String dateki) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.adress = adress;
        this.mst = mst;
        this.dateki = dateki;
    }
    public String FixDate(String date) {
        String[] ds = date.split("/");
        date = "";
        for (int i = 0; i<ds.length-1; i++) {
            if (ds[i].length() < 2) {
                ds[i] = "0" + ds[i];
            }
            date += ds[i] + "/";
        }
        date += ds[ds.length-1];
        return date;
    }
    public void Fix() {
        date = FixDate(date);
        dateki = FixDate(dateki);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s","00001",name,gender,date,adress,mst,dateki);
    }
}
