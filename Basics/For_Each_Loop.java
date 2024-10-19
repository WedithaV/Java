package Basics;
import java.util.ArrayList;
import java.util.*;

public class For_Each_Loop {
  public static void main(String[] args){
    String[] names = {"Weditha","Vishwa","Prabhath"};

    for(String i : names){
      System.out.println(i);
    }
    System.out.println();

    ArrayList<String> drinkList = new ArrayList<String>();
    drinkList.add("Cocacola");
    drinkList.add("Pepsi");
    drinkList.add("Stin");

    for(String i : drinkList){
      System.out.println(i);
    }
    System.out.println();
  }
}
