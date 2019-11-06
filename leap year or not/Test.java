// leap year or not
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        int a;
        System.out.println("enter the year");
        Scanner a1 = new Scanner(System.in);
        a =a1.nextInt();
        System.out.println("---------------------");
        if(a%4==0 || a%400 ==0 && a%100 !=0 )
        {
        System.out.println( a+" is a leap year");  
        }
        else
        {
        System.out.println( a+" is not a leap year");     
        }
        
            
    }
}
