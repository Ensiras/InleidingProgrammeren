package h14.lab;


import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        MyCollection<String> stringMyColl = new MyCollection<>();
        stringMyColl.add("Een");
        stringMyColl.add("Twee");
        stringMyColl.add("Drie");
        stringMyColl.add("Vier");
        stringMyColl.add("Vijf");
        stringMyColl.add("Zes");

        List<String> stringList = new ArrayList<>();
        stringList.add("Een");
        stringList.add("Twee");
        stringList.add("Zesendertig");
        stringList.add("Zes");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(34);
        integerList.add(55);
        integerList.add(66);

        // Copying contents into smaller array
        String[] strings = new String[3];
        strings = stringMyColl.toArray(strings);

        // Copying contents into larger array
        String[] stringsBig = new String[25];
        stringsBig = stringMyColl.toArray(stringsBig);

        // Testing whether array is empty
        boolean empty = stringMyColl.isEmpty();

        // Testing whether contains all elements of another collection
        boolean containsAll = stringMyColl.containsAll(stringList);

        // Adding all elements from one collection to another
        stringMyColl.addAll(stringList);
//        stringMyColl.addAll(integerList); Illegal, has to be type Collection <? extends String>

        // Removing an object
        stringMyColl.remove("Drie");

        System.out.println("Before retainAll: ");
        for (String s : stringMyColl) {
            System.out.println(s);
        }

        // Retain only elements contained in another collection
        // TODO more tests: what if collection is smaller, very large, same size, contains different types, doubles, etc.
        stringMyColl.retainAll(stringList);
        System.out.println("After retainAll: ");
        for (String s : stringMyColl) {
            System.out.println(s);
        }

        // Removing all elements contained in another
        stringMyColl.removeAll(stringList);

        // Clearing entire collection
        stringMyColl.clear();


    }
}
