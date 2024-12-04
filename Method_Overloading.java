class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}
public class Method_Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (int): " + calc.add(3, 5));
        System.out.println("Sum (double): " + calc.add(3.5, 4.5));
    }
}
//Method overloading occurs when multiple methods have the same name but different parameters