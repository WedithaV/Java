public class UpcastingDownCasting{
    public static void main(String[] args){
        
        X obj = (X) new Y();  //upcasting, this is not nessasry its happen implicitly

    //  obj.display2();  Cannot access . because class X not contains display2();
    
    //  Y obj2 = obj;   Demotion can not done .to do that we have to use downcasting

        Y obj2 = (Y) obj; //downcasing
        obj2.display1();
        obj2.display2();
    }
}

class X{
    public void display1(){
        System.out.println("X");
    }
}

class Y extends X{
    public void display2(){
        System.out.println("Y");
    }
}