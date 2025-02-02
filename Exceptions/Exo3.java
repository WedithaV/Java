package Exceptions;
import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = 0;
        try{
            j = 19/i;
            if(j == 0){
                throw new ArithmeticException("Default value");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println(j);
        System.out.println("End");
    }
}
