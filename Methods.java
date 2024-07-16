/*class Work
{
    public String getpen()
    {
        return "Pen";
    }
    public int add(int cost,int service)
    {                                               CREATION OF METHOD WITH IF CONDITION
        if(cost<2)
        {
            return 0;
        }
        else
        {
        int b=cost+service;
        return b;
        }
    }
}
public class Methods
{
    public static void main(String[] args)
    {
        Work obj=new Work();
      int result=obj.add(1,5);
        System.out.println(result);
    }    
}*/
//--------------------------------------------------------------------------------------------------
/*import java.util.Scanner;
class Calculator
{
    public int add(int n1,int n2)
    {
        return n1+n2;                                       METHOD OVERLOADING
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
}
class Methods
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Calculator obj=new Calculator();
        int r1=obj.add(a,b);
        System.out.println(r1);

    }
}*/

//------------------------------------------------------------------------------------
/*class Calculator
{
    public int add(int a,int b)
    {
        return a + b;
    }                                                   METHOD OVERRIDING
}
class AdvCalc extends Calculator
{
    public int add(int a,int b)
    {
        return a + b + 1;
    }
}
public class Methods
{
    public static void main(String[] args)
    {
        AdvCalc q=new q();
        int y=q.add(4,3);
        System.out.println(q);
    }
}*/