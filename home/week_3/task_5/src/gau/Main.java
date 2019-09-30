package gau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String strArray[] = x.split("");

        int jami = 0;

        for (String elem : strArray){
            jami += Integer.parseInt(elem);
        }

        System.out.println(jami);

    }

}

