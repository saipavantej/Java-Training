// fibonacci series with recursion
import java.util.Scanner;
class Test
    
{
    static int fib (int n)
    {
        if(n==0)
            
        {
            return 0;
        }
    if(n==1 || n==2)
    {
       return 1;
        
    }
        return fib(n-2)+fib(n-1);
    }
    
    public static void main(String args[])
    {
        int a,i;
        System.out.println("enter the range ");
        Scanner a1= new Scanner(System.in);
        a =a1.nextInt();
        for(i=0;i<a;i++)
        {
        System.out.print(fib(i)+" ");
        }
    }
    
}