package com.aug.TwentyOne25;


//Q10: Book - toString() Overriding
//
//Explanation:
//- Overriding toString() allows printing objects directly in a meaningful way.

class Book {
 String title;
 String author;

 public Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 @Override
 public String toString() {
     return "Book: " + title + " by " + author;
 }
}

public class BookDemo {
 public static void main(String[] args) {
     Book b1 = new Book("Java ", "James Gosling");
     Book b2 = new Book("abc Java", "Jhon");

     System.out.println(b1);
     System.out.println(b2);
 }
}
