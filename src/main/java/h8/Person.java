package h8;

import java.lang.reflect.*;

public class Person {

    public Person(String inName, int inAge) {
        this(inName, inAge, Gender.UNKNOWN);
    }

    public Person(String inName, int inAge, Gender inGender) {
        setName(inName);
        setAge(inAge);
        setGender(inGender);
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

    public void haveBirthday() {
        if (age > MAXAGE - 1) {
            throw new PersonDiedException();
        }
        age++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.age + ") is " + this.gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return  false;
        }

        Person p2 = (Person) obj;
        return this.name.equals(p2.name) && this.age == p2.age && this.gender.equals(p2.gender);
    }

    @Override
    public int hashCode() {
        return age * name.hashCode() * gender.hashCode();
    }

    public void printFieldsAndMethods() throws ClassNotFoundException {
        Class c = Class.forName("h7.Person");
        Method[] personMethods = c.getDeclaredMethods(); // Kan ook: Method[] personMethods = Person.class.getDeclaredMethods();
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
}
