package danhsachmathang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List <MatHang> arr = new ArrayList<MatHang>();
        for (int i = 1; i<=t; i++) {
            String s = String.valueOf(i);
            while (s.length() < 3) {
                s = "0" + s;
            }
            s = "MH" + s;
            arr.add(new MatHang(s,sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt()));
            sc.nextLine(); // nhập số xong lại nhập xâu tiếp
        }
        Collections.sort(arr);
        arr.forEach(i -> System.out.println(i));
    }
}
