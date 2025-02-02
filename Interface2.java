/*
 * Interface supports multiple interfaces
 * 
 * class - interface -> implements
 * interface - interface -> extends
 * class - class -> extends
 */
public class Interface2 {
    public static void main(String[] args){
        A obj1 = new Human();
    //  obj1.sleep();  //We can only access methods in A interface;
        obj1.eat();

        //To access both methods in human we have to implement reference variable using Human class
        Human human = new Human();
        human.eat();
        human.sleep();
        human.run();

        C obj2 = new Alien();
    //  obj2.trex();
        obj2.dtx();
    }
}

interface A{
    void eat();
    void run();
}

interface B{
    void sleep();
}

class Human implements A,B{   //We can use multiple interfaces
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void run(){
        System.out.println("Running");
    }
}

interface C{
    void dtx();
}

interface D extends C{
    void trex();
}

class Alien implements D{
    public void dtx(){
        System.out.println("dtx");
    }
    public void trex(){
        System.out.println("trex");
    }
}
