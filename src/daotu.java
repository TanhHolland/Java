import java.util.Scanner;

public class daotu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String s = sc.nextLine().trim();
            String[] ds = s.split("\\s+");
            for (int i = 0; i<ds.length; i++) {
                String xau = new StringBuilder(ds[i]).reverse().toString();
                System.out.print(xau + " ");
            }
            System.out.println();
        }
    }
}
