package com.aug;

import java.util.ArrayList;


class Person{
	String name;
    int age;

   public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



public static void main(String [] args) {
	ArrayList<Person> people = new ArrayList<>();
    people.add(new Person("anusha", 23));
    people.add(new Person("xyz", 25));
    people.add(new Person("abc", 35));
    


    for (int i = 0; i < people.size() - 1; i++) {
        for (int j = 0; j < people.size() - i - 1; j++) {
            if (people.get(j).age > people.get(j + 1).age) {
                Person temp = people.get(j);
                people.set(j, people.get(j + 1));
                people.set(j + 1, temp);
            }
        }
    }
    
}
}