package Num1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();


        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> union = new HashSet<>(set1);
        //union.addAll(set2); //- объединение двух сетов(листов)
        //union.retainAll(set2); //- сохрани, удерживай только общие данные
        //union.removeAll(set2); //- удали все общие данные
        System.out.println(union);
    }
    public static void TestSet(Set<String> set){
        set.add("Z");
        set.add("A");
        set.add("D");
        set.add("C");

        for (String name: set) System.out.println(name);
        System.out.println("________");
    }
}