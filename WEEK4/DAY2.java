package WEEK4;

import java.util.Scanner;

public class DAY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((b+c) < 60) {
            System.out.printf("%d %d" ,a,(b+c));
        } else if ((b+c) >= 60) {
            int d = 0;
            d = (b+c) / 60;
            if((a+d) >= 24) {
                System.out.printf("%d %d",((a+d) % 24), ((b+c) % 60));
            } else {
                System.out.printf("%d %d", a+d, (b+c) % 60);
            }
        }
    }
}
