package com.aug.TwentyEight;

/*
Q6: Create a Car class with brand, model, speed.
Provide methods to start, stop, and display current speed.
*/
class Car {
    String brand;
    String model;
    int speed;

    // Constructor
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    // Start the car
    void start() {
        speed = 10;
        System.out.println(model + " started. Speed: " + speed + " km/h");
    }

    // Stop the car
    void stop() {
        speed = 0;
        System.out.println(model + " stopped.");
    }

    void displaySpeed() {
        System.out.println("Current speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        car.start();
        car.displaySpeed();
        car.stop();
    }
}
