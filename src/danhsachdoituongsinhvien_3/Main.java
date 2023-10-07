package danhsachdoituongsinhvien_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> arr = new ArrayList<SinhVien>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=t; i++){
            arr.add(new SinhVien(i,sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextDouble()));
            sc.nextLine();
        }
        Collections.sort(arr);
        arr.forEach(i -> System.out.println(i));
    }
}
