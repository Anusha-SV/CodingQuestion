package com.aug;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person {
    String name;
    LocalDate dob; // Date of Birth

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return name + " - " + dob;
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Anusha", LocalDate.of(2000, 5, 10)));
        people.add(new Person("XYZ", LocalDate.of(1998, 8, 21)));
        people.add(new Person("ABC", LocalDate.of(2002, 12, 1)));

        // Sort by Date of Birth (oldest first)
        Collections.sort(people, Comparator.comparing(p -> p.dob));

        // Print sorted list
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
