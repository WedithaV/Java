public class WrapperClasses {
  public static void main(String[] args){

    /*Wrapper class = provides a way to use primitive data types as reference data types
     * reference data types can contain useful methods
     * can be used with collections (ex. ArrayList)
     * 
     * Disatvantage = access time  primitive < wrapperclass, reference
    */

    //Primitive   //Wrapper
    //---------   ---------
    //boolean     Boolean
    //char        Character
    //int         Integer
    //double      Double

    //autoboxing = automatic conversion of a primitive to a corresponding wrapper object
    //unboxing = automatic conversion of a wrapper object back to its primitive form

    Boolean a = true; //autoboxing

    if(a == true){  //unboxing
      System.out.println("True");
    }

  }
}
