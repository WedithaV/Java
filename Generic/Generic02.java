package Generic;

public class Generic02 {
    public static void main(String[] args){
        Printer1 <Cat> obj1 = new Printer1<>(new Cat());
        Printer1 <Dog> obj2 = new Printer1<>(new Dog());
        obj1.display();
        obj2.display();
    }
}

class Printer1 <T extends Animal>{
    T dtx;
    public Printer1(T dtx){
        this.dtx = dtx;
    }
    public void display(){
        dtx.display();
    }
}

class Animal{
    public void display(){
        System.out.println("Animal");
    }
}

class Cat extends Animal{
    public void display(){
        System.out.println("Cat");
    }
}

class Dog extends Animal{
    public void display(){
        System.out.println("Dog");
    }
}