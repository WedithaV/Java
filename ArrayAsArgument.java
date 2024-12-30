public class ArrayAsArgument{
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        display(numbers);
    }

    public static void display(int[] array){
        for(int a : array){
            System.out.println(a);
        }
    }
}