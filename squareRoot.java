class root{
    double num;
    double disp(){
        return Math.sqrt(num,0.5);
    }
    root(){
        double num=4;
    }
}

public class squareRoot {
    public static void main(String[] args) {
        root r = new root();
        double res = r.disp();
        System.out.println("Square root of 4 is: "+res);

    }
    
}
