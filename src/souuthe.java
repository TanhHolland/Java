import java.util.Scanner;

public class souuthe {
    static String check(String s) {
        int n = s.length();
        int dc = 0, dl = 0;
        for (int i = 0; i< s.length(); i++) {
            Character c = s.charAt(i);
            if (c < '0' || c > '9') return "INVALID";
            int so = Integer.parseInt(String.valueOf(c));
            if (so % 2 == 0) dc++;
            else dl++;
        }
        if (n % 2 == 0 && dc <= dl) return "NO";
        if (n % 2 == 1 && dl <= dc) return "NO";
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
