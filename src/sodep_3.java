import java.util.Scanner;

public class sodep_3 {
    static boolean checkSNT(int n) {
        if (n < 2) return false;
        for(int i = 2; i<=Math.sqrt((double) n); i++)
            if (n%i==0) return false;
        return true;
    }
    static String Try(String s) {
        int n = s.length();
        for (int i = 0; i<n; i++) {
            int x = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (!checkSNT(x)) return "NO";
        }
        String xau = new StringBuilder(s).reverse().toString();
        if (s.equals(xau)) return "YES";
        return "NO";
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
