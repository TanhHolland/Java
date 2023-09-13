import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class hopcuahaidayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> kq = new TreeSet<>();
        for(int i = 0; i<n; i++) {
            int t = sc.nextInt();
            kq.add(t);
        }
        for(int i = 0; i<m; i++) {
            int t = sc.nextInt();
            kq.add(t);
        }
        for(int i : kq) {
            System.out.print(i + " ");
        }
    }
}
