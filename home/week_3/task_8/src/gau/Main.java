package gau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int middle = N - M;

        for (int i = 0; i < middle; i++){
            System.out.println(M+i);
        }


    }
}
