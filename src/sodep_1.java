import java.util.Scanner;

public class sodep_1 {
    static String Try(String s) {
        int n = s.length();
        for (int i = 0; i<n; i++) {
            int x = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (x % 2 != 0) return "NO";
        }
        String xau = new StringBuilder(s).reverse().toString();
        if (!s.equals(xau)) return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String s = sc.nextLine();
            System.out.println(Try(s));
        }
    }
}
