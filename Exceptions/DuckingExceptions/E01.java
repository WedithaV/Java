package Exceptions.DuckingExceptions;

public class E01 {
    public static void main(String[] args){
        Child2 obj = new Child2();
        try{
            obj.display();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class Parent1{
    public void display(){
        System.out.println("parent");
    }
}

class Child1 extends Parent1{
    public void display() throws IOException{
        System.out.println("Child1");
    }
}

class Child2 extends Parent1{
    public void display() throws ArithmeticException{
        System.out.println("Child2");
    }
}
