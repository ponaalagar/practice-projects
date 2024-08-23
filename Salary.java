import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        details d = new details();
        d.getinfo();
        float val=d.compute();
        System.out.println("Your net-salary is: "+val);
    }
    
}
class details{
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    float basepay;
    float HRA;
    float DA;
    float deduction;
    float netpay;
    void getinfo()
    {
        System.out.println("enter name :");
        name=sc.nextLine();
        System.out.println("enter age :");
       age=sc.nextInt();

       System.out.println("enter basepay :");
        basepay=sc.nextFloat();
        System.out.println("enter HRA :");
        HRA=sc.nextFloat();
        System.out.println("enter DA :");
        DA=sc.nextFloat();
        System.out.println("enter deduction :");
        deduction=sc.nextFloat();

    }
    float compute()
    {
        return basepay+DA+HRA-deduction;
    }
}