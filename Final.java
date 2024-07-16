  final class Calc
{
    public void show()
    {
        System.out.println("By Mahant");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
//class AdvCalc extends Calc---IT SHOWS ERROER BECAUSE WE R INHERITING A FINAL CLASS.





public class Final
{
    //FINAL KEYWORD IS USED TO MAKE A TERM CONSTATNT.  
    //ONCE WE MAKE OUR CLASS FINAL IT CANNOT BE INHERITED. 
    //WHEN WE MAKE OUR METHOD FINAL METHOD OVERRIDING CAN BE STOPPED.

    public static void main(String a[])
    {
        Calc obj=new Calc();
        obj.show();
        obj.add(4,5);
    }
}
