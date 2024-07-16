
public class Exceptions 

{
    /*TYPES OF ERRORS
    1.COMPILE TIME ERRORS
    2.RUN TIME ERRORS
    3.LOGICAL ERRORS */   

    public static void main(String[] args)
    {
        int i=10;
        int j=0;
        int a[]=new int[5];
        java.lang.String b="null";
        try 
        {
             j=i/j;
             System.out.println(a[5]);
             System.out.println(b.length());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Errod Occured in array" + e);
        }
        catch(Exception e)
        {
            System.out.println("Errod Occured" + e);
        }
        System.out.println(j);
    }
}
