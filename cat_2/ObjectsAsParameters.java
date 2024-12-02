

class test{
    int a;
    test(int a){
        this.a = a;
    }
    void modify(test obj){
        obj.a += 10;
    }
}

public class ObjectsAsParameters {
    public static void main(String[] args) {/*...*/
    test o = new test(20);
    System.out.println(o.a);
    o.modify(o);
    System.out.println(o.a);
    }

}

