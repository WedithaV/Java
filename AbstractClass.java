/*
 * When there is an abstract method in a class ,that class also should be an abstract class.
 * But it is not must to have abstract methods in an abstract class. it can be only have normal methods.
 * abstract methods should be declare using inherite concrete class . in the first inherite class all abstract methods should be declared.
 * objects cannot be create using abstract classes. but we can use them as reference type .
 */

public class AbstractClass {
    public static void main(String[] args){
        //Car obj = new Car();  cannot create objects from abstract classes
        //WagonR obj = new WagonR();

        Car obj = new UpdatedWagonR(); //But can use as reference type

        obj.drive();
        obj.fly();
        obj.playMusic();
    }
}

abstract class Car{
    public abstract void drive();

    public abstract void fly();

    public void playMusic(){
        System.out.println("Music playing");
    }
}

abstract class WagonR extends Car{   //All the abstract methods are not declared in this class. So this is also an abstract class
    public void drive(){
        System.out.println("Driving");
    }
}

class UpdatedWagonR extends WagonR{
    public void fly(){
        System.out.println("Flying");
    }
}






