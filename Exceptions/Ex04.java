package Exceptions;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = 0;

        try{
            j = 19/i;
            if(j == 0){
                j = 19;
                throw new Weditha("This is default value");
            }
        }
        catch(Weditha e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("Do not divide by 0");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("End");
    }
}

class Weditha extends Exception{
    public Weditha(String str){
        super(str);
    }
}
