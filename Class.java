class Animal {
    String name;

    void eat() {
        System.out.println(name + " Meowwwwwww........");
    }
}
public class Class {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Cat: ";
        cat.eat();
    }
}
