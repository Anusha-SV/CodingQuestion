package com.aug.TwentyOne25;

//Q11: Library - Composition
//
//Explanation:
//- Composition means one class contains another.
//- Library contains Books.

class Library {
 String name;
 Books books; // composition

 public Library(String name, Books b) {
     this.name = name;
     this.books = b;
 }

 public void showLibrary() {
     System.out.println("Library: " + name + " has " + books);
 }
}

class Books {
 String title;

 public Books(String title) {
     this.title = title;
 }

 @Override
 public String toString() {
     return "Book: " + title;
 }
}

public class LibraryDemo {
 public static void main(String[] args) {
     Books b = new Books("Java OOPs");
     Library lib = new Library("City Library", b);
     lib.showLibrary();
 }
}
