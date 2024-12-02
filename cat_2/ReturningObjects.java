import cat_2.Outer.Inner;

public class ReturningObjects {
public static void main(String[] args) {/*...*/
    Test obj = new Test(-10);
    Test obj2 = obj.getnewtest(obj);
    System.out.println(obj2.a);
    Test.increment();
    System.out.println(Test.count);
    Outer ob = new Outer();
    Outer.Inner in = ob.new Inner();
    inclass Outer {
    int outerVar = 10;

    class Inner {
        void display() {
            System.out.println("Outer var: " + outerVar);
        }
    }
}
.display();
}
static{
    System.out.println("Static block");
}
}

class Test{
    int a;
    Test(int a){
        this.a = a;
    }

    Test getnewtest(Test obj)
    {
        return new Test(obj.a + 100);
    }

    static int count = 0;
    static void increment(){
        count++;
    }
}


class Outer {
    int outerVar = 10;

    class Inner {
        void display() {
            System.out.println("Outer var: " + outerVar);
        }
    }
}
