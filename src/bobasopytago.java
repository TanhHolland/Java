import java.util.Arrays;
import java.util.Scanner;

public class bobasopytago {
    static long power(long n) {
        return n*n;
    }
    // 1 3 4 5 6
    static String check(long[] a,int n) {
        for(int i = 0; i<n-2; i++) {
            for(int j = i+1; j<n-1; j++) {
                long sum = power(a[i]) + power(a[j]);
                int left = j+1;
                int right = n-1;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (sum == power(a[mid])) return "YES";
                    else if (power(a[mid]) < sum) left = mid + 1;
                    else right = mid-1;
                }
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-->0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(check(a,n));
        }
    }
}
