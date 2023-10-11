import java.math.BigInteger;
import java.util.Scanner;

public class chiahetcho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger du = a.mod(new BigInteger("11"));
            int sodu = du.intValue();
            if (sodu == 0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
