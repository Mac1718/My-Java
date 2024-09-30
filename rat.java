import java.util.*;
public class rat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit  = sc.nextInt();
        int n  = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            sum = sum+a;
            arr[i] = sum;
        }
    if(n==0)
    {
        System.out.println(-1);
    }
    else if(sum<(unit*r))
    {
        System.out.println(0);
    }
    else
    {
        int m = 0;
        for(int i = 0; i < n; i++) 
        {
            if(arr[i]>=(unit*r))
            break;
        }
        System.out.println(i+1);
    }
    }
}
