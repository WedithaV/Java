public class ObjectExplain{
  public static void main(String[] args){
    Car myCar = new Car();

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

class Car{
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