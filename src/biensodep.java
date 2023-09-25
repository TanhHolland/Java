import java.security.KeyStore;
import java.util.Scanner;

public class biensodep {
    static boolean check1(String s) {
        for (int i = 0; i<s.length()-1; i++) {
            int a = Integer.parseInt(String.valueOf(s.charAt(i)));
            int b = Integer.parseInt(String.valueOf(s.charAt(i+1)));
            if (a >= b) return false;
        }
        return true;
    }
    static boolean check2(String s) {
        for (int i = 0; i<s.length()-1; i++) {
            if (s.charAt(i) != s.charAt(i+1)) return false;
        }
        return true;
    }
    static boolean check3(String s) {
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(s.length()-1) == s.charAt(s.length()-2)) return true;
        return false;
    }
    static boolean check4(String s) {
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }
    static String Try(String s) {
        s = s.substring(5);
        s = s.replace(".","");
        if (check1(s) ||check2(s) ||check3(s) ||check4(s)) return "YES";
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
