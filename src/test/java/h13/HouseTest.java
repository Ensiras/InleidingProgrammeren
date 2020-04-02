package h13;

import org.junit.jupiter.api.Test;

import static h13.Gender.MALE;
import static org.assertj.core.api.Assertions.assertThat;


class HouseTest {
    Person p = new Person("Bert", 45, MALE);
    Android a = new Android(90);
    Employee e = new Employee("Jannie", 33);
    Teacher t = new Teacher("Berend", 55);

    @Test
    void whenCreatingHouseWithPersonToStringShouldGive() {
        House<Person> houseP = new House<>(p);
        String houseInfo = houseP.toString();
        assertThat(houseInfo)
                .contains("Bert")
                .contains("45")
                .contains("MALE")
                .startsWith("This house is owned by ")
                .endsWith(houseP.getOwner().greet());
    }
}