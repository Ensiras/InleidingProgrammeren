package h13.genericsTests;

import h13.House;

import java.util.*;

public class ArrayOf {

    // Example of instantiating an array of a parameterized type.
    public static void main(String[] args) {
        Object[] objs = new Data<?>[2];
        objs[0] = new Data<String>(); // you have allowed this
        objs[1] = new Data<Integer>();


//        Illegal: only unbound wildcard is allowed when instantiating an array of a parameterized type
//        Object[] objs2 = new Data<? extends Number>[2];
        System.out.println(objs[0]);

        List<String> strings = new ArrayList<>();
        strings.add("ABC");
        strings.add("DEF");
        ArrayOf.printList(strings);

        List<Integer> integers = new ArrayList<>();
        integers.add(456);
        integers.add(3000);
        ArrayOf.printList(integers);

    }

    // Iterating through and printing a list of any type
    public static void printList(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }


}
