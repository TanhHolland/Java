import java.math.BigInteger;
import java.util.Scanner;

public class tongsonguyenlon_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next()); // xài next, nextline() thì IR
        BigInteger b = new BigInteger(sc.next());
        System.out.println(a.add(b));
    }
}
