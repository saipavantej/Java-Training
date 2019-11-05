// largest of 3 numbers 
import java.util.Scanner;
class Test
{
public static void main(String args[])
{
    
    int a,b,c;
    
    System.out.println("enter the First number");
    Scanner a1 = new Scanner(System.in);
    a =a1.nextInt();
    
    System.out.println("enter the Second number");
    Scanner b1 = new Scanner(System.in);
    b =b1.nextInt();
    
    System.out.println("enter the Third number");
    Scanner c1 = new Scanner(System.in);
    c =c1.nextInt();
    
if(a>b && a>c)
{
     System.out.println( a +" is greater");
}
     else if (b>a && b>c)
     {
    System.out.println( b +" is greater");
     }
    
    else if (c>a && c>b)
    {
    System.out.println( c +" is greater");    
    }
}

}

