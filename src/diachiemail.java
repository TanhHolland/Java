import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        TreeMap <String,Integer> map = new TreeMap<>();
        while (t-->0) {
            String s = sc.nextLine().toLowerCase().trim();
            String ds[] = s.split("\\s+");
            String kq = ds[ds.length-1];
            for(int i = 0; i< ds.length-1; i++) {
                kq += String.valueOf(ds[i].charAt(0));
            }
            if(!map.containsKey(kq)) {
                map.put(kq,1);
                System.out.print(kq);
                System.out.print("@ptit.edu.vn");
            }
            else {
                map.put(kq,map.get(kq) + 1);
                System.out.print(kq+ String.valueOf(map.get(kq)));
                System.out.print("@ptit.edu.vn");
            }
            System.out.println();
        }
    }
}
