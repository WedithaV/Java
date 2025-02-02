package Exceptions;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();
        int j = scan.nextInt();

        try{
            j = j/i;
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("End");
    }
}
