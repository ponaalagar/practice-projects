class ThisTut{
    void m()
    {
        System.out.println("method invoked");
    }
    void p()
    {
        m();
    }
    public static void main(String[] args) {
        ThisTut obj = new ThisTut();
        obj.p();
    }
}