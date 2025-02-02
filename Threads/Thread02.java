package Threads;

public class Thread02 {
    public static void main(String[] args){
        Runnable objA = new A();
        Runnable objB = new B();

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();
    }
}

class A implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hi");
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hello");
        }
    }
}
