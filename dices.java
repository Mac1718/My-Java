import java.util.*;
class dices
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=1;i<=6;i++)
        {
            if(n-i<=6)
            {
                System.out.println("("+i+","+(n-i)+")");
                count++;
            }
        }
        System.out.print(count);
    }
}