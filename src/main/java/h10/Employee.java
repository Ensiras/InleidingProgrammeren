package h10;

public class Employee extends Person {

    public Employee(String inName, int inAge) {
        super(inName, inAge);
    }

    @Override
    public String greet() {
        return "I'm tired of working. This is inhuman!";
    }
}
