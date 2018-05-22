package com.infotech.myinterfaces;

public interface B {
	// default method, providing default implementation
	default public String displayGreeting() {
		return "Hello from Interface B";
	}
}