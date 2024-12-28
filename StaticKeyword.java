/*
 * In Java, the static keyword makes a member (variable, method, block, or class)
 *  belong to the class itself rather than any specific instance of the class:

   Static Variables: Shared across all objects of the class. Only one copy exists.
   Example: static int count;.

   Static Methods: Can be called without creating an object of the class. 
   They can only directly access other static members(cannot access instance variables).
  Example: ClassName.methodName();.
*/
public class StaticKeyword{
  public static void main(String[] args){
    Friends.numOfFriends = 1; // can access without initiating a object
    Friends.display();

    Friends friend1 = new Friends();
    Friends friend2 = new Friends();
    friend1.addFriend("Weditha");
    Friends.display();
    friend2.addFriend("Vishwa");
    Friends.display();
    Friends.displayName(friend2);

  }
}

class Friends{
  String nameOfFriend;
  static int numOfFriends;

  void addFriend(String nameOfFriend){
    this.nameOfFriend = nameOfFriend;
    numOfFriends++;  //static variables can access within a instance method.
  }
  static void display(){
    System.out.println(numOfFriends);
//  System.out.println(nameOfFriend);  cannot access instances variables
  }

  //To access a instance variable in a static method .
  //We should pass the created object as a argument.
  static void displayName(Friends obj){
    System.out.println(obj.nameOfFriend);
  }
}