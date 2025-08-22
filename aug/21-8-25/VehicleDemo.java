package com.aug.TwentyOne25;


//Q5: Vehicle - Abstraction
//
//Explanation:
//- Abstract class Vehicle defines abstract method start().
//- Car and Bike extend Vehicle and provide their own implementation of start().

abstract class Vehicle {
 abstract void start(); // abstract method
}

class Car extends Vehicle {
 @Override
 void start() {
     System.out.println("Car starts with a key.");
 }
}

class Bike extends Vehicle {
 @Override
 void start() {
     System.out.println("Bike starts with a button.");
 }
}

public class VehicleDemo {
 public static void main(String[] args) {
     Vehicle v1 = new Car();
     Vehicle v2 = new Bike();

     v1.start();
     v2.start();
 }
}
