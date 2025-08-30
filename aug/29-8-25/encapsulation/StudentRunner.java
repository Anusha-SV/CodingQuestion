package com.aug.encapsulation;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter mark1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter mark3: ");
        int m3 = sc.nextInt();

        Student s = new Student(name, m1, m2, m3);
        s.displayResult();

        sc.close();
    }
}
