package h7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PersonTest {

    @Test
    public void testPerson() throws PersonDiedException {
        Person p1 = new Person("Jan", 45, Gender.MALE);
        Person p2 = new Person("Jan", 46, Gender.MALE);
        Person p3 = new Person("Rita", 60, Gender.MALE);
        System.out.println(p1.getGender());
        p1.setGender(Gender.MALE);
        p2.setGender(Gender.MALE);
        p3.setGender(Gender.FEMALE);

        System.out.println(p1.getGender());
        p1.haveBirthday(); // person gets one year older
        System.out.println(p1.getAge());
        System.out.println(Person.numberOfPossibleGenders);
        System.out.println(p1);

        int hashP1 = p1.hashCode();
        int hashP2 = p2.hashCode();
        int hashP3 = p3.hashCode();
        System.out.println("P1: " + hashP1 + " P2: " + hashP2 + " P3: " + hashP3);

    }

    @Test(expected = PersonDiedException.class)
    public void testOldPerson() {
        Person p = new Person("Piet", 130, Gender.MALE);
        p.haveBirthday();
    }

    @Test
    public void thesePeopleAreDifferent() {
        Person p1 = new Person("Jan", 55, Gender.MALE);
        Person p2 = new Person("Grietje", 77, Gender.MALE);
        boolean result = p1.equals(p2);
        assertEquals(result, false);
    }

    @Test
    public void thesePeopleAreEqual() {
        Person p1 = new Person("Jan", 45, Gender.MALE);
        Person p2 = new Person("Jan", 45, Gender.MALE);
        boolean result = p1.equals(p2);
        assertEquals(result, true);
    }

    @Test
    public void hashCodesAreEqual() {
        Person p1 = new Person("Jan", 45, Gender.MALE);
        Person p2 = new Person("Jan", 45, Gender.MALE);
        int hash1 = p1.hashCode();
        int hash2 = p2.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void hashCodesAreNotEqual() {
        Person p1 = new Person("Jan", 45, Gender.MALE);
        Person p2 = new Person("Greet", 55, Gender.MALE);
        int hash1 = p1.hashCode();
        int hash2 = p2.hashCode();
        assertNotEquals(hash1, hash2);
    }

    @Test
    public void printFieldsAndMethodsOfClass() {
        Person p1 = new Person("Jan", 45, Gender.MALE);
        try {
            p1.printFieldsAndMethods();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Oh nee!");
        }
    }
}