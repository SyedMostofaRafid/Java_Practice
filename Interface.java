interface Animal {
    void eat();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog shouts Wofffffff.");
    }
}
public class Interface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
    }
}
//An interface defines a contract that implementing classes must fulfill