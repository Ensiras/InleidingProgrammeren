package noelVaes.h20Collections;

public class BurgerOrder implements Comparable<BurgerOrder>{
    private String name;
    private int number;

    public BurgerOrder(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Number: " + number;
    }

    // CompareTo needed for PriorityQueue.
    @Override
    public int compareTo(BurgerOrder o) {
        String name1 = this.getName();
        String name2 = o.getName();
        return name1.compareTo(name2);
    }
}
