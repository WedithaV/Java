public class Enumm{
    public static void main(String[] args){
        Status s1 = Status.success;
        System.out.println(s1);

        System.out.println();

        Status[] ss = Status.values();
        for(Status a : ss){
            System.out.println(a+"\t"+a.ordinal());
        }

        System.out.println();
        //if statement
        if(s1 == Status.success){
            System.out.println("Success");
        }
        else if(s1 == Status.failed){
            System.out.println("Failed");
        }
        else if(s1 == Status.pending){
            System.out.println("Pending");
        }
        else{
            System.out.println("Invalid Status");
        }

        System.out.println();
        //Switch case 

        switch(s1){
            case success:
            System.out.println("Done");
            break;
            case failed:
            System.out.println("Not Done");
            break;
            case pending:
            System.out.println("Please Wait");
            break;
            default:
            System.out.println("Invalid Status");
            break;
        }
    }
}

enum Status{
    success,failed,pending
}