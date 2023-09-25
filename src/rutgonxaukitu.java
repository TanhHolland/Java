import java.util.Scanner;
import java.util.Stack;

import static java.lang.Character.compare;

public class rutgonxaukitu {
    static String check(String s) {
        Stack <Character> f = new Stack<>();
        for (int i = 0; i<s.length(); i++) {
            if (!f.empty()) {
                  char x = f.pop().charValue();
                  if (x != s.charAt(i)) {
                      f.push(Character.valueOf(x));
                      f.push(Character.valueOf(s.charAt(i)));
                  }
            }
            else {
                f.push(Character.valueOf(s.charAt(i)));
            }
        }
        if (f.empty()) {
            return "Empty String";
        }
        StringBuilder kq = new StringBuilder();
        while (!f.empty()) {
            kq.append(f.pop().charValue());
        }
        return kq.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(check(s));
    }
}
