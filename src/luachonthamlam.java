import java.util.Scanner;

public class luachonthamlam {
    static String SoLonNhat(int n, int s) {
        String result = "";
        if (s == 0 || 9*n < s) return "-1";
        int[] a = new int[n];
        int i = 0;
        while (i < n) {
            if (s > 9) {
                a[i] = 9;
                s -= 9;
            }
            else {
                a[i] = s;
                break;
            }
            i++;
        }
        for(i = 0; i<a.length; i++) {
            result += String.valueOf(a[i]);
        }
        return result;
    }
    static String SoNhoNhat(int n, int s) {
        String result = "";
        if (s == 0 || 9*n < s) return "-1";
        int[] a = new int[n];
        a[0] = 1; // cho chữ số đầu tiên luôn là 1
        s -= 1;
        int i = n-1;
        while (i > 0) {
            if (s > 9) {
                a[i] = 9;
                s -= 9;
            }
            else {
                a[i] = s;
                s = 0;
                break;
            }
            i--;
        }
        if (a[0] + s > 9) return "-1";
        a[0] += s; // test là 3 20 ra số 199, lúc này s = 1 còn thừa thì cộng thêm vào đầu số sẽ ra 299
        for( i = 0; i<a.length; i++) {
            result += String.valueOf(a[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        System.out.println(SoNhoNhat(n,s) + " " + SoLonNhat(n,s));
    }
}
