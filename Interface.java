interface Car{
    int num = 45; // default static final
    void drive();
    void fly();
}

abstract class A implements Car{
    public void drive(){
        System.out.println("Driving...");
    }
}

class B extends A{
    public void fly(){
        System.out.println("Flying");
    }
}

public class Interface{
    public static void main(String[] args){
        Car obj = new B();
        obj.drive();
        obj.fly();
        System.out.println(Car.num); // can access using interface name cause static
    }
}