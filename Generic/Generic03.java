package Generic;

public class Generic03 {
    public static void main(String[] args){
        Printer2 obj = new Printer2();
        obj.display(23);
        obj.display(3.4,5);
    }
}

class Printer2{
    public <T> void display(T thingToChange){
        System.out.println(thingToChange);
    }

    public <T,V> void display(T t1, V t2){
        System.out.println(t1);
        System.out.println(t2);
    }
}


