package khaibaolopHinhChuNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange hcn = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
        if (hcn.TestCase()) {
            System.out.printf("%.0f %.0f %s" ,hcn.findPerimeter(),hcn.findArea(),hcn.Convert());
        }
        else {
            System.out.println("INVALID");
        }
    }
}
