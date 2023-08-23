package WEEK5;

import java.util.Scanner;

public class DAY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totAmt = sc.nextInt();
        int itemCount = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < itemCount; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += (a * b);
        }
        System.out.println((totAmt == sum) ? "Yes" : "No");
    }
}
