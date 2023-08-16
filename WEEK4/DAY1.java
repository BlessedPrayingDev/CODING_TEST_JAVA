package WEEK4;

import java.util.Scanner;

public class DAY1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if(M < 45 && H >= 1) {
            System.out.printf("%d %d" ,(H-1),(M-45+60));
        } else if (H == 0 && M < 45) {
            System.out.printf("%d %d" ,(H-1+24),(M-45+60));
        } else {
            System.out.printf("%d %d" ,(H),(M-45));
        }
    }
}
