package bangxephang;

public class SinhVien implements Comparable<SinhVien>{
    private String name;
    private int a,b;

    public SinhVien(String name, String ds) {
        String[] d = ds.split("\\s+");
        this.name = name;
        this.a = Integer.parseInt(d[0]);
        this.b = Integer.parseInt(d[1]);
    }

    @Override
    public int compareTo(SinhVien o) {
        if (a != o.a) return o.a - a;
        if (b != o.b) return b - o.b;
        return name.compareTo(o.name);
    }
    @Override
    public String toString() {
        return name + " " +a +" " + b;
    }
}
