package com.aug.TwentyEight;

/*
Q2: Create a TemperatureConverter class with methods to convert Celsius to Fahrenheit and vice versa.
Demonstrates method creation and reusability.
*/
class TemperatureConverter {
    // Celsius to Fahrenheit
    double cToF(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Fahrenheit to Celsius
    double fToC(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println("25°C = " + tc.cToF(25) + "°F");
        System.out.println("77°F = " + tc.fToC(77) + "°C");
    }
}
