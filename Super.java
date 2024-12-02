class Parent{
    String noice = "from parent";
}

class Child extends Parent{
    String noice = "from child";
    void displaY(){
        System.out.println(noice); //from child
        System.out.println(super.noice); //from parent
    }
}

public class Super{
    public static void main(String[] args) {
        Child c = new Child();
        c.displaY();
    }
}