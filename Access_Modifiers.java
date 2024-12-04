// Main class to demonstrate access modifiers
public class Access_Modifiers {
    public static void main(String[] args) {
        AccessExample example = new AccessExample();

        // Accessing public members
        System.out.println("Public Variable: " + example.publicVariable);
        example.publicMethod();

        // Accessing protected members
        System.out.println("Protected Variable: " + example.getProtectedVariable());
        example.callProtectedMethod();

        // Accessing private members - only via getters/setters
        System.out.println("Private Variable (via getter): " + example.getPrivateVariable());
        example.setPrivateVariable(50);
        System.out.println("Private Variable (after setter): " + example.getPrivateVariable());
    }
}

// A class with different access modifiers
class AccessExample {
    // Public: Accessible from anywhere
    public int publicVariable = 10;

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Protected: Accessible within the same package and subclasses
    protected int protectedVariable = 20;

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Private: Accessible only within the class
    private int privateVariable = 30;

    // Getter and Setter for privateVariable
    public int getPrivateVariable() {
        return privateVariable;
    }

    public void setPrivateVariable(int privateVariable) {
        this.privateVariable = privateVariable;
    }

    // Methods to access protected members indirectly
    public int getProtectedVariable() {
        return protectedVariable;
    }

    public void callProtectedMethod() {
        protectedMethod();
    }
}
