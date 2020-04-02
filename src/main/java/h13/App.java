package h13;

public class App {

    public static void main(String[] args) {
        HouseFactory hf = new HouseFactory();

        Android a = new Android(90);
        Person p = new Person("Bert", 34);
        Teacher t = new Teacher("Jannie", 65);
        Employee e = new Employee("Berend", 55);
        String s = "blablalba";

        House<Android> houseA = hf.createHouse(a);
        House<Person> houseP = hf.createHouse(p);
        House<Teacher> houseT = hf.createHouse(t);
        House<Employee> houseE = hf.createHouse(e);

        System.out.println(houseA.toString());
        System.out.println(houseP.toString());
        System.out.println(houseT.toString());
        System.out.println(houseE.toString());

    }
}
