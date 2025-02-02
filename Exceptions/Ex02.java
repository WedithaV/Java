package Exceptions;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        String str = null;
        int[] nums = new int[2];
        System.out.println();

        try{
            j = j / i;               //When find a exception other statements will not execute
            nums[3] = 3;
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Do not divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Know Your limits");
        }
        catch(Exception e){             //This block should always in the bottom 
            System.out.println(e);
        }

        System.out.println("End");
    }
}
