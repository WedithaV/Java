package Basics;
public class StringMethods{
  public static void main(String[] args){
    String sample = "Bro";

    boolean result = sample.isEmpty();
    System.out.println(result);

    result = sample.equals("bro");
    System.out.println(result);
    result = sample.equalsIgnoreCase("bro");
    System.out.println(result);

    int len = sample.length();
    System.out.println(len);

    char item = sample.charAt(1);
    System.out.println(item);

    int index = sample.indexOf("B");
    System.out.println(index);

    String change = sample.toLowerCase();
    System.out.println(change);
    change = sample.toUpperCase();
    System.out.println(change);

    String rep = sample.replace("o","*");
    System.out.println(rep);


  }
}