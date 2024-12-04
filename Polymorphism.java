class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Cat(); // Polymorphic behavior
        animal.sound();
    }
}
//Polymorphism is achieved using method overriding
