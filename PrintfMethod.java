public class PrintfMethod {
  public static void main(String[] args){
    //printf() = an optional mehtod to control,format, and display text to the console window

    // Conversion Characters

    boolean myBoolean = true;
    System.out.printf("AAAAA %b AAAAA",myBoolean);
    System.out.println();

    int myInteger = 1;
    System.out.printf("AAAA %d AAAA",myInteger);
    System.out.println();

    char myChar = 'w';
    System.out.printf("AAAA %c AAAA",myChar);
    System.out.println();

    String myString = "Weditha";
    System.out.printf("AAAA %s AAAA",myString);
    System.out.println();

    float myFloat = 0.2f;
    System.out.printf("AAAA %f AAAA",myFloat);
    System.out.println();

    Double myDouble = 343434.334344;
    System.out.printf("AAAA %f AAAA",myDouble);
    System.out.println();

    //-------------------------------------------------------------------

    // Width
    String name = "Bro";
    System.out.printf("My name is %s *",name); //Normal
    System.out.println();
    System.out.printf("My name is %10s*",name); //align to the right side
    System.out.println();
    System.out.printf("My name is %-10s*",name); //align to the left side
    System.out.println();

    //Precision
    double x = 1.23456;
    System.out.printf("%f",x); //Normal
    System.out.println();
    System.out.printf("%.2f",x); //Rounded
    System.out.println();

    //Flags
    int y = 100000;
    System.out.printf("%,d",y);
    System.out.println();
    System.out.printf("%010d",y);
    System.out.println();
    System.out.printf("-%d",y);
    System.out.println();
    System.out.printf("+%d",y);
    System.out.println();



  }
}
