class Bank{
    int getInrest()
    {
        return 0;
    }
}


class SBI extends Bank{
    int getInrest()
    {
        return 3;
    }
}

class ICICI extends Bank{ 
    int getInrest()
    {
        return 5;
    }
}



public class Polymorphism{
    public static void main(String[] args) {
      
    Bank ob;
    ob=new SBI();
    System.out.println("Interest rate of SBI");
    System.out.println(ob.getInrest());
   
    ob=new ICICI();
    System.out.println("Interest rate of ICICI");
    System.out.println(ob.getInrest());
   }
}
