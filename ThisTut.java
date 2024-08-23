class ThisTut{
    void m(ThisTut obj)
    {
        System.out.println("method invoked");
    }
    void p()
    {
        m(this);
    }
    public static void main(String[] args) {
        ThisTut obj = new ThisTut();
        obj.p();
    }
}