package inheritance;

public class Main {
  public static void main(String[] args){
    AdvCalc calculator = new AdvCalc();
    MoreAdvCalc moreCalculator = new MoreAdvCalc();

    System.out.println(calculator.add(1,2));
    System.out.println(calculator.sub(1,2));
    System.out.println(calculator.multi(4,5 ));
    System.out.println(calculator.div(5,2));

    System.out.println(moreCalculator.mod(10,3));

    
  }
}
