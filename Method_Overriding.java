class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
}
//Method overriding allows a subclass to provide a specific implementation of a method in the parent class
