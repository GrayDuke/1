package March;
//Лямбда-выражения часть2
import java.util.*;
import java.util.stream.Collectors;

/**
 *  @author Pavel Sergeev
 */
public class March2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        FillArr(arr);
        FillList(list);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);

//        for (int i = 0; i < 10; i++) {
//            arr[i] = arr[i]*2;
//            list.set(i, list.get(i)*2);
//        }
        //Map method
        arr = Arrays.stream(arr).map(a -> a *2).toArray();
        list = list.stream().map(a -> a*2).collect(Collectors.toList());
        System.out.println("After changes:");
        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        System.out.println("\nPart 2");
        arr = Arrays.stream(arr).map(a->3).toArray();
        System.out.println(Arrays.toString(arr));

        //Filter method
        System.out.println("\nPart 3");
        int[] arr2 = new int[10];
        FillArr(arr2);
        List<Integer> list2 = new ArrayList<>();
        FillList(list2);

        arr2=Arrays.stream(arr2).filter(a->a%2==0).toArray();
        list2 = list2.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);
        //forEach method
        Arrays.stream(arr2).forEach(System.out::print);
        System.out.println();
        list2.stream().forEach(System.out::print);

        //reduce
        System.out.println("\n\nPart 4");
        int[] arr3 = new int[10];
        FillArr(arr3);
        List<Integer> list3 = new ArrayList<>();
        FillList(list3);

        System.out.println(Arrays.stream(arr3).reduce((acc, a)->{
            acc= acc+a;
            System.out.print(acc+" ");
            return acc;
        }).getAsInt());
        System.out.println(list3.stream().reduce((acc,a)->acc*a).get());

        //Set
        System.out.println("\nPart 5");
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(6);
        System.out.println(set);
        System.out.println(set.stream().map(a->a*3).collect(Collectors.toSet()));

    }

    private static void FillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
    }

    private static void FillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i+1;
        }
    }
}
