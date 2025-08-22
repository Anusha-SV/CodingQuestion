package com.aug.TwentyOne25;


//Q6: Smart Devices - Interface
//
//Explanation:
//- Interface Device declares methods turnOn() and turnOff().
//- Light and Fan implement the interface differently.

interface Device {
 void turnOn();
 void turnOff();
}

class Light implements Device {
 public void turnOn() {
     System.out.println("Light turned ON");
 }
 public void turnOff() {
     System.out.println("Light turned OFF");
 }
}

class Fan implements Device {
 public void turnOn() {
     System.out.println("Fan started");
 }
 public void turnOff() {
     System.out.println("Fan stopped");
 }
}

public class DeviceDemo {
 public static void main(String[] args) {
     Device d1 = new Light();
     Device d2 = new Fan();

     d1.turnOn();
     d1.turnOff();

     d2.turnOn();
     d2.turnOff();
 }
}
