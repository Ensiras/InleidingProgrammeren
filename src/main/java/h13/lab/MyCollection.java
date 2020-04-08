package h13.lab;

public class MyCollection<E> {

    private Object[] collection;
    private int index;
    private int length;

    public MyCollection() {
        this.collection = new Object[4];
        this.index = 0;
        this.length = this.collection.length;
    }

    public void add(E input) {
        if (index >= collection.length) {
            System.out.println("Array is full, extending array.");
            Object[] tempArr = saveOld();
            extend(tempArr);
        }

        this.collection[index] = input;
        index++;
    }

    public int getLength() {
        return this.length;
    }

    private Object[] saveOld() {
        Object[] tempArr = new Object[length];
        System.arraycopy(collection, 0, tempArr, 0, length);
        return tempArr;
    }

    private void extend(Object[] tempArr) {
        length *= 2;
        index = 0;
        this.collection = new Object[length];
        for (int i = 0; i <= tempArr.length -1; i++) {
            collection[i] = tempArr[i];
            index++;
        }
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            if (collection[i] == null) {
                break;
            }
            System.out.println(collection[i]);
        }
    }

}
