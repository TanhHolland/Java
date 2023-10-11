package bangdiemtuyensinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ThiSinh> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            a.add(new ThiSinh(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        a.forEach(i-> System.out.println(i));
    }
}
