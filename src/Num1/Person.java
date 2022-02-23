package Num1;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private int id;
    private String name;

    public Person(int id) {
        this.id = id;
        name = "George";
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Num1.Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Person o) {
        if (this.id > o.getId())return 1;
        else if (this.id < o.getId()) return -1;
        else return 0;
    }
}
