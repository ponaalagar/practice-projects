import java.util.Scanner;
public class Rectangle {
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       area a=new area();
       System.out.print("enter the value of x:");
       a.length= sc.nextInt();
       System.out.print("enter the value of  y:");
       a.breadth= sc.nextInt();
       double y=a.product();
       System.out.println(y);
    }
    
    
}
class area{
    int length;
    int breadth;
    double product()
    {
        return length*breadth;
    }
}
