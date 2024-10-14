import java.util.Scanner;

public class scan{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = scanner.nextLine();
    System.out.println("Enter your age:");
    int age = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter your favorite sport:");
    String sport = scanner.nextLine();

    System.out.println("Your name is "+name);
    System.out.println("Your age is "+age);
    System.out.println("Your favorite sport is "+sport);
  }
}