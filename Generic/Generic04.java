package Generic;
import java.util.ArrayList;
import java.util.List;

public class Generic04{
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();
        myList.add(3434);
        printList(myList);
    }

    public static void printList(List<?> myList){
        System.out.println(myList);
    }
}