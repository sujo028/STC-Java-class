public class Constructur{
    int a;
    Constructur(){
        System.out.println("Constructur come in.");
        a=100;
    }
    public static void main(String[] args) {
        Constructur ob=new Constructur();
        System.out.println(ob.a);
    }
}