package Num1;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "George");
        Person person2 = new Person(1, "George");

        map.put(person1, 8);
        map.put(person2,6);

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);

    }
}
