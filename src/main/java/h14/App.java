package h14;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Bert", 34);
        p1.addHistory("Maandag, 30-03: Bert ging naar de supermarkt, niemand hield 1,5 meter afstand.");
        p1.addHistory("Dinsdag, 31-03: Bert heeft honger want hij durft niet meer naar de supermarkt.");
        p1.printHistory();
        Human sH = p1.createSubHuman();
        System.out.println(sH.greet());

        //HashSet stuff
        Set<Person> personSet = new HashSet<>();
        Person p2 = new Person("Bert", 34);
        Person p3 = new Person("Linda", 44);
        Person p4 = new Person("Arnold", 77);
        Person p5 = new Person("Bert", 77);
        Person p6 = new Person("Jacob", 44);

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);
        personSet.add(p6);

        print(personSet);

        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1f);

        System.out.println("Printing hashmap: ");
        HashMap<String, Person> personHashMap = new HashMap<>();
        personHashMap.put(p2.getName(), p2);
        personHashMap.put(p3.getName(), p3);
        personHashMap.put(p4.getName(), p4);
        personHashMap.put(p6.getName(), p6);
        personHashMap.forEach((k, v) -> System.out.println(v));
    }

    public static void print(Set<?> printSet) {
        for (Object o : printSet) {
            System.out.println(o);
        }
    }
}
