public class Enumm2 {
    public static void main(String[] args){
        Laptop l1 = Laptop.MacBook;
        Laptop l2 = Laptop.Asus;

        System.out.println(l1.getPrize());
        l2.setPrize(230);
        System.out.println(l2.getPrize());
    }
}

enum Laptop{
    MacBook(1000), Hp(800), Asus(900), Msi(850);
    
    private int prize;

    private Laptop(int prize){
        this.prize = prize;
    }

    public void setPrize(int prize){
        this.prize = prize;
    }

    public int getPrize(){
        return prize;
    }
}
