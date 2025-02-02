public class StringBuilderr {
    public static void main(String[] args){
        //Not threadsafe
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println(sb1);
    }
}
