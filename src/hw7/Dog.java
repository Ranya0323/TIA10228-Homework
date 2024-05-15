package hw7;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
	
	public Dog(String name) {
		super(name);
	}
	
	public void speak() {
		super.speak();
		System.out.println("This is Dog " + name + " speaking.");
	}
}
