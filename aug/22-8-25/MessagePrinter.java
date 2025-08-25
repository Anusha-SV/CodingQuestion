package com.aug.Twentytwo;
/*1. Create a class MessagePrinter with a method printMessage(String name) which prints the message "hello <name>".
 * */

public class MessagePrinter {

	public void PrintMessage(String name) {
		System.out.println("hello " + name);

	}
public static void main(String args[]) {
	MessagePrinter m = new MessagePrinter();
	m.PrintMessage("Anusha");
}
}
