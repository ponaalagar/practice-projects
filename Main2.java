class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Animal myDog = new Animal();
        myDog.sound(); // Calls the overridden method in Dog (Output: Dog barks)
    }
}
