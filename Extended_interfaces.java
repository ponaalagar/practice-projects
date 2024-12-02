class Extended_interfaces{
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
        obj.nothing();
    }
}

interface A{
    void show();
}

interface B extends A{
    void display();
    void nothing();
}

class C implements B{
    public void show(){
        System.out.println("show");
    }
    public void display(){
        System.out.println("display");
    }
}

class D implements B{
    public void nothing(){-
        System.out.println("nothing");
    }
}