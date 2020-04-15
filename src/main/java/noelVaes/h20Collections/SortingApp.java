package noelVaes.h20Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import static noelVaes.h20Collections.Person.Gender.FEMALE;
import static noelVaes.h20Collections.Person.Gender.MALE;

// Various ways of sorting a collection
public class SortingApp {

    public static void main(String[] args) {

//        Using intrinsic sorting (class needs to implement Comparable)
//        Set<Person> personSet = new TreeSet<>();

//        Using instance of AgeComparator
//        AgeComparator ac = new AgeComparator();
//        Set<Person> personSet = new TreeSet<>(ac);

        // Using anonymous nested class
//        Set<Person> personSet = new TreeSet<>(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return Integer.compare(o1.getWeight(), o2.getWeight());
//            }
//        });

//        Anonymous nested class replaced with lambda expression:
//        Set<Person> personSet = new TreeSet<>((person1, person2) -> person1.getWeight() - person2.getWeight());

//        Lambda using comparingInt function of Comparator class
//        Set<Person> personSet = new TreeSet<>(Comparator.comparingInt(p -> p.getWeight()));

//        Method reference instead of lambda:
//        Set<Person> personSet = new TreeSet<>(Comparator.comparingInt(Person::getWeight));

//        Reversing natural order (using compareTo of Person class):
//        Set<Person> personSet = new TreeSet<>(Comparator.reverseOrder());

//        Ordering multiple times, taking into account previous one:
        Set<Person> personSet = new TreeSet<>(Comparator.comparing(Person::getName)
                .thenComparingInt(Person::getAge)
                .thenComparingInt(Person::getWeight));

        Person bert = new Person("Bert", 45, MALE, 66);
        Person lisa = new Person("Lisa", 55, FEMALE, 80);
        Person geert = new Person("Bert", 55, MALE, 55);
        Person jacco = new Person("Jacco", 103, MALE, 99);
        Person grietje = new Person("Grietje", 25, FEMALE, 130);
        Person berlinda = new Person("Berlinda", 55, FEMALE, 80);

        personSet.add(bert);
        personSet.add(lisa);
        personSet.add(geert);
        personSet.add(jacco);
        personSet.add(grietje);
        personSet.add(berlinda);

        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}
