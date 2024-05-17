package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListHomework {
	
	public static void main(String[] args) {
		List <Object>collection = new ArrayList<>();
		collection.add(100);
		collection.add(3.14);
		collection.add(21L);
		collection.add(new Short("100"));
		collection.add("Kitty");
		collection.add(100);
		collection.add(new Object()); 
		collection.add("Snoopy");
		collection.add(new BigInteger("1000"));
		
		for(int i = 0; i < collection.size(); i++) {
			System.out.println(collection.get(i));
		}
		System.out.println("-----------------------------");
		
		Iterator objs = collection.iterator();
		while(objs.hasNext())
			System.out.println(objs.next());
		
		System.out.println("-----------------------------");
		
		for (Object SH : collection) {
			System.out.println(SH);
		}
		
		System.out.println("-----------------------------");
		
		Iterator ban = collection.iterator();
		while(ban.hasNext()) {
			Object obj = ban.next();
			if(!(obj instanceof Number)) {
				ban.remove();
			}
		}
		
		for (Object check : collection) {
            System.out.println(check);
        }
		
	}
	
}
