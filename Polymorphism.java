public class Polymorphism{
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.show();

        animal = new Dog(); //This can be done only to subclasses .must have inheritence
        animal.show();

        animal = new Cat();
        animal.show();
    }
}

class Animal{
    public void show(){
        System.out.println("In animal");
    }
}

class Dog extends Animal{
    public void show(){
        System.out.println("In dog");
    }
}

class Cat extends Animal{
    public void show(){
        System.out.println("In cat");
    }
}