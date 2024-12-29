import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        String status = (x > 0) ? "Positive" : (x < 0) ? "Negative" : "Zero";
        System.out.println(status);
    }
}
