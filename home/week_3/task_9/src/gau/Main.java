package gau;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] myNum = {2,6,15,25,1,18,100,1};



        int max = Arrays.stream(myNum).max().getAsInt();
        int min = Arrays.stream(myNum).min().getAsInt();
        System.out.println("Largest in given array is " +max);
        System.out.println("Largest in given array is " +min);
    }
}
