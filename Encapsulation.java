public class Encapsulation {
  public static void main(String[] args){
    HumanBeing human = new HumanBeing();

    System.out.println(human.getAge());
    System.out.println(human.getName());

  }
}

class HumanBeing{
  private int age = 24;
  private String name = "Weditha";

  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age = age;
  }

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

}
