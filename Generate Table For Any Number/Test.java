// Generate table for any number
import java.util.Scanner;
class Test 
{
    public static void main(String args[])
    {
    int a,i;
        System.out.println("Enter the tables number");
            Scanner a1 = new Scanner (System.in);
            a = a1.nextInt();
         System.out.println("---------------------------");
        for(i=1;i<=10;i++)
        {
           System.out.println(i+ " * "+a +" = " +(i*a)); 
        }
    }
}