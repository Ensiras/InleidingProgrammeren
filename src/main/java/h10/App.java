package h10;

import java.util.ArrayList;
import java.util.List;

public class App {

    /* Main conclusion: while you can store objects from subclasses in their respective superclasses,
    * methods specific to those subclasses cannot be accessed. The other way around is possible, since all subclasses
    * will inherit from their superclasses (dependent on access modifiers a bit of course) */

    public static void main(String[] args) {

        // android1 is of type human so greet() can be called (implemented the abstract method), but charge() cannot
        Human android1 = new Android(70);
        System.out.println(android1.greet());

        // android2 is of type Android so charge() can be called.
        Android android2 = new Android(60);
        android2.charge(33);
        System.out.println(android2.greet());

        // person1 is of type Human so greet() can be called, but methods specific to Person cannot (like haveBirthday()).
        Human person1 = new Person("Bertus", 53);
        System.out.println(person1.greet());

        // teacher1 is of type Teacher, can call greet()
        Teacher teacher1 = new Teacher("Rudolf", 45);
        System.out.println(teacher1.greet());

        Person employee1 = new Employee("Gerda", 33);
        System.out.println(employee1.greet());

        List<Human> listOfHumans = new ArrayList<Human>();
        listOfHumans.add(android1);
        listOfHumans.add(person1);
        listOfHumans.add(teacher1);
        listOfHumans.add(employee1);


    }
}
