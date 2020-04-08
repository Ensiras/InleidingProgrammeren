package h13.lab;

public class ArrayApp {
    public static void main(String[] args) {
        MyCollection<Integer> array = new MyCollection<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(55);

        array.print();

        MyCollection<String> stringArray = new MyCollection<>();
        stringArray.add("Een");
        stringArray.add("Twee");
        stringArray.add("Drie");
        stringArray.add("Vier");
        stringArray.add("Vijf");
        stringArray.add("Zes");

        stringArray.print();

    }
}
