package Exceptions.DuckingExceptions;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class E02 {
    public static void main(String[] args){

    }
}


class Parent2{
    public void display() throws ArithmeticException{
        System.out.println("Parent2");
    }
}

class Child3 extends Parent2{
    public void display(){
        System.out.println("Child 3");
    }
}



class Parent3{
    public void display() throws IOException{
        System.out.println("Parent3");
    }
}

class Child4 extends Parent3{
    public void display() throws Exception{
        System.out.println("Child 4");
    }
}
