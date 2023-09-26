package phanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(sc.nextLong(),sc.nextLong());
        a.Result();
        System.out.println(a);
    }
}
