package Basics;
import java.util.Scanner;

public class WhileLoop {
  public static void main(){
    Scanner scanner = new Scanner(System.in);
    String name = "";

    while(name.isBlank()){
      System.out.println("Enter your name :");
      name = scanner.nextLine();
    }
    System.out.println("Hello "+name);

    String dtx = "";

    do{
      System.out.println("Enter a character:");
      dtx = scanner.nextLine();
    }while(dtx.isBlank());
    scanner.close();
  }
}
