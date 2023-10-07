package timthukhoacuakythi;

public class ThiSinh implements Comparable<ThiSinh>{
    private String name,date;
    private double a,b,c,tong;
    private int ma;

    public ThiSinh(int ma,String name, String date, double a, double b, double c) {
        this.ma = ma;
        this.name = name;
        this.date = date;
        this.tong = a + b + c;
    }

    public double getTong() {
        return tong;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + date + " " + tong;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (tong < o.tong) return 1;
        else if (tong > o.tong) return -1;
        return 0;
    }
}
