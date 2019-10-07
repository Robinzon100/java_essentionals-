public class User {
    int x;
    final int mustBeAge = 18;

    String name;
    String surname;
    int age;

    User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    static void isLegalAge(int age){
        if (age < 18) {
            System.out.println("its illegal age !");
        }else{
            System.out.println("its llegal age :)");
        }
    }



}
