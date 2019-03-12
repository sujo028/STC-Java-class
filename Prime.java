public class Prime{
    public static void main(String[] args) { int flag;
        for(int i=2;i<=100;i++)
        {  flag=0;
            for(int j=1;j<=i;j++)
            {  if(i%j==0)
                {
                 flag++;
                }

            }   
           if(flag==2)
           System.out.println(i); 
        }
    }
}