// string reverse 
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {

        String a;
        String rev ="";
        int i;
        System.out.println("enter the text");
        Scanner a1 = new Scanner(System.in);
        a =a1.nextLine();
        System.out.println("------------------");
        for(i =a.length() -1;i>=0;i--)
        {
            rev = rev + a.charAt(i);
            
        }
        System.out.println("The reverse text is "+rev);
    }
}