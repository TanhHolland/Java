package lopINTSET;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class IntSet {
    private int[] a;
    Set<Integer> arr = new TreeSet<>();
    public IntSet(int[] a) {
        this.a = a;
        for (int i = 0; i<a.length; i++) {
            arr.add(a[i]);
        }
    }
    public IntSet union(IntSet p) {
        Set<Integer> res = new TreeSet<>(arr);
        for (Integer i : p.arr) {
            res.add(i);
        }
        int n = res.size();
        int ds[] = new int[n];
        int t = 0;
        for (Integer i : res) {
            ds[t++] = i;
        }
        return new IntSet(ds);
    }
    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i<a.length; i++) {
            result += Integer.toString(a[i]) + " ";
        }
        return result;
    }
}
