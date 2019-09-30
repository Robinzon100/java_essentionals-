package gau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        int x = scanner.nextInt();

        System.out.println("enter the second number");
        int y = scanner.nextInt();

        System.out.println("enter the third number");
        int z = scanner.nextInt();

        int jami = x + y + z;
        int namravli = x * y * z;

        System.out.println("jami = " + jami);
        System.out.println("namravli = " + namravli);


    }
}
