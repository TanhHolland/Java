import java.util.Scanner;

public class sodep_2 {
    static String Try(String s) {
        int n = s.length();
        if (s.charAt(n-1) !='8') return "NO";
        int sum = 0;
        for (int i = 0; i<n; i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        if (sum % 10 != 0) return "NO";
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
