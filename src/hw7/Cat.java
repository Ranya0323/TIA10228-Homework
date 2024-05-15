package hw7;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
	
	public Cat(String name) {
		super(name);
	}

	public void speak() {
		super.speak();
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
