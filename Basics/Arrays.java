package Basics;
public class Arrays {
  public static void main(String[] args){
    // 1D ARRAYS

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

    // 2D Arrays

    // Method 1
    String[][] letters = new String[3][3];

    letters[0][0] = "A";
    letters[0][1] = "B";
    letters[0][2] = "C";
    letters[1][0] = "D";
    letters[1][1] = "E";
    letters[1][2] = "F";
    letters[2][0] = "G";
    letters[2][1] = "H";
    letters[2][2] = "I";

    for(int i = 0; i < letters.length; i++){
      System.out.println();
      for(int j = 0; j < letters[i].length; j++){
        System.out.print(letters[i][j]+"\t");
      }
    }

    //Method 2

    System.out.println();
    int[][] numbers = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                        };

    for(int i = 0; i < numbers.length; i++){
      System.out.println();
      for(int j = 0; j < numbers[i].length; j++){
        System.out.print(numbers[i][j]+"\t");
      }
    }
  }
}
