// length of a string
import java.util.Scanner;
class Test
{
   public static void main(String args[])
   {
       String a,b;
     
       
       System.out.println("enter the string");
       Scanner a1 = new Scanner(System.in);
       a =a1.nextLine();
    
       System.out.println("...............\n The length of the string  including space's is "+ a.length());
       
       b =a.replace(" ","");
      
        System.out.println("...............\n The length of the string without including space's is "+ b.length());
   }
}
