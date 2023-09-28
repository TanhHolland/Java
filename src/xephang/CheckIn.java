package xephang;

public class CheckIn implements Comparable<CheckIn>{
    private int T,D;

    public CheckIn(int t, int d) {
        T = t;
        D = d;
    }

    public int getT() {
        return T;
    }

    public int getD() {
        return D;
    }

    @Override
    public int compareTo(CheckIn o) {
        return T - o.T;
    }
    @Override
    public String toString() {
        return T + " " + D;
    }
}
