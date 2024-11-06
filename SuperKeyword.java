public class SuperKeyword {
  public static void main(String[] args){
    BB obj = new BB();
    obj.aa();
  }
}

// If can not understand watch telsko video about "Super and This"

class AA extends Object{ // All classes extended with Object .but it hidden
  public AA(){
    System.out.println("A default");
  }

  public AA(int a){
    System.out.println(a);
  }

  public void aa(){
    System.out.println("Method in A");
  }

}

class BB extends AA{
  public BB(){
    this(4);
    System.out.println("B default");
  }

  public BB(int b){
    
    System.out.println(b);
  }

  public void aa(){
    super.aa();
    System.out.println("Method in B");
  }
}
