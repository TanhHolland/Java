import java.util.Scanner;

public class xaudoixung {
    static String check(String s) {
        char[] a = s.toCharArray();
        int dem = 0;
        int i = 0,j = a.length-1;
        while (i < j) {
            if (a[i] != a[j]) {
                dem++;
            }
            i++;
            j--;
        }
        if (dem > 1) return "NO";
        if (s.length() % 2 == 0 && dem == 0) return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }
}
