/*
In Java, varargs (variable-length arguments) let a method accept a flexible number of arguments.

You declare varargs by adding ... after the type, like int... numbers.

Inside the method, varargs act like an array, so you can loop through the arguments as needed.

Varargs must be the last parameter in a method, and only one varargs parameter is allowed per method.

Varargs are useful for methods like sum(int... numbers), where you can pass any number of integers, including none at all.
*/


public class Varags{

  static void sum(int...numbers){
    int summation = 0;
    for(int i = 0; i < numbers.length; i++){
      summation = summation + numbers[i];
    }
    System.out.println(summation);
  }

  static void students(int classroom,String...names){
    System.out.print(classroom+"\t");
    for(int i = 0; i < names.length; i++){
      System.out.print(names[i]+"\t");
    }
  }

  public static void main(String[] args){
    sum();
    sum(1,2);
    sum(1,2,3,4,5,6,7,8,9);
    students(5,"Weditha","Vishwa");
  }
}
