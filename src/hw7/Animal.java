package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Animal {
	public static void main(String[] args) throws Exception {
		File directory = new File("C:\\data");
        if (!directory.exists()) {
            directory.mkdirs();
        }
        
        File file = new File("C:\\data\\Object.ser");
		Cat cat = new Cat("湯姆貓");
		Dog dog = new Dog("小黃");
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(cat);
		oos.writeObject(dog);
		
		oos.close();
		fos.close();
		
		
	}
}
