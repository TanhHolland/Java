package WORDSET;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    private String s;
    private Set<String> arr =new TreeSet<>();

    public WordSet(String s) {
        this.s = s.toLowerCase();
        String ds[] = this.s.split("\\s+");
        for (int i = 0; i<ds.length; i++) arr.add(ds[i]);
    }
    public WordSet union(WordSet p) {
        Set<String> res = new TreeSet<>(arr);
        for (String i : p.arr) {
            res.add(i);
        }
        String result = "";
        for (String i : res) {
            result += i + " ";
        }
        return new WordSet(result);
    }
    public WordSet intersection(WordSet p) {
        Set<String> res = new TreeSet<>();
        for (String i : arr) {
            if (p.arr.contains(i)) {
                res.add(i);
            }
        }
        String result = "";
        for (String i : res) {
            result += i + " ";
        }
        return new WordSet(result);
    }

    @Override
    public String toString() {
        return s;
    }
}
