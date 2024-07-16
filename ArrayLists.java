/*import java.util.Scanner;
import java.util.*;
public class Main
{
    public static void main(String[] a)
    {
        ArrayList<Integer> str = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        Java obj=new Java();
        obj.print();

        
        while(true)
        {
            int choice =sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter Element");
                int b=sc.nextInt();
                str.add(b);
                System.out.println("Successfully added");
            }
             else if (choice ==2)
            {
                System.out.println("Enter Element to remove");
                int c=sc.nextInt();
                if(str.contains(c))
                {
                    str.remove(c);
                }
                System.out.println("Enter Valid Elements");
            }
             else if(choice ==3)
            {
                System.out.println("Now Showing...: "+str);
            }
            else
            {
                System.out.println("BYE...");
                break;
            }
        }
    }
}
class Java 
{
    public void print()
    {
        System.out.println("1.Add Element");
        System.out.println("2.Remove Element");
        System.out.println("3.Show Elements");
        System.out.println("4.Exit");
        System.out.println("Enter your Choice");
    }
}*/