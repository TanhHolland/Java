import java.util.*;

public class tapturiengcua2xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String[] s1 = sc.nextLine().split("\\s+");
            String[] s2 = sc.nextLine().split("\\s+");
            List<String> a = Arrays.asList(s1);
            List<String> b = Arrays.asList(s2);
            Set <String> res = new TreeSet<>();
            for (String i : a) {
                if (!b.contains(i)) {
                    res.add(i);
                }
            }
            for (String i : res) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
