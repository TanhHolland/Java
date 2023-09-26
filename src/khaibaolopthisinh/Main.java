package khaibaolopthisinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh a = new ThiSinh(sc.nextLine(), sc.nextLine(), Float.valueOf(sc.nextLine()),Float.valueOf(sc.nextLine()),Float.valueOf(sc.nextLine()));
        a.FixDate();
        System.out.println(a);
    }
}
