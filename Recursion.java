class Factorial {
    int calculate(int n) {
        if (n <= 1) {
            return 1; // Base case
        }
        return n * calculate(n - 1); // Recursive call
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int number = 5;
        System.out.println("Factorial of " + number + ": " + factorial.calculate(number));
    }
}
