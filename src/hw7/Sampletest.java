package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sampletest {
	public static void main(String[] args) {
		int charCount = 0;
		int lineCount = 0;
		try {
			File f1 = new File("C:\\javawork\\Sample.txt");
			long a = f1.length();
			
			FileReader fr = new FileReader("C:\\javawork\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while((str = br.readLine()) != null){
				lineCount++;
				charCount += str.length();
				System.out.println(str);
		}
			
			System.out.printf("Sample.txt 檔案共有 %d個位元組, %d個字元, %d列資料",a,charCount+lineCount,lineCount);
			
			br.close();   
			fr.close();
		}catch(IOException e){}
	}
}
