public class TypeCasting {
  public static void main(String[] args){
    /* There are two types of type castings
     * 1) implicit (widening/ numerical promotion)
     *    automatic
     * 
     *    int x = 10;
     *    double y = x;
     *    
     * 2) explicit (narrowing / numerical demotion)
     *    information lost happen
     *    manual
     * 
     *    double x = 2.34343;
     *    int y = (int)x;
    */

    int x = 10;
    double y = x;
    System.out.println(x+" "+y);

    double m = 1.233;
    int n = (int) m;
    System.out.println(m+" "+n);
  }
}
