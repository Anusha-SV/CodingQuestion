package com.aug.TwentyEight;

/*
Q3: Create a Ticket class with ticketId, passengerName, and price.
Provide methods to book ticket and display details.
Demonstrates object creation and state modification.
*/
class Ticket {
    int ticketId;
    String passengerName;
    double price;

    Ticket(int ticketId, String passengerName, double price) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.price = price;
    }

    void display() {
        System.out.println("TicketID: " + ticketId + ", Passenger: " + passengerName + ", Price: " + price);
    }

    public static void main(String[] args) {
        Ticket t1 = new Ticket(101, "Anusha", 250.50);
        Ticket t2 = new Ticket(102, "Ashu", 300.75);

        t1.display();
        t2.display();
    }
}
