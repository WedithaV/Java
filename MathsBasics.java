import java.util.Scanner;
import javax.swing.JOptionPane;

public class MathsBasics {
  public static void main(String[] args){
    int x = Integer.parseInt(JOptionPane.showInputDialog("Enter x value"));
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter y value: ");
    int y = scanner.nextInt();
    scanner.close();

    double z = Math.sqrt(x*x + y*y);
    
    JOptionPane.showMessageDialog(null,"Hypotenus is "+z);
  }
}