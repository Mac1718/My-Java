
/*interface A
{
    int age=23;
    java.lang.String name="Mahant";           //ALL THE VARIABLES IN THE INTERFACE IS BY DEFAULT STATIC & FINAL.
    void show();
    void add();
}
class B implements A
{
    public void show()
    {
        System.out.println("In the Show");
    }
    public void add()
    {
        System.out.println("Adding");
    }
}
public class Interface 
{
    public static void main(String[] args)
    {
    A obj;
    obj=new B();
    obj.show();
    obj.add();
    }
}*/
//-------------------------------------------------------------------


/*interface Computer
{
    void code();
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Coding...");
    }
}
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Lap Coding");
    }
}
class Developer
{
    public void DevApp(Computer m)
    {
        m.code();
    }
}
class Java
{
    public static void main(String[] args)
    {
        Desktop m=new Desktop();
        Laptop n=new Laptop();
        Developer mac=new Developer();
        mac.DevApp(m);
    }
}*/

//                               TYPES OF INTERFACE


                          //1.NORMAL INTERFACE

                        //IT CAN HAVE 2 OR MROE METHODS DEFINED IN IT.


                        //2.SAM[SINGLE ABSTRACT METHOD]/FUNCTIONAL INTERFACE

                        //IT ONLY HAS ONE METHOD DEFINED IN IT.

                        //3.MARKER INTERFACE

                        //IT HAS NO INTERFACE DEFINED IN IT INITIALLY.
