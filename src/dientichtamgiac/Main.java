package dientichtamgiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            TamGiac ABC = new TamGiac(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            System.out.println(ABC);
        }
    }
}
