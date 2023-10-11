package lietkenhanvientheochucvu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            a.add(new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        String s = sc.nextLine();
        for (NhanVien x : a) {
            if (x.getChucvu().compareTo(s) == 0)
                System.out.println(x);
        }
    }
}
