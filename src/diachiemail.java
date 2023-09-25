import java.util.Scanner;

public class diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String s = sc.nextLine().toLowerCase().trim();
            String ds[] = s.split("\\s+");
            String kq = ds[ds.length-1];
            for(int i = 0; i< ds.length-1; i++) {
                kq += String.valueOf(ds[i].charAt(0));
            }
            System.out.println(kq+"@ptit.edu.vn");
        }
    }
}
