package Num1;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();
        AddElement(personList);
        AddElement(personSet);

        System.out.println(personList);
        System.out.println(personSet);




    }
    private static void AddElement(Collection collection) {
        collection.add(new Person(2, "Pavel"));
        collection.add(new Person(1, "George"));
        collection.add(new Person(3, "Louise"));
    }
}


