// find the sum of all digits
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        int a,b,r=0;
        System.out.println("Enter the number");
        Scanner a1 =new Scanner(System.in);
        a =a1.nextInt();
        System.out.println("--------------------------");
        while (a>0)
        {
            b =a%10;
            a =a/10;
            r = r+b;
            
        }
        
        System.out.println("Thes sum of all digits is "+r);
    }
}