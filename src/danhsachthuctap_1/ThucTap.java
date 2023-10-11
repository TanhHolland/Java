package danhsachthuctap_1;

public class ThucTap implements Comparable<ThucTap>{
    private int id;
    private String msv,name,lop,emal,dn;

    public ThucTap(int id, String msv, String name, String lop, String emal, String dn) {
        this.id = id;
        this.msv = msv.trim();
        this.name = name.trim();
        this.lop = lop.trim();
        this.emal = emal.trim();
        this.dn = dn.trim();
    }

    public String getDn() {
        return dn;
    }

    @Override
    public String toString() {
        return id + " " + msv + " " + name + " " + lop + " " + emal + " " + dn;
    }

    @Override
    public int compareTo(ThucTap o) {
        return name.compareTo(o.name);
    }
}
