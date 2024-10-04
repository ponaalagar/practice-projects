import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String args[]) {
        System.out.println("Enter the amount in rupees");
        Scanner sc = new Scanner(System.in);
        double rupees = sc.nextDouble();
        
        IndianRupee converter = new IndianRupee();
        System.out.println("in USD = " + converter.ToUSD(rupees));
        System.out.println("in EUR = " + converter.ToEUR(rupees));
    }    
}

interface Currency {
    double ToUSD(double rupees);
    double ToEUR(double rupees);
}

class IndianRupee implements Currency {
    private double usdRate = 0.013; 
    private double eurRate = 0.011; 

    public double ToUSD(double amount) {
        return amount * usdRate;
    }

    public double ToEUR(double amount) {
        return amount * eurRate;
    }
}
