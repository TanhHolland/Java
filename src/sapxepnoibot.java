import java.util.Scanner;

public class sapxepnoibot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i = 0; i<n; i++) {
            boolean check = false;
            for(int j = 0; j<n-1; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    check = true;
                }
            }
            if(!check) break;
            System.out.printf("Buoc %d: ",i+1);
            for(int j = 0; j<n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
