public class Enumm3 {
    public static void main(String[] args){
        Color c1 = Color.Red;
        c1.display();
    }
}

enum Color{
    Red{
        public void display(){
            System.out.println("Red");
        }
    },
    Yellow{
        public void display(){
            System.out.println("Yellow");
        }
    },
    White{
        public void display(){
            System.out.println("White");
        }
    };

    public abstract void display();
}
