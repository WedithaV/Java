package Generic;

public class Generic01{
    public static void main(String[] args){
        Printer <Integer> obj1 = new Printer <> (23);
        obj1.display();

        Printer <String> obj2 = new Printer <> ("Hello");
        obj2.display();
    }
}

class Printer <T>{
    T thingToChange;
    public Printer(T thingToChange){
        this.thingToChange = thingToChange;
    }

    public void display(){
        System.out.println(thingToChange);
    }
}