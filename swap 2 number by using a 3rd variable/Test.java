//Swap 2 Numbers By Using A 3rd Variable
import java.util.Scanner;
class Test 
{
    public static void main(String args[])
    {
        int a,b,c;
        System.out.println("enter the first number ");
        Scanner a1 = new Scanner(System.in);
        a = a1.nextInt();
        
        System.out.println("enter the second number ");
        Scanner b1 = new Scanner(System.in);
        b = b1.nextInt();
        System.out.println(a+" "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("__________________________");
        System.out.println(a+" "+b);
    }
}