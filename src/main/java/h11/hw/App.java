package h11.hw;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Bert", 34);
        p1.addHistory("Maandag, 30-03: Bert ging naar de supermarkt, niemand hield 1,5 meter afstand.");
        p1.addHistory("Dinsdag, 31-03: Bert heeft honger want hij durft niet meer naar de supermarkt.");
        p1.printHistory();
        Human sH = p1.createSubHuman();
        System.out.println(sH.greet());
    }
}
