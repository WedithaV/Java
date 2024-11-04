package Packages_Concept; //Because this file in a folder name "Packages_Concept"
import Packages_Concept.tools.Addition;
import Packages_Concept.tools.substraction.Subtraction;

public class Practice {
  public static void main(String[] args){
    Addition addition = new Addition();
    Subtraction subtraction = new Subtraction();

    addition.add(2,3);
    subtraction.sub(2,3);
  }
}
