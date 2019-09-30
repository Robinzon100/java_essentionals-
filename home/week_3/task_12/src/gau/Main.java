package gau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 8; i++) {
            int rand_int1 = rand.nextInt(1000);
            arr.add(rand_int1);
        }

        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
