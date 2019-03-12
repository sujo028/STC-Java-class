import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int a,rev=0,b;
        System.out.print("Enter a number");
        a=input.nextInt();
        while(a!=0)
        {
            b=a%10;
            rev=rev*10+b;
            a/=10;
        }
        System.out.println("Reverse of the number:"+rev);
    }
} 