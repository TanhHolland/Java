import java.util.Scanner;

public class dienthoaicucgach {
    static String kitu (Character c) {
        if ('a' <= c && c <='c')  {
            return "2";
        }
        else if ('d' <= c && c <='f') {
            return "3";
        }
        else if ('g' <= c && c <='i') {
            return "4";
        }
        else if ('j' <= c && c <='l') {
            return "5";
        }
        else if ('m' <= c && c <='o') {
            return "6";
        }
        else if ('p' <= c && c <='s') {
            return "7";
        }
        else if ('t' <= c && c <='v') {
            return "8";
        }
        else {
            return "9";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String s = sc.nextLine().toLowerCase();
            String xau = "";
            for (int i = 0; i<s.length(); i++) {
                xau += kitu(s.charAt(i));
            }
            String xauRv = new StringBuilder(xau).reverse().toString();
            if (xau.equals(xauRv)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
