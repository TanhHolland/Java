package khaibaolopsinhvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),Float.valueOf(sc.nextLine()));
        a.FixDate();
        System.out.println(a);
    }
}
