package danhsachthuctap_2;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<ThucTap> a = new ArrayList<>();
        for (int i = 1; i<=t; i++){
            a.add(new ThucTap(i, sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a);
        int test = Integer.parseInt(sc.nextLine());
        while (test-->0) {
            String xau = sc.nextLine();
            for (ThucTap x : a) {
                if (x.getDn().compareTo(xau) == 0) {
                    System.out.println(x);
                }
            }
        }
    }
}
