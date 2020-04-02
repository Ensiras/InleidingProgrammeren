package h13;

public class HouseFactory {

    public <P extends Human> House<P> createHouse(P owner) {
        return new House(owner);
    }
}
