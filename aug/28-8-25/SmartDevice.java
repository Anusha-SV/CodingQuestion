package com.aug.TwentyEight;

/*
Q4: Create SmartDevice class with deviceName and status (on/off).
Provide methods to turn on, turn off, and check status.
Demonstrates encapsulation and state management.
*/
class SmartDevice {
    String deviceName;
    boolean isOn;

    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    void turnOn() {
        isOn = true;
        System.out.println(deviceName + " is turned ON");
    }

    void turnOff() {
        isOn = false;
        System.out.println(deviceName + " is turned OFF");
    }

    void status() {
        System.out.println(deviceName + " status: " + (isOn ? "ON" : "OFF"));
    }

    public static void main(String[] args) {
        SmartDevice sd = new SmartDevice("Smart Lamp");
        sd.status();
        sd.turnOn();
        sd.status();
        sd.turnOff();
        sd.status();
    }
}
