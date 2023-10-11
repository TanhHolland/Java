package danhsachdoanhnghiepnhansinhvienthuctap_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<DoanhNghiep> a = new ArrayList<>();
        while (t-->0)
            a.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        a.forEach(i-> System.out.println(i));
    }

}
