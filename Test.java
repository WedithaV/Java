public interface A {
  public void display();
  public void dtx();  
}

class B implements A{
  public void display(){
    System.out.println("A");
  }
  public void dtx(){
    System.out.println("fkdjf");
  }
}
public class Test{
  public static void main(String[] args){
    A a = new B();
  }
}