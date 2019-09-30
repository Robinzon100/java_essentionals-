package gau;

import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("First Fist Number: ");
            int a = input.nextInt();


            System.out.println("First Second Number: ");
            int b = input.nextInt();

            int g;

            g = gcd(a, b);
            System.out.println(g);

        }
    }
