class A{
  public void method1(){
    System.out.println("Hello world");
  }

  public void method2(){
    System.out.println("A");
  }
}

class B extends A{
  public void method2(){
    System.out.println("B"); //Method Overriding
  }
}

public class MethodOverriding {
  public static void main(String[] args){
    A a = new A();
    B b = new B();

    a.method1();
    a.method2();
    b.method2(); // Overrided method

  }
}





