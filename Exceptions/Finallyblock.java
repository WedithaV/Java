package Exceptions;
import java.util.Scanner;

public class Finallyblock {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = 0;
        try{
            j = 18/i;
        }
        catch(ArithmeticException e){
            System.out.println("Can not divide by Zero");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("In final block");
        }

        try{
            j = 18/j;
        }
        finally{
            System.out.println("in final block two");
        }


    }
}
