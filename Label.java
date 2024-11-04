/*
In Java, labels are used with loops or statements to control the flow of code.

Labels allow you to "label" a specific block and jump directly to it using break
or continue.

This feature is especially useful with nested loops, as it lets you specify 
exactly which loop to break out of or continue.

A labeled break can exit an outer loop from within a nested loop, which a regular 
break cannot accomplish.

A labeled continue allows skipping to the next iteration of an outer loop directly,
bypassing intermediate nested loops.
*/
public class Label {
  public static void main(String[] args){
    outerLoop1:
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println("i = " + i + ", j = " + j);
            if (i == 1 && j == 1) {
                break outerLoop1; // Exits the outer loop
            }
        }
    }
    System.out.println("Exit 1");


    outerLoop2:
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i == 1 && j == 1) {
                continue outerLoop2; // Skips to the next iteration of the outer loop
            }
            System.out.println("i = " + i + ", j = " + j);
        }
    }
    System.out.println("Exit 2");


  }
}
