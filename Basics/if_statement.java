package Basics;
import java.util.Scanner;

public class if_statement {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age:");
    int x = scanner.nextInt();
    scanner.close();

    if( x < 0){
      System.out.println("Age can not be negative");
    }
    else if(x < 18){
      System.out.println("You are a child");
    }
    else if(x >= 18 && x < 75){
      System.out.println("You are adult now");
    }
    else if(x >= 75 && x < 120){
      System.out.println("You are a great elder now");
    }
    else{
      System.out.println("You can not be alive");
    }
  }
}
