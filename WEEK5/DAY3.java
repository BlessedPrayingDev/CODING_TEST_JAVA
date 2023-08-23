package WEEK5;

import java.util.Scanner;

public class DAY3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = N / 4;
        String b = "";
        for(int i = 0; i < a; i++) {
            b += "long ";
        }
        System.out.println(b + "int");
    }
}
