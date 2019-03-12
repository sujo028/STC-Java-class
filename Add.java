import java.util.Scanner;

public class Add{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Enter 1st numbers:");
        a=input.nextInt();
        System.out.print("Enter 2nd numbers:");
        b=input.nextInt();
        System.out.println("Sum="+(a+b));

    }
}