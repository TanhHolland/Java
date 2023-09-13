import java.util.Arrays;
import java.util.Scanner;

public class giaocuahaidayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] ds1 = new int[1005];
        int[] ds2 = new int[1005];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            ds1[a[i]]++;
        }
        Arrays.sort(a);
        for(int i = 0; i<m; i++) {
            b[i] = sc.nextInt();
            ds2[b[i]]++;
        }
        for (int i = 0; i<n; i++) {
            if(ds1[a[i]] > 0 && ds2[a[i]] > 0) {
                System.out.print(a[i] +" ");
                ds1[a[i]] = 0;
                ds2[a[i]] = 0;
            }
        }
    }
}
