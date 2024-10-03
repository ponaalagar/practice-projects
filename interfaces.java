interface callback {
    void callback(int result);
}

abstract class add implements callback {
    
    public void callback(int result) {
        System.out.println("The sum is " + result);
    }
}
class interfaces {
    public static void main(String [] args) {
        add a = new add();
        int sum = 5 + 6;
        a.callback(sum);
    }
}