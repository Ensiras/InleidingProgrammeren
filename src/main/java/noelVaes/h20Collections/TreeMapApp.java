package noelVaes.h20Collections;

import java.util.NavigableMap;
import java.util.TreeMap;

import static noelVaes.h20Collections.Person.Gender.FEMALE;
import static noelVaes.h20Collections.Person.Gender.MALE;

// Using map: inserting, getting, iterating through, navigating.
public class TreeMapApp {
    public static void main(String[] args) {
        NavigableMap<String, Person> personMap = new TreeMap<>();

        Person bert = new Person("Bert", 45, MALE, 66);
        Person lisa = new Person("Lisa", 55, FEMALE, 80);
        Person geert = new Person("Bert", 55, MALE, 55);
        Person jacco = new Person("Jacco", 103, MALE, 99);
        Person grietje = new Person("Grietje", 25, FEMALE, 130);
        Person berlinda = new Person("Berlinda", 55, FEMALE, 80);

        personMap.put(bert.getName(), bert);
        personMap.put(lisa.getName(), lisa);
        personMap.put(geert.getName(), geert);
        personMap.put(jacco.getName(), jacco);
        personMap.put(grietje.getName(), grietje);
        personMap.put(berlinda.getName(), berlinda);

        for (String s : personMap.keySet()) {
            Person person = personMap.get(s);
            System.out.println(person);
        }

//        Getting a specific entry with key
        Person person = personMap.get("Grietje");
        System.out.println(person);

//        Printing first and last key
        System.out.println(personMap.firstKey());
        System.out.println(personMap.lastKey());

//        Printing first and last key-value pair
        System.out.println(personMap.firstEntry());
        System.out.println(personMap.lastEntry());
    }
}
