package com.infotech.myinterfaces;

public interface A {
	int method1();

	// default method, providing default implementation
	default public String displayGreeting() {
		return "Hello from interface A";
	}
}