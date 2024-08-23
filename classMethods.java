import java.util.Scanner;

//simple interest and compound interest
//si=pnr/100
//ci=p(1+r/n)^nt

public class classMethods {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        interest i=new interest();
        System.out.print("enter the principal amount");
        i.principal = sc.nextFloat();
        System.out.print("enter the rate of interest");
        i.rate = sc.nextFloat();
        System.out.print("enter the time");
        i.time = sc.nextFloat();
        float result = simpleInterest;
        System.out.println("simple interest is "+result);


    }
    
}
class interest{
    float principal;
    float rate;
    float time;
    float simpleInterest(float principal , float rate,float time){
        return (principal*rate*time)/100;

    }

}