package Basics;
public class Methods {
  public static void main(String[] args){

    hello("Weditha");
    System.out.println(add(9,1));
  }

  static void hello(String name){
    System.out.println("Hello "+name);
  }

  static int add(int a,int b){
    return a+b;
  }
}
