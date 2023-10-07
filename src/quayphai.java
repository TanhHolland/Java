import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class quayphai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for(int i = 0; i<n; i++) {
                a[i] = sc.nextLong();
                b[i] = a[i];
            }
            Arrays.sort(b);
            for (int i = 0; i<n; i++) {
                if (a[i] == b[0]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
