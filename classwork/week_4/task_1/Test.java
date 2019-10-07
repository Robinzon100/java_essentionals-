import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("ernter your victims name : ");
    String name = input.next();

    System.out.print("ernter your victims surname : ");
    String surname = input.next();
    
    System.out.print("ernter your victims age : ");
    int age = input.nextInt();
    

    User user = new User(name, surname, age);
    

    user.isLegalAge(user.age);
    // System.out.println(myObj.x); 
  }
}
