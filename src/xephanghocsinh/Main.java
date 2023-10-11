package xephanghocsinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<HocSinh> a = new ArrayList<>();
        Map<Double,Integer> map = new TreeMap<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=t; i++) {
            a.add(new HocSinh(i,sc.nextLine(),sc.nextLine()));
        }
        List<HocSinh> b = new ArrayList<>(a);
        Collections.sort(b);
        int dem = 1;
        for (HocSinh x : b) {
            double ma = x.getDiemso();
            if (!map.containsKey(ma)) {
                map.put(ma,dem);
            }
            dem++;
        }
        for (HocSinh x : a) {
            System.out.print(x + " " + map.get(x.getDiemso()));
            System.out.println();
        }
    }
}
