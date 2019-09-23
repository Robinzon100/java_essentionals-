package com.company;

public class User {
    String name;
    String surname;
    String age;

    public User(String name, String surname, int age) {
        name = name;
        surname = surname;
        age = age;
    }



    static void isSwrul(int age){
        if (age > 18){
            System.out.println("he or she is above 18");
        }else{
            System.out.println("he or she is not above 18");
        }
    }
}
