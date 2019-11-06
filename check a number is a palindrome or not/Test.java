//number is a palindrome or not
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        int a,rev=0,temp;
        System.out.println("enter the number");
        Scanner a1 = new Scanner(System.in);
        a =a1.nextInt();
        temp =a;
      
        while(a>0)
        {
            rev = rev *10;
            rev = rev +a%10;
            a =a/10;
        }
         if(temp ==rev)
         {
        System.out.println(temp+" is a palindrome");     
         }
         else if(temp !=rev)
         {
        System.out.println(temp+" is not a palindrome");     
         }
            
    }
}