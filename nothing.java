
import java.util.Scanner;
class nothing{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the name");
        String name=scanner.nextLine();
        System.out.println("enter the age:");
        int age=scanner.nextInt();
        System.out.println(" "+name+age);
    }
}