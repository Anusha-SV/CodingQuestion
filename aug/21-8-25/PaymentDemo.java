package com.aug.TwentyOne25;


//Q4: Payment System - Method Overriding
//
//Explanation:
//- Parent class Payment has a method pay().
//- Child classes (CreditCardPayment, UpiPayment) override pay() to provide different implementations.
//- Demonstrates runtime polymorphism.

class Payment {
 public void pay(double amount) {
     System.out.println("Paying " + amount);
 }
}

class CreditCardPayment extends Payment {
 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using Credit Card");
 }
}

class UpiPayment extends Payment {
 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using UPI");
 }
}

public class PaymentDemo {
 public static void main(String[] args) {
     Payment p1 = new CreditCardPayment();
     Payment p2 = new UpiPayment();

     p1.pay(1000);
     p2.pay(500);
 }
}
