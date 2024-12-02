public class InterfaceCurrency {
    
}
public interface Currency {
    String symbol = "$";
    double Inr_to_usd(double amt);
    double Inr_to_eur(double amt);
}

class A implements Currency{
    doble Inr_to us(double amt){
        return amt/75;
    }
}