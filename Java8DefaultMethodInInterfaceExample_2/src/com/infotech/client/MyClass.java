package com.infotech.client;

import com.infotech.myinterfaces.A;
import com.infotech.myinterfaces.B;

public class MyClass implements A, B {
	// provides implementation for the non-default method of the interface
	@Override
	public int method1() {
		return 20;
	}

	@Override
	// Overriding the default method of MyInterface
	public String displayGreeting() {
		//return "Hello from MyClass";
		//return A.super.displayGreeting();
		return B.super.displayGreeting();
	}

	public static void main(String[] args) {
		A myInt = new MyClass();
		System.out.println("Value: " + myInt.method1());
		// Calls the default method provided by interface itself
		System.out.println("Greeting: " + myInt.displayGreeting());
	}
}