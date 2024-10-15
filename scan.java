import java.util.Scanner;

public class scan{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = scanner.nextLine();
    System.out.println("Enter your age:");
    int age = scanner.nextInt();

    scanner.nextLine(); 
    /*When use nextInt(); it will only scan integers. so "\n" part will remain in the
     * scanner .To awoid that we again call the nextLine(); after that scanner will be empty
     * and we can use it as usuall
    */

    System.out.println("Enter your favorite sport:");
    String sport = scanner.nextLine();

    System.out.println("Your name is "+name);
    System.out.println("Your age is "+age);
    System.out.println("Your favorite sport is "+sport);
  }
}