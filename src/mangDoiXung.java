import java.util.Scanner;

public class mangDoiXung {
    public static String check(int[] a) {
        for (int i = 0; i < a.length/2; i++)
            if (a[i] != a[a.length - 1 - i]) {
                return "NO";
            }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(check(a));
        }

    }
}
