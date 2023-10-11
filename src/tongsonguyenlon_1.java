import java.math.BigInteger;
import java.util.Scanner;

public class tongsonguyenlon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            BigInteger a = new BigInteger(sc.next()); // xài next, nextline() thì IR
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.add(b));
        }
    }
}
