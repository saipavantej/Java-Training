// reverse a number 
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        int a,rev=0;
        System.out.println(" enter the number");
        Scanner a1 = new Scanner(System.in);
        a =a1.nextInt();
        System.out.println("_________________");
        while(a>0)
        {
        rev=rev*10;
        rev = rev+a%10;
        a=a/10;    
            
        }
        System.out.println("The reverse of number is "+rev);
    }
}