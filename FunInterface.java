/*@FunctionalInterface            //-- A FUNCTIONAL INTERFCAE IS USED WHEN ONLY ONE METHOD IS DEFINED IN A INTERFACE.
interface A
{
     int add(int i,int j);
}

public class FunInterface 
{
    public static void main(String [] args)
    {
        A obj =new A()
        {
            public int add(int i,int j)
            {
                return i+j;
            }
        } ;
        
        int result=obj.add(4, 3);
        System.out.println(result);
    }     
}*/
