import java.util.Scanner;

public class uocsochiahetcho2 {
    public static long check(long a) {
        long n = (int) Math.sqrt(a);
        int dem = 0;
        for(long i = 1; i<=n; i++) {
            if(a %i == 0) {
                if(i % 2 == 0) dem++;
                if(a/i%2 == 0) dem++;
            }
        }
        if(n*n == a && n%2 == 0) dem--;
        return dem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long a = sc.nextLong();
            System.out.println(check(a));
        }
    }
}
