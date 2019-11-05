// prime number or not 
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
    int a,i,count=0;
        System.out.println("enter the number");
        Scanner a1 = new Scanner(System.in);
        a =a1.nextInt();
        System.out.println("----------------");
        
        if(a<=0)
        {
            System.out.println(" enter the non zero positive integer");
        }
        else
        {
            for(i=2;i<a;i++)
            {
              if(a%i==0) 
              {
                 count++; 
              }
                 
            }
            
            
            if(count==0)
            {
                System.out.println(a+" is a prime number");
            }
            else if (count >0)
            {
                System.out.println(a+" is not a prime number");
            }
        }
    }
}