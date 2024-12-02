

public class VarArgs {
    public static void main(String[] args) {/*...*/
    argTester obj = new argTester();
        obj.display(1,2,3,4,5,6,7,8,9,10);
    }
}

class argTester{
    void display(int ... n)
    {
        for(int i : n)
        {
            System.out.println(i);
        }
    }
}