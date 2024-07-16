/*import java.util.Scanner;
public class String
{
    //STRING IS BASICALLY A CLASS SO WE INITIALIZE IT WITH CAPITAL LETTER

    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String a=sc.nextLine();
        
        System.out.println("Hello I Am " + a);
    }
}*/
  //---------------------------------------------------------------------------------
                     //MUTABLE VS IMMUTABLE STRING
    

    //IN HEAO MEMORY THERE IS A SPECIAL PLACE CALLED STRING CONSTANT  POOL WHERE ALL THE CREATED STRING NAMES GET 
    //STORED AND IT CANNOT BE CHANGED ONCE CREATED.


    //MUTTABLE-SOMETHING THAT CAN BE CHANGED
    //IMMUTABLE -THAT CANNOT BE CHANGED 
    //STRING ARE IMMUTABLE DEFAULTLY
    //-----------------------------------------------------------------------------------
                   //STRING BUFFER & STRING BUILDER-EG FOR MUTABLE STRING 

//  STRING BUFFER IS THREAD SAFE WHEREAS STRING BUILDER IS NOT . . . .
public class String
{
       public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("Mac");
        sb.append(" Here");
        System.out.println(sb);
    }
}
