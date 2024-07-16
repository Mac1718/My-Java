/*public class Throw 
{
    public static void main(String[] args) 
    {
        int i=20;
        int j=18;
        try
        {
            i=j/i;
            if(i==0)
            throw new ArithmeticException();
        }    
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception..."+e);
        }
    }       
}*/
//---------------------------------------------------------------------------------------------------------------
class MacException extends RuntimeException
{
    public  MacException(java.lang.String s)
    {
        super(s);
    }
}
    public class Throw
    {                                                           //CUSTOM EXCEPTION
        public static void main(String[] args)
        {
            int i=18;
            int j=20;
            java.lang.String k ="MAC"
            try
            {
                i=i/j;
                if(i==0)
                {                
                    throw new MacException("Dont want to print 0 ");
                }
            }
            catch(MacException e)
            {
                System.out.println("Exception Caught");
            }
        }
    }
//--------------------------------------------------------------------------------------------------------