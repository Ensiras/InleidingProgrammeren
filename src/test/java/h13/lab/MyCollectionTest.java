package h13.lab;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyCollectionTest {

    @Test
    void whenAddingFifthElementArrayShouldExtend() {
        MyCollection<Integer> collection = new MyCollection<>();
        int collectionLength;

        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);

        collectionLength = collection.getLength();
        assertThat(collectionLength)
                .isNotNull()
                .isEqualTo(8);
    }

    @Test
    void whenInstantiatedMyCollectionLengthShouldBe4() {
        MyCollection<String> collection = new MyCollection<>();
        int collectionLength = collection.getLength();

        assertThat(collectionLength).isEqualTo(4);

    }

    @Test
    void whenAddingXAmountOfElementsArrayShouldKeepExtending() {
        MyCollection<Integer> collection = new MyCollection<>();
        int collectionLength;
        int itemsAdded = 500;

        for (int i = 0; i <= itemsAdded; i++) {
            collection.add(i);
        }
        collectionLength = collection.getLength();
        assertThat(collectionLength)
                .isGreaterThanOrEqualTo(itemsAdded)
                .isLessThan(itemsAdded*2)
                .isNotNull();
    }
}