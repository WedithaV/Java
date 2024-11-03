public class Constructor {
  public static void main(String[] args){
    //constructor =  constructor is a specila method type which has no return type
    //It helps to create objects with different attributes
    Human human1 = new Human("Weditha",24,76);
    Human human2 = new Human("Kivindu",18,80);

    System.out.println(human1.name);
    System.out.println(human2.name);
    System.out.println();
    human1.drink();
    human2.eat();
  }
}

class Human{
  String name;
  int age;
  double weight;

  Human(String name, int age, double weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  void eat(){
    System.out.println(this.name+" is eating");
  }
  void drink(){
    System.out.println(this.name+" is drinking");
  }
}
