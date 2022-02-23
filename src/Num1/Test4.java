package Num1;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test4 {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);

        Queue<Person> personQueue= new ArrayBlockingQueue<>(2) {
        };

        personQueue.add(person2);
        personQueue.offer(person3);
        personQueue.offer(person1);
        System.out.println(personQueue);

        personQueue.remove();
        System.out.println(personQueue);
        System.out.println(personQueue.poll() + " : " + personQueue);
        System.out.println(personQueue.peek());
        System.out.println(personQueue.element());



    }
}
