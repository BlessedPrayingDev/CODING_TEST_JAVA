package WEEK3;

import java.util.Scanner;

public class DAY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b) {
            System.out.println("==");
        } else if (a > b) {
            System.out.printf(">");
        } else {
            System.out.println("<");
        }
    }
}
