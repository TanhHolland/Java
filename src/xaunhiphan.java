import java.util.Scanner;

public class xaunhiphan {
    public static long[] f = new long[95];
    public static void dayFibo() {
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i<93; i++) {
            f[i] = f[i-2] + f[i-1];
        }
    }
    public static Character catXau(int n,long k) {
        if(n == 1) return '0';
        if(n == 2) return '1';
        if(k <= f[n-2]) return catXau(n-2,k);
        else return catXau(n-1,k-f[n-2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dayFibo();
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(catXau(n,k));
        }
    }
}
