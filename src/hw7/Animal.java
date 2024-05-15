package hw7;

import java.io.Serializable;

public class Animal implements Serializable{
	protected String name;
	
	public Animal (String name) {
		this.name = name;
	}
	
	public void speak() {
//		System.out.println("This is " + name + " speaking.");
	}
}
