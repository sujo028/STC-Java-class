interface Parent1{
    default void car()
    {
        System.out.println("Audi cAr!!");
    }
}
interface Parent2{
    default void car(){
        System.out.println("Maruthi CAr!!");
    }
}
public class Interface implements Parent1,Parent2
{
    public void car()
    {
        Parent1.super.car(); 
        Parent2.super.car();
    }
    public static void main(String[] args) {
    Interface ob=new Interface();
    ob.car();
    }
}