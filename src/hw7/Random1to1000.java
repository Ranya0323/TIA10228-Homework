package hw7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Random1to1000 {
	public static void main(String[] args) throws IOException {
		Set set = new HashSet();
		
		while(set.size() != 10) {
			int random = (int) ((Math.random()*1000) + 1);
			set.add(random);
		}
		
		File outputFile = new File("C:\\javawork\\Data.txt");
		outputFile.createNewFile();
		FileWriter out = new FileWriter(outputFile,true);
			
		Iterator objs = set.iterator();
		while(objs.hasNext()) {
			out.write(objs.next() + "\t");
		}
		
		out.close();
		System.out.println("數字已成功寫入到 Data.txt 檔案中。");
	}
}
