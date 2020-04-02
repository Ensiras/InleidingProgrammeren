package h13;


public class House <P extends Human> {

    private P owner;

    public House(P owner) {
        this.owner = owner;
    }

    public P getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        String message = "This house is owned by " + owner.toString() + " and it says: " + owner.greet();
        return message;
    }
}
