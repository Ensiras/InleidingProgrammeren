package h10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void personGreetShouldReturnHelloMyNameEtc() {
        Person p = new Person("Bert", 44);
        String result = p.greet();
        assertEquals("Hello my name is Bert. Nice to meet you!", result);
    }

    @Test
    void androidGreetShouldReturnOnlyHalfEtc() {
        Android a = new Android(70);
        String result = a.greet();
        assertEquals("I'm only half human, but human still... My energy level is 70%.", result);
    }

    @Test
    void employeeGreeting() {
        Employee e = new Employee("Hannes", 56);
        String result = e.greet();
        assertEquals("I'm tired of working. This is inhuman!", result);
    }

    @Test
    void teacherGreeting() {
        Teacher t = new Teacher("Juliana", 60);
        String result = t.greet();
        assertEquals("Hello my name is Juliana. Nice to meet you!", result);
    }

    @Test
    void androidChargeSuccess() {
        Android a = new Android(70);
        a.charge(30);
        assertEquals(a.getLevel(), 100);
    }

    @Test
    void androidChargeFailure() {
        Android a = new Android(70);
        assertThrows(LevelTooHighException.class, () -> a.charge(31));
    }
}