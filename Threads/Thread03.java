package Threads;

public class Thread03 {
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();
        Runnable objA = () ->{
            for(int i = 0; i < 1000; i++){
                c.counter();
            }
        };
        Runnable objB = () ->{
            for(int i = 0; i < 1000; i++){
                c.counter();
            }
        };

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}

class Counter{
    public int count;
    public  synchronized void counter(){
        count++;
    }
}

