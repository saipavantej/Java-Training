// factorial od a number 
import java.util.Scanner;
class Test
{
    public static void main (String args[])
    {
        int a,i,fact=1;
        System.out.println("Enter the number ");
        Scanner a1 = new Scanner(System.in);
        a =a1.nextInt();
        for(i=1;i<=a;i++)
        {
            fact =fact*i;
        }
        
        System.out.println("the factorial of "+a +" is "+fact);
    }
}