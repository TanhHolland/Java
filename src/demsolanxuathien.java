import java.util.HashMap;
import java.util.Scanner;

public class demsolanxuathien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i<=t; i++){
            HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j<n; j++) {
                a[j] = sc.nextInt();
                if (!hashMap.containsKey(a[j])) {
                    hashMap.put(a[j],1);
                }
                else {
                    int value = hashMap.get(a[j]);
                    value++;
                    hashMap.put(a[j],value);
                }
            }
            System.out.printf("Test %d:\n",i);
            for (int j = 0; j<n; j++) {
                if(hashMap.get(a[j]) > 0) {
                    System.out.printf("%d xuat hien %d lan \n", a[j], hashMap.get(a[j]));
                    hashMap.put(a[j],0);
                }
            }
        }
    }
}
