package noelVaes.h20Collections;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private Gender gender;
    private int weight;

    // CompareTo needed to enable use in sorted collections
    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

    enum Gender { MALE, FEMALE};

    public Person(String name, Gender gender) {
        this(name, 0, gender, 0);
    }

    public Person(String name, int age, Gender gender) {
        this(name, age, gender, 0);
    }

    public Person(String name, int age, Gender gender, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + ", " + this.gender + ", " + this.weight + "kg.";
    }
}
