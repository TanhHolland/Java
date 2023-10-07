package timthukhoacuakythi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ThiSinh> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=t; i++) {
            arr.add(new ThiSinh(i,sc.nextLine(),sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            sc.nextLine();
        }
        Collections.sort(arr);
        List<ThiSinh> thukhoa = new ArrayList<>();
        thukhoa.add(arr.get(0));
        for(int i = 1; i< arr.size(); i++) {
            if (arr.get(i).getTong() == arr.get(0).getTong()) {
                thukhoa.add(arr.get(i));
            }
        }
        thukhoa.forEach(i -> System.out.println(i));
    }
}
