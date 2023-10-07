package danhsachmonthi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        List<MonHoc> arr = new ArrayList<MonHoc>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            arr.add(new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        arr.forEach(i -> System.out.println(i));
    }
}
