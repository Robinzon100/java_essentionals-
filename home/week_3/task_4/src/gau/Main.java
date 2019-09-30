package gau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String x = scanner.next();
    String strArray[] = x.split("");


        for (String elem : strArray){
            System.out.println(elem);
        }
    }
}

//        System.out.println(index);
//        String[] arr = new String[]{};
//Scanner scanner = new Scanner(System.in);
//    int x = 356984;
//    int index = 10;
//
//    int numberLenght = String.valueOf(x).length();
//        for (int i = 0; i < numberLenght-2; i++){
//        index = index * 10; // 100000
//        }
//        /*
//         * 356984 / 100000 = 3
//         * 356984 / 10000 = 35
//         *
//         * */
//        System.out.println(index);
//        List<Integer> arr = new ArrayList<Integer>();
//
//        for (int i = 0; i < numberLenght; i++){
//        int single = x / index;
//        arr.add(single);
//
//        single
//        index = index / 10;
//
//
//        System.out.println(index);
//
//        System.out.println(arr.get(i));
//        }