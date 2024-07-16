abstract class Car
{
    abstract public void  drive();
    public void playmusic()
    {
        System.out.println("Music Playing");
    }
}
class Bmw extends Car
{
    public void drive()
    {
        System.out.println("Driving");
    }
}

public class AbstractKeyword 
{
    //WE CANNOT CREATE A OBJECT FOR AN ABSTRACT CLASS 
    //
    public static void main(String[] args)
    {
        Bmw obj=new Bmw();
        obj.drive();
        obj.playmusic();

    }    
}
