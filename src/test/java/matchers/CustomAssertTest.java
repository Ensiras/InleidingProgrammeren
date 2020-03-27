package matchers;

import org.junit.jupiter.api.Test;

import static matchers.IsABertAssert.assertThat;


class CustomAssertTest {
    Person p1 = new Person("Bert");
    Person p2 = new Person("Bertus");
    Person p3 = new Person("Rita");

    @Test
    void thisPersonShouldBeABert() {
        assertThat(p1).isABert();
    }

    @Test
    void thisPersonMightBeABert() {
        assertThat(p2).mightBeABert();
    }

    @Test
    void thisPersonIsNotABert() {
        assertThat(p3).isNotABert();
    }

    @Test
    void thisPersonIsABertButAssertionIsWrong() {
        assertThat(p1).isNotABert();
    }
}