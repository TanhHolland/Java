import java.util.Locale;
import java.util.Scanner;

public class chuanhoaxauhoten_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String s = sc.nextLine().trim().toLowerCase();
            String[] ds = s.split("\\s+");
            for (String i : ds) {
                System.out.print(String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) +" ");
            }
            System.out.println();
        }
    }
}
