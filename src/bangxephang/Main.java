package bangxephang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        arr.forEach(i-> System.out.println(i));
    }


}
