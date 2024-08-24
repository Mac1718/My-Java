package Practice;
import java.util.Scanner;
public class Star 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No Of Stars to print");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int row =6;
        for( a=row;a<row;a--)
        {
            for( b=0;b<=a;b--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
