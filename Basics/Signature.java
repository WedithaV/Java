package Basics;
public class Signature {
  public static void main(String[] args){
    /*
     * Method overloading refers to the ability to create multiple methods
     * with the same name but different parameter lists within the same class.
     * (Return type does not play a role in method overloading.
     * you cannot overload methods by changing only the return type)
     * 
     * overloaded methosds must have different signatures.
     * 
     * In a method signature we consider about the 
     * 1) Method name 
     * 2) Parameter list - number of parameters,order of parameters,type of parameters
     * (The method signature does not include the return type, 
     * access modifiers (public, private, etc.), or exceptions thrown by the method.)
     * 
     * By changing parameter list we can do the method overloading
     * (We have to use the same method name)
     * 
    */
    add(1,2);
    add(1,2,3);

    display("Weditha",24);
    display(19,"Kivindu");
  }

  static int add(int a,int b){
    System.out.println("Method overloading #1");
    return a+b;
  }
  static int add(int a,int b,int c){
    System.out.println("Method overloading #2");
    return a+b+c;
  }

  static void display(String name, int age){
    System.out.println("Method overloading #3");
    System.out.println("My name is "+name);
    System.out.println("My age is "+age);
  }
  static void display(int age, String name){
    System.out.println("Method overloading #4");
    System.out.println("My name is "+name);
    System.out.println("My age is "+age);
  }
}
