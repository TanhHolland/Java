package tinhgio;

public class NghienGame implements Comparable<NghienGame>{
    private String ma,ten;
    private int hr,mm;
    public NghienGame(String ma, String ten, String giovao, String giora) {
        this.ma = ma;
        this.ten = ten;
        String[] s1 = giovao.split(":");
        String[] s2 = giora.split(":");
        int kc = Integer.parseInt(s2[0])*60 + Integer.parseInt(s2[1]) - Integer.parseInt(s1[0])*60 - Integer.parseInt(s1[1]);
        hr = kc/60;
        mm = kc%60;
    }
    @Override
    public String toString() {
        return String.format("%s %s %d gio %d phut",ma,ten,hr,mm);
    }

    @Override
    public int compareTo(NghienGame o) {
        if (hr != o.hr) {
            return o.hr - hr;
        }
        return o.mm - mm;
    }
}
