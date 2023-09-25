import java.util.Scanner;

public class chuanhoaxauhoten_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String s = sc.nextLine().trim().toLowerCase();
            String[] ds = s.split("\\s+");
            for(int i = 1; i< ds.length; i++) {
                System.out.print(String.valueOf(ds[i].charAt(0)).toUpperCase()+ ds[i].substring(1));
                if (i == ds.length - 1) System.out.print(", ");
                else System.out.print(" ");
            }
            System.out.print(ds[0].toUpperCase());
            System.out.println();
        }
    }
}
