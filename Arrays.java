public class Arrays {
  public static void main(String[] args){
    // Method 1
    String[] cars = {"Tesla", "Benz", "BMW", "Audi"};
    for(int i = 0; i<cars.length; i++){
      System.out.println(cars[i]);
    }
    System.out.println();
    
    // Method 2
    String[] names = new String[3];
    names[0] = "Weditha";
    names[1] = "Vishwa";
    names[2] = "Prabhath";
    for(int i=0; i<names.length; i++){
      System.out.println(names[i]);
    }
  }
}
