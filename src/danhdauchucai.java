import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class danhdauchucai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set <Character> kq = new TreeSet<>();
        for (int i = 0; i<s.length(); i++) {
            kq.add(s.charAt(i));
        }
        System.out.println(kq.size());
    }
}
