public class StaticKeyword2 {
    public static void main(String[] args){
        MobilePhone.displayType();

        MobilePhone obj1 = new MobilePhone("Apple", 10000);
        MobilePhone.displayInstanceVariables(obj1);
    }
}


class MobilePhone{
    String model;
    int prize;
    static String type = "Smart phone";

    MobilePhone(String model, int prize){
        this.model = model;
        this.prize = prize;
        //type = "Smart Phone";
    }

    public void dtx(){
        System.out.println("Instance Method");
        displayType();  //can access static mehtods
    }

    public static void displayType(){
        System.out.println("Type is "+type);
        //dtx();  cannot directly access instance methods
    }

    public static void displayInstanceVariables(MobilePhone obj){
        System.out.println("model = "+obj.model+"  "+"pize = "+obj.prize);
        obj.dtx();
    }
}
