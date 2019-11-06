// a string is palindrome or not
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        String a,rev ="",temp;
        int i;
        System.out.println("Enter the text");
        Scanner a1 = new Scanner(System.in);
        a = a1.nextLine();
        temp =a;
        System.out.println("___________________");
        for(i = a.length() -1 ; i>=0;i--)
        {
          rev =rev + a.charAt(i);   
        }
        if(temp.equals(rev))
        {
           System.out.println(temp +" is a palindrome");
        }
        else
        {
            System.out.println(temp +" is not a palindrome");
        }
    }
}