package h14.lab;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection<E> implements Collection<E> {

    private Object[] collection;
    private int index;
    private int size;

    public MyCollection() {
        this.collection = new Object[4];
        this.index = 0;
        this.size = this.collection.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        // simplified if statement, because length != 0, returns false:
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object object : collection) {
            if (object == null) {
                return false;
            }
            if (object.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    // Inner class for custom iterator
    private class MyIterator implements Iterator<E> {
        private int index;

        @Override
        public boolean hasNext() {
            for (int i = index; i < collection.length; i++) {
                if (collection[i] != null) {
                    index = i;
                    return true;
                }
            }
            return false;
        }

        @Override
        @SuppressWarnings("unchecked")
        public E next() {
            for (int i = index; i < collection.length; i++) {
                if (collection[i] != null) {
                    return (E) collection[index++];
                }
            }
            return null;
        }
    }

    @Override
    public Object[] toArray() {
        Object[] tempArr = new Object[size];
        System.arraycopy(collection, 0, tempArr, 0, size);
        return tempArr;
    }

    // Take the contents, length of MyCollection and runtime class of parameter and copy
    // collections to a new array of parameter type. Cast it to generic array to comply
    // with return type.
    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        /* The if is needed in order to return an array of the right size.
        In case 'a' is smaller than collection, a new array has to be created.
        In case 'a' is larger than collection, the latter's contents have to be copied to 'a'.
        Otherwise 'a' would always become the size of collection (so 'a' would be truncated).
        */
        if (a.length < this.size) {
            return (T[]) Arrays.copyOf(collection, size, a.getClass());
        }
        System.arraycopy(collection, 0, a, 0, this.size);
        return a;
    }

    public boolean add(E input) {
        if (index >= collection.length) {
            System.out.println("Array is full, extending array.");
            Object[] tempArr = saveOld();
            extend(tempArr);
        }

        this.collection[index] = input;
        index++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < collection.length; i++) {

            if (collection[i].equals(o)) {
                collection[i] = null;
                for (int m = i; m < size() - 1; m++) {
                    collection[m] = collection[m + 1];
                }
                return true;
            }
        }
        return false;
    }

    // Stolen from Vector
    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E o : c) {
            add(o);
            return true;
        }
        return false;
    }

    // Does not remove duplicate elements
    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object o : c) {
            remove(o);
            return true;
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {

        // First check if any elements will be retained
        for (int i = 0; i <= size; i++) {
            if (i == size) {
                return false;
            }
            if (c.contains(collection[i])) {
                break;
            }
        }
        // Conserve the appropriate elements
        return retainFromCollection(c);
    }

    public boolean retainFromCollection(Collection<?> c) {
        Object[] tempArr = new Object[size];
        int tempIndex = 0;
        for (int i = 0; i < size; i++) {
            if (c.contains(collection[i])) {
                tempArr[tempIndex] = collection[i];
                tempIndex++;
            }
        }
        collection = tempArr;
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size(); i++)
            if (collection[0] != null) {
                remove(collection[0]);
            }
    }

    private Object[] saveOld() {
        return toArray(collection);
    }

    private void extend(Object[] tempArr) {
        this.size *= 2;
        index = 0;
        this.collection = new Object[size];
        for (int i = 0; i <= tempArr.length - 1; i++) {
            collection[i] = tempArr[i];
            index++;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            if (collection[i] == null) {
                break;
            }
            System.out.println(collection[i]);
        }
    }

}
