import java.util.Scanner;

public class soxacach {
    static int[] a = new int[12];
    static int[] c = new int[12];
    static int t,n;
    public static void out(int n) {
        for(int i = 1; i<n; i++) {
            if (Math.abs(a[i]-a[i+1]) == 1) {
                return;
            }
        }
        for(int i = 1; i<=n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void Try(int d,int n) {
        for (int i = 1; i<=n; i++) {
            if (c[i] == 0) {
                c[i] = 1;
                a[d] = i;
                if (d == n) {
                    out(n);
                }
                else Try(d+1,n);
                c[i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            for (int i = 1; i<=n; i++) {
                a[i] = 0;
                c[i] = 0;
            }
            Try(1,n);
            System.out.println();
        }
    }
}
