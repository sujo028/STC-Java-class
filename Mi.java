class A{
    public void Car()
    {
        System.out.println("Audi car!!");
    }
}
class B extends A
{
     void Car()
    {
        System.out.println("Duke bike!!");
    }
}
class C extends B{
 void Cycle()
    {
        System.out.println("Cycle!!");
    }
}
public class Mi{
    public static void main(String[] args) {
        C ob=new C();
        ob.Car();
       ob.Car();
        ob.Car();
    }
}