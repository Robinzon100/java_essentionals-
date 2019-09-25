package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("enter the subjects name : ");
        String name = input.next();

        System.out.println("enter the subjects surnmae : ");
        String surname = input.next();

        System.out.println("enter the subjects age : ");
        String ageSting = input.next();
        int age = Integer.parseInt(ageSting);

        User newUser = new User(name, surname, age);
        System.out.println(newUser.name + "is");
        newUser.isSwrul(17);



    }
}
