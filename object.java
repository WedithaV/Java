public class object{
  public static void main(String[] args){
    car myCar = new car();

    String a = myCar.brand;
    int b = myCar.year;
    double c = myCar.prize;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    myCar.drive();
    myCar.stop();

  }
}

class car{
  String brand = "Benz";
  int year = 2020;
  double prize = 1000000.00;

  void drive(){
    System.out.println("Drive");
  }
  void stop(){
    System.out.println("Stop");
  }
}