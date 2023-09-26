package khaibaolopthisinh;

public class ThiSinh {
    private String name,date;
    private float diem1,diem2,diem3,tong;

    public ThiSinh(String name, String date, float diem1, float diem2, float diem3) {
        this.name = name.trim();
        this.date = date;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public void FixDate() {
        tong = diem1 + diem2 + diem3;
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
        return String.format("%s %s %.1f",name,date,tong);
    }
}
