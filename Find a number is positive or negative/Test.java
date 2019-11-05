// positive or negative integer
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        int a;
        System.out.println("enter a number");
        Scanner a1 = new Scanner(System.in);
        a =a1.nextInt();
        System.out.println("________________");
        
        if(a==0)
        {
        System.out.println(a+" is neutral ");    
        }
        else if(a>0)
        {
        System.out.println(a+" is positive integer");    
        }
        
        else if(a<0)
        {
        System.out.println(a+" is negative integer");   
        }
    }
}