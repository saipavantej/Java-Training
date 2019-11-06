//Find the number of digits in a number"
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        int a ,n=0,temp;
        System.out.println("enter the number");
        Scanner a1 =new Scanner(System.in);
        a =a1.nextInt();
        temp =a;
        while (temp!=0)
        {
            temp =temp/10;
            n++;
            
        }
        System.out.println("the number of digits in "+a +" is "+n );
        
    }
}