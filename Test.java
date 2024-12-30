public class Test{
  public static void main(String[] args){
    loopContinue:
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        if(j == 1){
          continue loopContinue;
        }
        System.out.println("i = "+i+" "+"j = "+j);
      }
    }
  }
}