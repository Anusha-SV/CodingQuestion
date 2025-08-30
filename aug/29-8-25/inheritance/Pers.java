package com.aug.inheritance;

// Parent class
public class Pers {
    protected String name;
    protected int age;

    public Pers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
