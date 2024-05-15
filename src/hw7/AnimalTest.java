package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AnimalTest {
	public static void main(String[] args) throws Exception {
		File directory = new File("C:\\data");
        if (!directory.exists()) {
            directory.mkdirs();
        }
        
        File file = new File("C:\\data\\Object.ser");
        
        Animal animal [] = new Animal [4];
        animal[0] = new Cat("湯姆貓");
        animal[1] = new Cat("加菲貓");
        animal[2] = new Dog("史努比");
        animal[3] = new Dog("新八");
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(int i = 0; i < animal.length; i++) {
			oos.writeObject(animal[i]);
		}
		
		oos.close();
		fos.close();
		
		System.out.println("==========檔案寫入===========");
		
		FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        for (int j = 0; j < animal.length; j++) {
        	animal[j] = (Animal) ois.readObject();
        }
        
        for (Animal pet : animal) {
            pet.speak();
        }
        
        ois.close();
        fis.close();
        
	}
}
