class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John");
        System.out.println("Employee Name: " + emp.getName());
    }
}
//Encapsulation restricts direct access to fields by using getters and setters