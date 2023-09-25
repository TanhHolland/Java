import java.util.Scanner;

public class chuso4vachuso7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int dem4 = 0;
        int dem7 = 0;
        for (int i = 0; i<n.length(); i++) {
            if(n.charAt(i) == '4') dem4++;
            if(n.charAt(i) == '7') dem7++;
        }
        if(dem4 + dem7 == 7 || dem4 + dem7 == 4) System.out.println("YES");
        else System.out.println("NO");
    }
}
