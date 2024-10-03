import java.util.Scanner;

public class Nested_interface {

    interface CheckNumber {
        interface NestedCheck {
            void check(int number);
        }
    }

    static class CheckNumberImpl implements CheckNumber.NestedCheck {
        @Override
        public void check(int number) {
            if (number > 0) {
                System.out.println(number + " is a positive number.");
            } else if (number < 0) {
                System.out.println(number + " is a negative number.");
            } else {
                System.out.println(number + " is zero.");
            }
        }
    }

    public static void main(String[] args) {
        CheckNumber.NestedCheck checker = new CheckNumberImpl();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checker.check(num); 
        
    }
}
