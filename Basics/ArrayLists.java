package Basics;
import java.util.ArrayList;
import java.util.*; // For 2D arraylists

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
    System.out.println(numbers);

    numbers.set(0,0); // change elements
    System.out.println(numbers);

    numbers.remove(2); // remove items
    System.out.println(numbers);
    System.out.println();

    /*-------------------------------------------------------------------------------*/

    // 2D ArrayList

    ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

    ArrayList<String> vegetableList = new ArrayList<String>();
    vegetableList.add("Pumkin");
    vegetableList.add("Beans");
    vegetableList.add("carrot");

    ArrayList<String> sweetList = new ArrayList<String>();
    sweetList.add("cake");
    sweetList.add("watalappan");
    sweetList.add("Keju");

    ArrayList<String> drinkList = new ArrayList<String>();
    drinkList.add("Cocacola");
    drinkList.add("Pepsi");

    groceryList.add(vegetableList);
    groceryList.add(sweetList);
    groceryList.add(drinkList);

    System.out.println(groceryList); // Access full  2D arraylist
    System.out.println(groceryList.get(1)); //Acess sub ArrayList
    System.out.println(groceryList.get(0).get(0)); // Access an Element

    // Do not want to add the same number of elements as the other arraylists
    
  }
}
