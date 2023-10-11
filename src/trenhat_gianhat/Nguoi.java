package trenhat_gianhat;

public class Nguoi implements Comparable<Nguoi>{
    private String name,date;

    public Nguoi(String name, String date) {
        this.name = name;
        this.date = date;
    }
    static int getInt(String s) {
        return Integer.parseInt(s);
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    @Override
    public int compareTo(Nguoi o) {
        String[] ds1 = date.split("/");
        String[] ds2 = o.date.split("/");
        if (getInt(ds1[2]) != getInt(ds2[2])) return getInt(ds1[2]) - getInt(ds2[2]);
        if (getInt(ds1[1]) != getInt(ds2[1])) return getInt(ds1[1]) - getInt(ds2[1]);
        return getInt(ds1[0]) - getInt(ds2[0]);
    }

}
