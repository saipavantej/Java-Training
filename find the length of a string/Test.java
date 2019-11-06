// length of a string
import java.util.Scanner;
class Test
{
   public static void main(String args[])
   {
       String a;
       int r;
       
       System.out.println("enter the string");
       Scanner a1 = new Scanner(System.in);
       a =a1.next();
       r = a.length();
       System.out.println("...............\n The length of the string  including space's is "+ r);
 
   }
}
