import java.util.Random;

public class random_numbers {
 public static void main(String[] args){
  Random random = new Random();

  int x = random.nextInt();
  System.out.println(x);

  int y = random.nextInt(7); //To get random numbers between 0-6
  System.out.println(y);

  double z =random.nextDouble();
  System.out.println(z);
 } 
}
