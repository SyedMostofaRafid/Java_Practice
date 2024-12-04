class Animal {
    void sleep() {
        System.out.println("Parent Class: Sleeping");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Inherited Class: Barking...");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep(); // Inherited method
        dog.bark();  // Parent method
    }
}
