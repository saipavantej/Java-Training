// swap 2 numbers without using a 3rd variable
import java.util.Scanner;
class Test 
{
    public static void main (String args[])
    {
     int a,b;
        System.out.println(" enter the first number ");
        Scanner a1 = new Scanner(System.in);
        a = a1.nextInt();
        
        System.out.println(" enter the second number ");
        Scanner b1 = new Scanner(System.in);
        b = b1.nextInt();
        System.out.println(a+ " " +b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("----------------------------");
        System.out.println(a+ " " +b);
        
    }
}