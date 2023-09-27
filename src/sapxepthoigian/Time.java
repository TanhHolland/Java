package sapxepthoigian;

public class Time implements Comparable<Time> {
    private int gio,phut,giay;

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public int compareTo(Time o) {
        if (o.gio != this.gio) {
            return this.gio - o.gio;
        }
        if (o.phut != this.phut) {
            return this.phut - o.phut;
        }
        return this.giay - o.giay;
    }
    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
}
