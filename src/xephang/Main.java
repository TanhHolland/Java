package xephang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.nextLine());
        List<CheckIn> arr = new ArrayList<CheckIn>();
        while (d-->0) {
            arr.add(new CheckIn(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr);
        int t = arr.get(0).getT();
        for (int i = 1; i< arr.size(); i++) {
            t = Math.max(arr.get(i).getT(),t + arr.get(i-1).getD());
        }
        t += arr.get(arr.size()-1).getD();
        System.out.println(t);
    }
}
