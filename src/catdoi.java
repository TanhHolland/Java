import java.util.Scanner;

public class catdoi {
    public static String ktra(String xau) {
        char[] s = xau.toCharArray();
        for (int i = 0; i< s.length; i++) {
            if(s[i]== '0' || s[i] =='8' || s[i] =='9') s[i] = '0' ;
            else if(s[i] == '1') s[i] = '1';
            else return "INVALID";
        }
        int i;
        for (i = 0; i<s.length; i++) {
            if(s[i] != '0') {
                break;
            }
        }
        if(i == s.length) return "INVALID";
        String kq = new String(s);
        return kq.substring(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0) {
            String s = sc.next();
            System.out.println(ktra(s));
        }
    }
}
