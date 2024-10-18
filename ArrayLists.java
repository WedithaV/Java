import java.util.ArrayList;

public class ArrayLists {
  public static void main(String[] args){

    // 1D ArrayList

    /* a resizable array.
     * Elements can vve added and removed after compilation phase
     * store reference data types
    */

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    numbers.add(1); // Add elements
    numbers.add(2);
    numbers.add(3);

    for(int i = 0; i < numbers.size(); i++){  // in arraylists we use size() instead of length();
      System.out.print(numbers.get(i)+"\t");
    }
    System.out.println();

    numbers.set(0,0); // change elements
    for(int i = 0; i < numbers.size(); i++){
      System.out.print(numbers.get(i)+"\t");
    }
    System.out.println();

    numbers.remove(2); // remove items
    for(int i = 0; i < numbers.size(); i++){
      System.out.print(numbers.get(i)+"\t");
    }
    System.out.println();
  }
}
