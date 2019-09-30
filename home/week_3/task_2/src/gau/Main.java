package gau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        int x = scanner.nextInt();

        System.out.println("enter the second number");
        int y = scanner.nextInt();

        int mteli = x / y;
        int nashti = y % x;

        System.out.println("first divided by the second is int = " + mteli);
        System.out.println("second divided by the first ther's left = " + nashti);
    }
}
