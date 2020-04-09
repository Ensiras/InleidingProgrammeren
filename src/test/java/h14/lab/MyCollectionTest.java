package h14.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class MyCollectionTest {

    MyCollection<Integer> integers;

    @BeforeEach
    public void setUp() {
        integers = new MyCollection<>();
    }

    @Test
    void whenInstantiatedSizeShouldBe4() {
        assertThat(integers.size()).isEqualTo(4).isNotNull();
    }

    @Test
    void whenExceedingCurrentSizeArrayShouldGrow() {
        for (int i = 0; i <= 100; i++) {
            integers.add(i);
        }

        assertThat(integers.size()).isNotNull().isEqualTo(128);
    }

    @Test
    void whenSizeIsNot0ShouldReturnFalse() {
        boolean result = integers.isEmpty();
        assertThat(result).isFalse();
    }

    @Test
    void whenArrayIsClearedShouldReturnTrue() {
        integers.add(1);
        integers.add(2);
        integers.add(3);

        integers.clear();

        boolean result = integers.isEmpty();
        assertThat(result).isTrue().isNotNull();
    }

    @Test
    void whenArrayContainsGivenElementReturnTrue() {
        int given = 342;
        integers.add(342);

        boolean result = integers.contains(given);

        assertThat(result).isNotNull().isTrue();
    }

    @Test
    void whenArrayDoesNotContainGivenElementReturnFalse() {
        int given = 1312;
        integers.add(1313);
        integers.add(1311);
        integers.add(13);
        integers.add(12);

        boolean result = integers.contains(given);

        assertThat(result).isNotNull().isFalse();
    }

    @Test
    void whenCallingRemoveElementShouldBeRemoved() {
        integers.add(null);
        integers.add(145);
        integers.add(44);
        integers.add(33);

        integers.remove(44);
        boolean result = integers.contains(44);

        assertThat(result).isFalse();
    }

    @Test
    void whenRemovingDuplicateElementOnlyOneShouldBeRemoved() {
        integers.add(13);
        integers.add(33);
        integers.add(33);
        integers.add(324);

        integers.remove(33);

        assertThat(integers.size()).isEqualTo(3);
    }

    @Test
    void whenElementsOverlapRetainThem() {
        List<Integer> integerList = new ArrayList<>();
        integers.add(13);
        integers.add(33);
        integers.add(33);
        integers.add(324);

        integerList.add(123);
        integerList.add(33);
        integerList.add(3423);
        integerList.add(324);

        integers.retainAll(integerList);

        assertThat(integers.contains(33) && integers.contains(324)).isTrue();
    }

    @Test
    void whenNoElementsOverlapRetainNothing() {
        List<Integer> integerList = new ArrayList<>();
        integers.add(13);
        integers.add(33);
        integers.add(33);
        integers.add(324);

        integerList.add(12413);
        integerList.add(3311);
        integerList.add(3423);
        integerList.add(32324);

        integers.retainAll(integerList);

        assertThat(integers.isEmpty()).isTrue();
    }

}