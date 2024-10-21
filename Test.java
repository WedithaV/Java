import java.util.Scanner;
public class Test {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String A = scanner.nextLine();
    String B = A.substring(0,1).toUpperCase();
    A = B + A.substring(1);
    System.out.println(A);
    

  }
  
}
