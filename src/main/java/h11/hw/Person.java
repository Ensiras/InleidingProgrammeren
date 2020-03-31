package h11.hw;


import h9.Gender;
import h9.PersonDiedException;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Person extends Human {

    public Person(String inName, int inAge, Gender inGender) {
        setName(inName);
        setAge(inAge);
        setGender(inGender);
    }

    public Person(String inName, int inAge) {
        this(inName, inAge, Gender.UNKNOWN);

    }

    private String name;
    private int age;
    private Gender gender = Gender.UNKNOWN;
    public static int numberOfPossibleGenders = Gender.values().length;
    private final int MAXAGE = 130;

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    private HistoryRecord[]  history = new HistoryRecord[100];

    private int historyCounter = 0;

    public void haveBirthday() {
        if (age > MAXAGE - 1) {
            throw new PersonDiedException();
        }
        age++;
    }

    private class HistoryRecord {
        String description;

        HistoryRecord(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public void addHistory(String description) {
        HistoryRecord hr = new HistoryRecord(description);
        history[historyCounter] = hr;
        historyCounter++;
    }

    public void printHistory() {
        for (int i = 0; i < historyCounter; i++) {
            System.out.println(history[i]);
        }
    }

    public Human createSubHuman() {
        Human subHuman = new Human() {
            @Override
            public String greet() {
                return "Sub is the best.";
            }
        };
        return subHuman;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.age + ") is " + this.gender;
    }

    @Override
    public boolean equals(Object obj) {
        Person p2 = (Person) obj;
        return this.name == p2.name && this.age == p2.age && this.gender == p2.gender;
    }

    @Override
    public int hashCode() {
        return age * name.hashCode() * gender.hashCode();
    }

    public void printFieldsAndMethods() throws ClassNotFoundException {
        Class c = Class.forName("h11.hw.Person");
        Method[] personMethods = c.getDeclaredMethods();
        Field[] personFields = c.getDeclaredFields();

        System.out.println("Methods: ");
        for (Method personMethod : personMethods) {
            System.out.println(personMethod.toString());
        }

        System.out.println("Fields: ");
        for (Field personField : personFields) {
            System.out.println(personField.toString());
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized called.");
        super.finalize();

    }

    @Override
    public String greet() {
        return "Hello my name is " + getName() + ". Nice to meet you!";
    }
}
