//Find duplicate number in array
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
       int i,j;
        String[] a ={"a","b","c","a","b","h","f","c"};
        for(i=0;i<a.length-1;i++)
        {
           
            for(j=i+1;j<a.length;j++)
            {
               
                if((a[i].equals(a[j])&&(i!=j)))
                {
                    System.out.println( "the duplicate element is "+a[j]);
                }
            }
        }
    }
}