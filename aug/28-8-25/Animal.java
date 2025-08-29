package com.aug.TwentyEight;

/*
Q2: Create base class Animal with method sound().
Create subclasses Dog and Cat that override sound().
Demonstrates runtime polymorphism.
*/
class Animal {
    void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow Meow!");
    }
}

class AnimalDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // Runtime polymorphism: method called depends on object type
        a1.sound();
        a2.sound();
    }
}
