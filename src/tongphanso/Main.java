package tongphanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo num1 = new PhanSo(sc.nextLong(),sc.nextLong());
        PhanSo num2 = new PhanSo(sc.nextLong(),sc.nextLong());
        num1.Result(num2);
        System.out.println(num1);
    }
}
