public class InterfaceWithVariable {
    public static void main(String[] args) {
        System.out.println(Animal.DEFAULT_NAME);
        Animal.makeSound();

    }
    
}

interface Animal {
    // Constant
    String DEFAULT_NAME = "Unknown";
   
    // Abstract method
    void eat();

    // Default method
    default void sleep() {
        System.out.println("Zzz...");
    }

    // Static method
    static void makeSound() {
        System.out.println("Animal makes a sound");
    }
}