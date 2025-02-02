package Threads;

public class Thread01 {
    public static void main(String[] args){
        A objA = new A();
        B objB = new B();
        System.out.println(objA.getPriority());
        objA.setPriority(10);
        objA.start();
        try{
            Thread.sleep(5);
        }
        catch(Exception e){
            System.out.println(e);
        }
        objB.start();
        
    }
}


class A extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
