abstract class Shape {
    abstract void draw(); // Abstract method

    void description() { // Concrete method
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.description();
    }
}
//Abstraction hides implementation details and provides only essential features