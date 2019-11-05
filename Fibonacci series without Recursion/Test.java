//fibonacci series without Rcursion
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        int range,i,n1=0,n2=1,n3;
        System.out.println("Enter the range ");
        Scanner a1 =new Scanner(System.in);
        range =a1.nextInt();
        System.out.println("___________________");
        for(i=1;i<=range;i++)
        {
          
            System.out.print(" "+n1);
            n3 =n1+n2;
            n1 =n2;
            n2 =n3;
        }
    }
}
