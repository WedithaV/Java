import java.util.Scanner;
public class LogicalOperators{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number:");
    int x = scanner.nextInt();
    scanner.nextLine();

    if(x > 0 && x < 10){
      System.out.println("X is between 0 and 10");
    }
    else{
      System.out.println("X is not between 0 and 10");
    }

    System.out.println("Do you want to quit ? press 'q' or 'Q'");
    String response = scanner.next(); //next(); only read one word

    if(response.equals("Q") || response.equals("q")){
      System.out.println("Quit the game");
    }
    else{
      System.out.println("Still playing");
    }


    System.out.println("Do you want to quit ? press 'q' or 'Q'");
    String answer = scanner.next(); //next(); only read one word

    if(!answer.equals("Q") && !answer.equals("q")){
      System.out.println("Still playing");
    }
    else{
      System.out.println("Quit the game");
    }


    
  }
}