package h13;

public class HouseFactory {

    /*<P extends Human> : indicates that this method will use a parameterized type
    In this case this type is only used to make variable the return type and
    is not used in the method body (only implicitly in House<>(owner)).
    Additionally, it functions as a check for making sure the House being
    returned and the owner being 'used' to construct
    it are the same and both are subclasses of human. */
    public <P extends Human> House<P> createHouse(P owner) {
        return new House<>(owner);
    }
}
