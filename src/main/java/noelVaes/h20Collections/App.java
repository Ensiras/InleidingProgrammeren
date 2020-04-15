package noelVaes.h20Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

import static noelVaes.h20Collections.Person.Gender.FEMALE;
import static noelVaes.h20Collections.Person.Gender.MALE;

// Using queue and deque
public class App {

    public static Deque<Person> persons = new ArrayDeque<>();

    public static void main(String[] args) {

        // Note in this case that BurgerOrder has to implement Comparable.
        // Using LinkedList would result in a list ordered by insertion.
        Queue<BurgerOrder> queue = new PriorityQueue<>();
        queue.add(new BurgerOrder("Bert", 101));
        queue.add(new BurgerOrder("Lisa", 102));
        queue.add(new BurgerOrder("Geert", 103));
        queue.add(new BurgerOrder("Jacco", 104));
        queue.add(new BurgerOrder("Grietje", 105));
        queue.add(new BurgerOrder("Berlinda", 106));

        handleOrders(queue);

        add(new Person("Bert", MALE));
        add(new Person("Lisa", FEMALE));
        add(new Person("Geert", MALE));
        add(new Person("Jacco", MALE));
        add(new Person("Grietje", FEMALE));
        add(new Person("Berlinda", FEMALE));

        makePairs();

    }

    // Peek: get next value. Poll: get next value and remove it from queue.
    public static void handleOrders(Queue<BurgerOrder> orders) {
        BurgerOrder order = orders.peek();
        while (order != null) {
            System.out.println("Next order");
            order = orders.poll();
            System.out.println("Order handled: " + order);
            order = orders.peek();
        }
    }

    // Deque: approachable from begin and end.
    public static void add(Person person) {
        if (person.getGender().equals(MALE)) {
            persons.offerFirst(person);
        } else {
            persons.offerLast(person);
        }
    }

    public static void makePairs() {
        while (!persons.isEmpty()) {
            Person man = persons.pollFirst();
            Person woman = persons.pollLast();
            System.out.println(man + " is paired up with: " + woman + ".");
        }
    }
}
