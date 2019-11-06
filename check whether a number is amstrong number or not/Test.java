//check whether a number is amstrong number or not
import java.util.Scanner;
import java.lang.Math;
class Test
{
    public static void main(String args[])
    {
        int a ,b,temp,n=0,result=0;
        System.out.println("enter the number");
        Scanner a1 = new Scanner(System.in);
        a =a1.nextInt();
        temp =a;
        System.out.println("----------------------");
        while(temp!=0)
        {
            temp =temp/10;
            n++;
        }
        temp =a;
        while(temp!=0)
        {
            b=temp%10;
            temp=temp/10;
            result += Math.pow(b,n);
        }
        if(a==result)
        {
            System.out.println(a+" is an amstrong number");
        }
        else
        {
          System.out.println(a+" is not an amstrong number");  
        }
        
    }
}