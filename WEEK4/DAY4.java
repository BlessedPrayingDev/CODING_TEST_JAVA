package WEEK4;

import java.util.Scanner;

public class DAY4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d" ,a, i, a*i);
            System.out.println("");
        }
    }
}
