import java.util.Scanner;

public class boisonhonhatcuaNsonguyenduongdautien {
    public static long UCLN(long a,long b) {
        if (b == 0) return a;
        return UCLN(b,a%b);
    }
    public static long BCNN (long a,long b) {
        return (a*b)/UCLN(a,b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-->0) {
            long kq = 1;
            int n = scanner.nextInt();
            for (int i = 2; i<=n; i++) {
                kq = BCNN(i,kq);
            }
            System.out.println(kq);
        }
    }
}
